# General Parent

This project only contains the default properties and settings, which should be
used in all projects of ChrissW-R1.

![build status](https://github.com/ChrissW-R1/general-parent/actions/workflows/maven-build.yml/badge.svg)

## Usage

To use this in one of your projects, you only have to define some settings in
your POM:

First, add the repository:
```XML
<repositories>
	...
	<repository>
		<id>general-parent</id>
		<name>General Parent</name>
		<url>https://maven.pkg.github.com/ChrissW-R1/general-parent</url>
	</repository>
	...
</repositories>
```

Secondly, set the parent to the project type parent. Example as a Java Project:
```XML
<parent>
	<groupId>me.chrisswr1</groupId>
	<artifactId>java-parent</artifactId>
	<version>2.4.0-SNAPSHOT</version>
</parent>
```

Last but not least a property have to be overridden by your POM to set all path
in project correctly:
```XML
<properties>
	...
	<project.module-root.relativedir>./</project.module-root.relativedir>
	...
</properties>
```

## License

The usage of this project for other downstream projects is allowed without any
restrictions. Any code and software parts are licensed under Apache 2.0. For
more information see the [license file](LICENSE). The documentation and any
other non-code parts are licensed under
the [Creative Commons Attribution 4.0 International License (CC BY 4.0)](https://creativecommons.org/licenses/by/4.0/).
