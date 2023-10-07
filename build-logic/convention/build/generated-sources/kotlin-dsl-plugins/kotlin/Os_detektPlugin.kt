/**
 * Precompiled [os.detekt.gradle.kts][Os_detekt_gradle] script plugin.
 *
 * @see Os_detekt_gradle
 */
public
class Os_detektPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Os_detekt_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
