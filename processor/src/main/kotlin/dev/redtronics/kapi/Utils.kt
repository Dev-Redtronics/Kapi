package dev.redtronics.kapi

import com.google.devtools.ksp.KspExperimental
import com.google.devtools.ksp.getAnnotationsByType
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.symbol.KSAnnotated

internal inline fun <reified T : Annotation> Resolver.getSymbolsWithAnnotation(indepth: Boolean = false): Sequence<KSAnnotated> {
    return getSymbolsWithAnnotation(T::class.qualifiedName!!, indepth)
}

@OptIn(KspExperimental::class)
internal inline fun <reified T : Annotation> KSAnnotated.getAnnotationByType() = getAnnotationsByType(T::class)
