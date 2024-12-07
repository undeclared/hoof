package com.playfulprogramming.cms.config

interface EnvConfig {
    val apiUrl: String
    val clientUrl: String
    val s3PublicUrl: String

    val postgresUrl: String
    val postgresUser: String
    val postgresPassword: String
}

class EnvConfigImpl : EnvConfig {
    override val apiUrl: String = System.getenv("VITE_API_URL")
    override val clientUrl: String = System.getenv("VITE_CLIENT_URL")
    override val s3PublicUrl: String = System.getenv("S3_PUBLIC_URL")

    override val postgresUrl: String = System.getenv("POSTGRES_URL")
    override val postgresUser: String = System.getenv("POSTGRES_USER")
    override val postgresPassword: String = System.getenv("POSTGRES_PASSWORD")
}
