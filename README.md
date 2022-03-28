# native-image-args
Repo to test upgrade to 0.9.11 native-maven-plugin

Upgrade to 0.9.11 fails when we use 21.2.0:

```aidl
[org.graalvm.junit.platform.NativeImageJUnitLauncher:950181]    classlist:     862.05 ms,  0.96 GB
Error: Main entry point class '@/tmp/native-image6785363509462544469args' not found.
Error: Use -H:+ReportExceptionStackTraces to print stacktrace of underlying exception
[org.graalvm.junit.platform.NativeImageJUnitLauncher:950181]      [total]:     889.01 ms,  0.96 GB
Error: Image build request failed with exit status 1


> java --version 

openjdk 11.0.12 2021-07-20
OpenJDK Runtime Environment GraalVM CE 21.2.0 (build 11.0.12+6-jvmci-21.2-b08)
```

However, using 21.3.0 is successful.