> [!CAUTION]
> Don't use the version `3.0.x` for projects!
> This version is only for developing and testing the release process with
> GitHub Actions.
> The next stable release will be version `3.1.x`.

# General Parent

This project only contains the default properties and settings, which should be
used in all projects of ChrissW-R1.

## Status

| Type              | Status                                                                                                                                                                                                                                                               |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Build (CI)        | [![Maven Build](https://github.com/ChrissW-R1/general-parent/actions/workflows/maven-build.yml/badge.svg)](https://github.com/ChrissW-R1/general-parent/actions/workflows/maven-build.yml) |
| Artifacts         | [![Maven Central](https://img.shields.io/maven-central/v/me.chrissw-r1/general-parent)](https://central.sonatype.com/artifact/me.chrissw-r1/general-parent)                                                          |
| JavaDoc           | [![JavaDoc](https://javadoc.io/badge/me.chrissw-r1/general-parent.svg)](https://javadoc.io/doc/me.chrissw-r1/general-parent)                                                                                         |
| OpenSSF Scorecard | [![OpenSSF Scorecard](https://api.scorecard.dev/projects/github.com/ChrissW-R1/general-parent/badge)](https://scorecard.dev/viewer/?uri=github.com/ChrissW-R1/general-parent)              |

## Usage

To use this in one of your projects, you only have to define some settings in
your POM:

At First, set the parent to the project type parent. Example as a Java Project:
```XML
<parent>
	<groupId>me.chrissw-r1</groupId>
	<artifactId>java-parent</artifactId>
	<version>3.0.33</version>
</parent>
```

Last but not least some technical properties have to be overridden by your POM
to set all derived properties correctly:
```XML
<properties>
	...
	<project.module-root.relativedir>./</project.module-root.relativedir>
	<project.module-root.artifactId>{your-top-project-artifactId}</project.module-root.artifactId>
	...
</properties>
```

## License

The usage of this project for other downstream projects is allowed without any
restrictions. Any code and software parts are licensed under Apache 2.0. For
more information see the [license file](LICENSE). The documentation and any
other non-code parts are licensed under
the [Creative Commons Attribution 4.0 International License (CC BY 4.0)](https://creativecommons.org/licenses/by/4.0/).
