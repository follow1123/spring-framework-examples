plugins {
    id("java")
}

allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"
}


subprojects {

    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        // https://mvnrepository.com/artifact/org.springframework/spring-context
        implementation("org.springframework:spring-context:6.2.6")
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }

    tasks.test {
        useJUnitPlatform()
    }
}
