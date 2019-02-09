plugins {
    id("war")
}

war {
    webAppDirName = "public/"
}

tasks.war {
    destinationDirectory.set(file("build/"))
    archiveFileName.set("web.war")
}

tasks.wrapper {
    gradleVersion = "5.2"
    distributionType = Wrapper.DistributionType.ALL
}
