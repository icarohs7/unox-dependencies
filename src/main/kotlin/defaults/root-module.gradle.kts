package defaults

allprojects {
    repositories {
        google()
        maven("http://devrepo.kakao.com:8088/nexus/content/groups/public/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://kotlin.bintray.com/kotlinx")
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/icarohs7/libraries")
        maven("https://jitpack.io")
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}