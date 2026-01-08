# Security Policy

## Supported Versions

The following table shows which versions of this project are provided with
security updates:

| Version | Status   |
|---------|----------|
| 3.0.x   | ✅ Active |
| 2.4.x   | ✅ EOL    |
| < 2.4   | ❌ EOS    |

- Active: are actively under development and will receive any updates
- EOL: End of Life, will only receive bug and security fixes
- EOS: End of Support, are closed and will no longer receive any updates

## Common Platform Enumeration (CPE)

**No official CPE** has been assigned yet.

For reference and internal tracking purposes, the following proposed CPE may be
used until an official assignment is made:
`cpe:2.3:a:${project.organization.id}:${project.module-root.artifactId}:${project.version}:*:*:*:*:*:*:*`
This identifier is not authoritative and has not been registered with the
National Vulnerability Database (NVD). It is provided solely as a stable
reference to support vulnerability discussions, SBOM metadata, and coordination
with security researchers.

The project is prepared to work with CVE and NVD processes, and a CPE will be
proposed once the project reaches a stage where an official enumeration is
appropriate, for example when it becomes referenced in vulnerability disclosures
or relevant security databases. Until such a CPE is assigned, the project is
primarily identified using its canonical coordinates (e.g. Maven coordinates and
Package URLs in generated SBOMs).

If a security vulnerability is discovered that warrants a CVE assignment, the
maintainers will cooperate with the relevant CNA(s) and vulnerability databases
to ensure proper classification, tracking, and disclosure. Once a CPE is
officially assigned, it will be documented here and incorporated into the
project’s security metadata and SBOMs where applicable.

## Reporting a Vulnerability

Please report security issues privately and **do not** open a public issue.
To do so, please use the appropriate function on GitHub:

https://github.com/ChrissW-R1/general-parent/security/advisories

Include as much of the following as possible:

- Affected module(s) and versions/branches
- Steps to reproduce / proof of concept
- Impact assessment
- Any suggested fix or mitigation

## Response Timeline

We aim to:

- acknowledge within **2 business days**
- provide an initial assessment within **7 business days**
- publish a fix as soon as reasonably possible, depending on severity and
  complexity

## Coordinated Disclosure

We follow coordinated vulnerability disclosure.
Please allow a reasonable time window for investigation and remediation before
public disclosure.

We support the responsible publication of vulnerability even beyond the actual
remediation. This may include - especially in the context of open-source
projects - technical exchanges and the provision of background information for
conferences, publications or presentations, provided that these serve to improve
security. We expressly welcome prior consultation in this regard.
