Purpose of Global Tool Configuration in Jenkins

In Jenkins, the Global Tool Configuration is used to define and manage tools centrally that are required by jobs and pipelines.

In simple words:

Global Tool Configuration = one place to install and configure tools that all Jenkins jobs can reuse

Why Jenkins needs a Global Tool Configuration

Jenkins jobs often need tools like:

JDK

Git

Maven

Node.js

Docker

Gradle

Instead of installing or hard-coding paths inside every job, Jenkins lets you configure them once globally.

Then any job or pipeline can just say:

“Use this tool”
