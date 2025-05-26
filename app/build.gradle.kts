plugins {
    application
    kotlin("jvm") version "2.1.21"
}

dependencies {
    implementation(libs.bundles.kotlinxEcosystem)
}

application {
    mainClass = "buchanan.bryce.app.AppKt"
}
