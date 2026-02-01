# Contributing to General Parent

First off, thanks for taking the time to contribute! ❤️

All types of contributions are encouraged and valued.
See the [Table of Contents](#table-of-contents) for different ways to help and
details about how this project handles them. Please make sure to read the
relevant section before making your contribution. It will make it a lot easier
for us maintainers and smooth out the experience for all involved. The community
looks forward to your contributions. 🎉

## Table of Contents

- [Project scope](#project-scope)
- [Code of Conduct](#code-of-conduct)
- [Versioning](#versioning)
- [I have a question](#i-have-a-question)
- [I want to contribute](#i-want-to-contribute)
- [Reporting bugs](#reporting-bugs)
- [Suggesting enhancements](#suggesting-enhancements)
- [Your first code contribution](#your-first-code-contribution)
- [Improving the documentation](#improving-the-documentation)
- [Styleguides](#styleguides)
- [Commit messages](#commit-messages)
- [Join the project team](#join-the-project-team)

## Project scope

This repository provides parent POMs and shared build configuration intended to
be reused by multiple downstream projects.

Changes to this project can therefore have wide-ranging effects. Please consider
compatibility, default behavior, and migration impact carefully when proposing
changes.

## Code of Conduct

This project and everyone participating in it is governed by
the [Code of Conduct](CODE_OF_CONDUCT.md).
By participating, you are expected to uphold this code.

## Versioning

The Versioning Policy could be found in the [VERSIONING.md](VERSIONING.md) file.

Contributors must consider the impact of their changes on downstream projects:

- Breaking changes require a **major version bump**
- New backward-compatible features require a **minor version bump**
- Bug fixes only require a **patch version bump**

Any change that affects default behavior, enforced build rules, plugin
configuration, or dependency management may be considered a breaking change and
must be clearly documented.

If you are unsure whether a change is breaking, please open an issue for
discussion before submitting a pull request.

## I have a question

Before you ask a question, it is best to search for
existing [Issues](https://github.com/ChrissW-R1/general-parent/issues) that might help you. In case
you have found a suitable issue and still need clarification, you can write your
question in this issue. It is also advisable to search the internet for answers
first.

If you then still feel the need to ask a question and need clarification, we
recommend the following:

- Open an [Issue](${project.issueManagement.url.create).
- Provide as much context as you can about what you're running into.
- Provide project and platform versions (nodejs, npm, etc), depending on what
  seems relevant.

We will then take care of the issue as soon as possible.

## I want to contribute

> ### Legal notice
> When contributing to this project, you must agree that you have authored 100%
> of the content, that you have the necessary rights to the content and that the
> content you contribute may be provided under the project license.

### Reporting bugs

#### Before submitting a bug report

A good bug report shouldn't leave others needing to chase you up for more
information. Therefore, we ask you to investigate carefully, collect information
and describe the issue in detail in your report. Please complete the following
steps in advance to help us fix any potential bug as fast as possible.

- Make sure that you are using the latest version.
- Determine if your bug is really a bug and not an error on your side e.g. using
  incompatible environment components/versions (Make sure that you have read
  the [Read Me](README.md). If you are looking for support, you might want to
  check [this section](#i-have-a-question)).
- To see if other users have experienced (and potentially already solved) the
  same issue you are having, check if there is not already a bug report existing
  for your bug or error in
  the [bug tracker](https://github.com/ChrissW-R1/general-parent/issues?q=label%3Abug).
- Also make sure to search the internet (including Stack Overflow) to see if
  users outside the GitHub community have discussed the issue.
- Collect information about the bug:
- Stack trace (Traceback)
- OS, Platform and Version (Windows, Linux, macOS, x86, ARM)
- Version of the interpreter, compiler, SDK, runtime environment, package
  manager, depending on what seems relevant.
- Possibly your input and the output
- Can you reliably reproduce the issue? And can you also reproduce it with older
  versions?
- URL to the source code of your child project (if applicable)

#### How do I submit a good bug report?

> You must never report security related issues, vulnerabilities or bugs
> including sensitive information via the public issue tracker or in any public
> forum.
>
> For responsible disclosure and reporting instructions, refer to the
> project’s [SECURITY.md](SECURITY.md).

We use GitHub issues to track bugs and errors. If you run into an issue with the
project:

- Open an [Issue](${project.issueManagement.url.create).
  (Since we can't be sure at this point whether it
  is a bug or not, we ask you not to talk about a bug yet and not to label the
  issue.)
- Explain the behavior you would expect and the actual behavior.
- Please provide as much context as possible and describe the *reproduction
  steps* that someone else can follow to recreate the issue on their own. This
  usually includes your code. For good bug reports you should isolate the
  problem and create a reduced test case.
- Provide the information you collected in the previous section.

Once it's filed:

- The project team will label the issue accordingly.
- A team member will try to reproduce the issue with your provided steps. If
  there are no reproduction steps or no obvious way to reproduce the issue, the
  team will ask you for those steps and mark the issue as `needs-repro`. Bugs
  with the `needs-repro` tag will not be addressed until they are reproduced.
- If the team is able to reproduce the issue, it will be marked `needs-fix`, as
  well as possibly other tags (such as `critical`), and the issue will be left
  to be [implemented by someone](#your-first-code-contribution).

### Suggesting enhancements

This section guides you through submitting an enhancement suggestion for
`CONTRIBUTING.md`, **including completely new features and minor improvements to
existing functionality**. Following these guidelines will help maintainers and
the community to understand your suggestion and find related suggestions.

#### Before submitting an enhancement

- Make sure that you are using the latest version.
- Read the [Read Me](README.md) carefully and find out if the functionality is
  already covered, maybe by an individual configuration.
- Perform a [search](https://github.com/ChrissW-R1/general-parent/issues) to see if the enhancement
  has already been suggested. If it has, add a comment to the existing issue
  instead of opening a new one.
- Find out whether your idea fits with the scope and aims of the project. It's
  up to you to make a strong case to convince the project's developers of the
  merits of this feature. Keep in mind that we want features that will be useful
  to the majority of our users and not just a small subset. If you're just
  targeting a minority of users, consider writing an add-on/plugin library.

#### How do I submit a good enhancement suggestion?

Enhancement suggestions are tracked
as [GitHub issues](https://github.com/ChrissW-R1/general-parent/issues).

- Use a **clear and descriptive title** for the issue to identify the
  suggestion.
- Provide a **step-by-step description of the suggested enhancement** in as many
  details as possible.
- **Describe the current behavior** and **explain which behavior you expected to
  see instead** and why. At this point you can also tell which alternatives do
  not work for you.
- You may want to **include screenshots and animated GIFs** which help you
  demonstrate the steps or point out the part which the suggestion is related
  to.
- **Explain why this enhancement would be useful** to most CONTRIBUTING.md
  users. You may also want to point out the other projects that solved it better
  and which could serve as inspiration.

### Breaking changes

Any change that alters default build behavior, plugin configuration, dependency
versions, or enforced rules may be considered a breaking change.

Breaking changes must be clearly documented in the pull request description and,
if accepted, will typically require a major version bump.

### Commits and pull requests

- Commit **MUST** be signed, except for automated commits by bots
- Issues and pull requests addressing security issues **MUST** carry the
  `security` label
- Keep commits focused and logically structured
- Avoid mixing refactoring, formatting, and functional changes
- Pull requests should explain the motivation and impact of the change

#### Commit message rules

- Commit messages **MUST** follow
  the [Conventional Commits](https://conventionalcommits.org) specification
- The commit message **MUST** be written in English
- The description of a commit message, which deals with bugfixes **MUST** start
  with `{ISSUE_ID}: `
- If the commit addresses a security issue with an OSV identifier, the
  description **MUST** begin with `{OSV_ID}: `
- In case of multiple issues being addressed, all issue identifiers and OSV
  identifiers **MUST** be listed, separated by commas in the body and the main
  identifier **MUST** be used at the start of the description
- automatic commits by bots only **SHOULD** follow the above rules if possible

Example subject line of a commit message:
`fix(api): #42: resolves null pointer exception in module XYZ`

### Your first code contribution

### Improving the documentation

## Styleguides

### Commit messages

## Join the project team

## Attribution

This guide is based on the **contributing.md
**. [Make your own](https://contributing.md)!
