plugins {
    id("finch.kotlin")
    application
}

dependencies {
    implementation(project(":finch-kotlin"))
}

application {
    mainClass = "com.tryfinch.api.example.MainKt"
}
