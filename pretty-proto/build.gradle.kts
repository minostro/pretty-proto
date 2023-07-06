plugins {
  kotlin("multiplatform")
  id("com.vanniktech.maven.publish.base")
}

kotlin {
  js {
    browser
  }
  jvm {
  }

  sourceSets {
    commonMain {
      dependencies {
        api(kotlin("stdlib-common"))
      }
    }
    commonTest {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
      }
    }
    val jvmMain by getting {
      dependencies {
        api(kotlin("stdlib"))
      }
    }
    js().compilations["main"].defaultSourceSet {
      dependencies {
        api(kotlin("stdlib-js"))
      }
    }
    js().compilations["test"].defaultSourceSet {
      dependencies {
        implementation(kotlin("test-js"))
      }
    }
  }
}