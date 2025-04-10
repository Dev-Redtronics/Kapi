import dev.redtronics.buildSrc.Project
import java.time.Year

plugins {
    org.jetbrains.dokka
}

public val projectModuleName: String = project.name.replaceFirstChar { it.uppercase() }
dokka {
    moduleName.set(projectModuleName)

    dokkaPublications.html {
        includes.from("README.md")
    }

    pluginsConfiguration.html {
        footerMessage.set("Copyright © ${Project.INCEPTION_YEAR}-${Year.now()} Nils Jaekel")
    }
}
