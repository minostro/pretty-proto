Releasing
=========

### Prerequisite: Sonatype (Maven Central) Account

Create an account on the [Sonatype issues site][sonatype_issues]. Ask an existing publisher to open
an issue requesting publishing permissions for `com.squareup` projects.


Cutting a release
---------------------

1. Set versions:

    ```
    export RELEASE_VERSION=X.Y.Z
    ```

2. Update versions:

    ```
    sed -i "" \
      "s/VERSION_NAME=.*/VERSION_NAME=$RELEASE_VERSION/g" \
      `find . -name "gradle.properties"`
    ```

3. Publish

    ```
    ./gradlew clean publishAllPublicationsToInternalRepository --no-parallel --no-daemon
    ```
