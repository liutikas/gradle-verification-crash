plugins {
    java
}

dependencies {
    implementation("com.google.auto:auto-parent:7")
    implementation("com.google.auto.value:auto-value-annotations:1.6.3")
    implementation("com.google.auto.value:auto-value-parent:1.6.3")
    implementation("com.googlecode.java-diff-utils:diffutils:1.3.0")
    implementation("com.google.errorprone:error_prone_annotations:2.3.1")
    implementation("junit:junit:4.11")
    implementation("junit:junit:4.12")
    implementation("com.google.truth:truth:1.0")
    implementation("com.google.truth:truth-parent:1.0")
}

repositories {
    mavenCentral()
    google()
}