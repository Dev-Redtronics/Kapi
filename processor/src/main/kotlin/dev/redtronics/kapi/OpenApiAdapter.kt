package dev.redtronics.kapi

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration

public class OpenApiProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        environment.logger.info("OpenApiProvider created")
        return OpenApiProcessor(environment.logger, environment.codeGenerator)
    }
}

private class OpenApiProcessor(
    private val logger: KSPLogger,
    private val codeGenerator: CodeGenerator
) : SymbolProcessor {
    override fun process(resolver: Resolver): List<KSAnnotated> {
        val symbolsWithAnnotations = resolver.getSymbolsWithAnnotation<OpenApi>()
        when(symbolsWithAnnotations.count()) {
            0 -> {
                logger.warn("No OpenApi annotation found, skipping generation")
                return emptyList()
            }
            1 -> logger.info("Found OpenApi annotation")
            else -> logger.error("Found multiple OpenApi annotations, only one is allowed")
        }

        val symbol = symbolsWithAnnotations
            .onEach { if (it !is KSClassDeclaration) logger.warn("Found annotation with wrong target", symbol = it) }
            .filterIsInstance<KSClassDeclaration>()
            .first()

        processGeneration(symbol)
        return emptyList()
    }

    private fun processGeneration(symbol: KSClassDeclaration) {
        val openApi = getOpenApiConfiguration(symbol)
        logger.error(openApi.spec)
    }

    private fun getOpenApiConfiguration(symbol: KSClassDeclaration): OpenApi {
        return symbol.getAnnotationByType<OpenApi>().first()
    }
}

private fun <T> Sequence<T>.isEmpty(): Boolean {
    try {
        this.count()
        return false
    } catch (_: NoSuchElementException) {
        return true
    }
}
