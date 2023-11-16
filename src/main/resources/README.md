# General Parent

This project only contains the default properties and settings, which should be
used in all projects of ChrissW-R1.


[![pipeline status](https://gitlab.com/ChrissW-R1/general-parent/badges/main/pipeline.svg)](https://gitlab.com/ChrissW-R1/general-parent/-/commits/main)

## Usage

To use this in one of your projects, you only have to define some settings in
your POM:

First, add the repository:
```XML
<repositories>
	...
	<repository>
		<id>${project.module-root.artifactId}</id>
		<name>General Parent</name>
		<url>https://gitlab.com/api/v4/projects/25831549/packages/maven</url>
	</repository>
	...
</repositories>
```

Secondly, set the parent to the project type parent. Example as a Java Project:
```XML
<parent>
	<groupId>${project.groupId}</groupId>
	<artifactId>java-parent</artifactId>
	<version>${project.version}</version>
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
the [Creative Commons Attribution 4.0 International License (CC BY 4.0)](https://creativecommons.org/licenses/by/4.0/)
.
