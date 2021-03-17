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

https://www.baeldung.com/jacoco

Put the plugin within plugins in build section without pluginManagement which could be set on a parent pom.

> mvn clean test

-> observe the output but also the report saved inside site/jacoco

Add check execution for mandatory minimum coverage !
Then : 
> mvn clean verify

ex:
[ERROR] Failed to execute goal org.jacoco:jacoco-maven-plugin:0.8.6:check (jacoco-check) on project UnitTestProject: Coverage checks have not been met. See log for details. -> [Help 1]


## intelliJ

> Run with Coverage 

ex: 100% on class 50% on methods 75% on lines

## Maven

