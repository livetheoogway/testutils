<p align="center">
  <h1 align="center">TestUtils</h1>
  <p align="center">A couple of useful simple test utility classes<p>
  <p align="center">
    <a href="https://github.com/livetheoogway/testutils/actions">
    	<img src="https://github.com/livetheoogway/testutils/actions/workflows/actions.yml/badge.svg"/>
    </a>
    <a href="https://s01.oss.sonatype.org/content/repositories/releases/com/livetheoogway/commons/testutils/">
    	<img src="https://img.shields.io/maven-central/v/com.livetheoogway.commons/testutils"/>
    </a>
    <a href="https://github.com/livetheoogway/testutils/blob/master/LICENSE">
    	<img src="https://img.shields.io/github/license/livetheoogway/testutils" alt="license" />
    </a>
  </p>
  <p align="center">
    <a href="https://sonarcloud.io/project/overview?id=livetheoogway_testutils">
    	<img src="https://sonarcloud.io/api/project_badges/measure?project=livetheoogway_testutils&metric=alert_status"/>
    </a>
    <a href="https://sonarcloud.io/project/overview?id=livetheoogway_testutils">
    	<img src="https://sonarcloud.io/api/project_badges/measure?project=livetheoogway_testutils&metric=coverage"/>
    </a>
    <a href="https://sonarcloud.io/project/overview?id=livetheoogway_testutils">
    	<img src="https://sonarcloud.io/api/project_badges/measure?project=livetheoogway_testutils&metric=bugs"/>
    </a>
    <a href="https://sonarcloud.io/project/overview?id=livetheoogway_testutils">
    	<img src="https://sonarcloud.io/api/project_badges/measure?project=livetheoogway_testutils&metric=vulnerabilities"/>
    </a>
  </p>
</p>

This is a collection of simple test utility classes

## Table of Contents

1. [Features](#features)
2. [Requirements](#requirements)
3. [Dependencies](#dependencies)
4. [Usage](#usage)

## Features

1. PerformanceEvaluator: Quickly evaluate the performance of your code.
2. ObjectExtractor: Quickly extract objects from test resource folders 

## Requirements

- Java version 17 and above

## Dependencies

Add the following dependency to your pom.xml:

```xml

<dependency>
    <groupId>com.livetheoogway.commons</groupId>
    <artifactId>testutils</artifactId>
    <version>1.0</version>
</dependency>
```

## Usage

```java
// In order to run an operation 100 times and evaluate its performance, use the PerformanceEvaluator
PerformanceEvaluator performanceEvaluator = new PerformanceEvaluator();
performanceEvaluator.evaluate(100, () -> {
    // your code here
});

// in order to extract an object from a test resource folder, use the ObjectExtractor
ObjectExtractor objectExtractor = new ObjectExtractor();
objectExtractor.extract("path/to/resource/file", SomeClass.class);
```