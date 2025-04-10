package dev.redtronics.kapi

@Target(AnnotationTarget.CLASS)
public annotation class OpenApi(
    public val spec: String,
    public val apiType: ApiType = ApiType.SERVER,
    public val apiTarget: ApiTarget = ApiTarget.STANDALONE,
)