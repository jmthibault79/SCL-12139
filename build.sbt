// minimal case for reproducing http://youtrack.jetbrains.com/issue/SCL-12139 

// navigate to org.broadinstitute.dsde.workbench.service.util.Retry
// and attempt to access sources

scalaVersion := "2.12.5"

resolvers += "artifactory-releases" at "https://broadinstitute.jfrog.io/broadinstitute/" + "libs-release"

libraryDependencies += "org.broadinstitute.dsde.workbench" %% "workbench-service-test" % "0.8-2d77c12" % "test" classifier "tests"
