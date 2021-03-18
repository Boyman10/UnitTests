TEST
----

# Surefire plugin

https://maven.apache.org/surefire/maven-surefire-plugin/

The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application. It generates reports in two different file formats:

Plain text files (*.txt)
XML files (*.xml)

Troubleshooting : Use <version>3.0.0-M5</version>
for Junit 5+

ex: [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

> mvn surefire-report:report-only

# Jacoco

= Test coverage

## intelliJ

> Run with Coverage 

ex: 100% on class 50% on methods 75% on lines

## Maven


https://www.baeldung.com/jacoco

Put the plugin within plugins in build section without pluginManagement which could be set on a parent pom.

> mvn clean test

-> observe the output but also the report saved inside site/jacoco

Add check execution for mandatory minimum coverage !
Then :
> mvn clean verify

ex:
[ERROR] Failed to execute goal org.jacoco:jacoco-maven-plugin:0.8.6:check (jacoco-check) on project UnitTestProject: Coverage checks have not been met. See log for details. -> [Help 1]


# CheckStyle

https://maven.apache.org/plugins/maven-checkstyle-plugin/usage.html
https://checkstyle.sourceforge.io/

add reporting section inside pom

Check styles from Google for instance. Default is sun.

>     mvn site
[INFO] There are 13 errors reported by Checkstyle 8.29 with sun_checks.xml ruleset.

http://localhost:63342/UnitTestProject/target/site/checkstyle.html

# Owasp

https://owasp.org/www-project-dependency-check/

https://jeremylong.github.io/DependencyCheck/dependency-check-maven/index.html

Aggregate within site report (reporting section)

> mvn site
 
 /target/site/dependency-check-report.html

# SpotBugs

FindBugs is no longer maintained

https://gleclaire.github.io/findbugs-maven-plugin/
https://spotbugs.github.io/

## Various goals 

https://spotbugs.github.io/spotbugs-maven-plugin/plugin-info.html

> mvn spotbugs:check
