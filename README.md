# GradleKotlinDSLSample
Implement Gradle's Kotlin DSL

Gradle’s Kotlin DSL?
(DSL: Domain-specific language) Kotlin DSL is Kotlin language support for Gradle build scripts, So it means that now you will be able to write your gradle files in Kotlin instead of Groovy

(Gradle Kotlin DSL là ngôn ngữ dành riêng cho miền được xây dựng với mục tiêu rõ ràng là xác định kế hoạch xây dựng Gradle. Điều này có tất cả các tính năng và nhiệm vụ yêu thích của bạn từ Gradle Groovy DSL, nhưng giờ đây đã có trong Kotlin.

Toàn bộ Gradle Kotlin DSL được hỗ trợ trên các IDE nhỏ hơn Groovy, nhưng Android Studio và IntelliJ IDEA hỗ trợ mọi thứ chúng tôi cần, vì vậy hầu hết các nhà phát triển Android không gặp nhiều vấn đề.)

* Reason to use kotlin scripts: 

+ Compile time error
+ Auto completion
+ Source navigation
+ Possibility to use extensions
+ You have some idea of what you are doing
+ Highly extendable

* Why type-safe build logic ?

+ Improved Developer experience
+ Authoring build logic
+ Troubleshooting build related issues
+ IDE Support
+ Shorter feedback cycle
+ Less error prone on runtime

Migrate Gradle to kotlin scripts
1. Create new android project → rename files (*.gradle ) to (*.gradle.kts) 

2. Fix error: 
- include ':app'  → include(":app") in settings.gradle.kts file

- classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version" → classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version") and more classpath same in build.gradle.kts file of root

- id 'com.android.application' → id ("com.android.application") , change ' character to (“ and “) in build.gradle.kts file of app 

3. Create module buildSrc: This will provide a basic structure to our build logic while being familiar to use inside our build files.

Video add buildSrc module:

https://caster.io/lessons/gradle-dependency-management-using-kotlin-and-buildsrc-for-buildgradle-autocomplete-in-android-studio?autoplay=true

Link:
https://antonioleiva.com/dagger-android-kotlin/

https://proandroiddev.com/sharing-build-logic-with-kotlin-dsl-203274f73013

https://proandroiddev.com/gradle-groovy-to-kotlin-dsl-in-15-minutes-d3129aff227e

https://www.youtube.com/watch?v=mAtrEPeAJSc

https://infinum.com/handbook/books/android/project-structure/kotlin-gradle-dsl
