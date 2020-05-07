## Algorithms in Java

### Environment Setup

* JDK 1.8 or greater
* Maven 3 or greater

### Running All Tests

```bash
$ mvn clean verify
```

### Build Allure Report

```bash
$ mvn allure:report
```

### Copy Test History To Latest Test Results
In order to see trending information of the tests you 
need to copy the history folder from the allure reports 
directory to the allure results directory.

```bash
$ cp -r allure-report/history target/allure-results/history
```
### Copy The Environment Settings To Test Results
```bash
cp environment.xml target/allure-results/
```

### View The Test Report

```bash
$ mvn allure:serve
```

