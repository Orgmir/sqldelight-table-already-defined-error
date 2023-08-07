package dev.luisramos.sqldelightborked

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform