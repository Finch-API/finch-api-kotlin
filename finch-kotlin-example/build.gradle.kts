plugins {
    id("finch.kotlin")
    application
}

dependencies {
    implementation(project(":finch-kotlin-core"))
    implementation(project(":finch-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :finch-kotlin-example:run` to run `Main`
    // Use `./gradlew :finch-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.tryfinch.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
