package dev.redtronics.kapi

@Target(AnnotationTarget.CLASS)
public annotation class OpenApi(
    public val spec: String,
    public val type: ApiType = ApiType.SERVER,
    public val target: ApiTarget = ApiTarget.STANDALONE,
)