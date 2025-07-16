plugins {
    id("finch.kotlin")
    application
}

dependencies {
    implementation(project(":finch-kotlin"))
}

application {
    // Use `./gradlew :finch-kotlin-example:run` to run `Main`
    // Use `./gradlew :finch-kotlin-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "com.tryfinch.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
