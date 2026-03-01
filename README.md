# Search Library Assignment

A Java library implementing various search algorithms with comprehensive unit tests.

## Project Structure

```
search-library-assignment/
├── src/
│   ├── main/java/search/
│   │   ├── BinarySearch.java
│   │   ├── LinearSearch.java
│   │   └── InterpolationSearch.java
│   └── test/java/search/
│       ├── BinarySearchTest.java
│       ├── LinearSearchTest.java
│       └── InterpolationSearchTest.java
├── .github/workflows/
│   └── test.yml
├── pom.xml
└── README.md
```

## Search Algorithms

### 1. Binary Search
- **Complexity**: O(log n)
- **Requirement**: Sorted array
- **Use case**: Fast searching in sorted data

### 2. Linear Search
- **Complexity**: O(n)
- **Requirement**: None (works on any array)
- **Use case**: Small datasets or unsorted data

### 3. Interpolation Search
- **Complexity**: O(log log n) for uniform distribution
- **Requirement**: Sorted array with uniform distribution
- **Use case**: Large datasets with uniformly distributed values

## Running Tests

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Run All Tests
```bash
mvn clean test
```

### Run Specific Test
```bash
mvn test -Dtest=BinarySearchTest
```

### Generate Test Report
```bash
mvn surefire-report:report
```

Then open `target/site/surefire-report.html` in your browser.

## Test Coverage

- **BinarySearchTest**: 6 tests
- **LinearSearchTest**: 6 tests
- **InterpolationSearchTest**: 7 tests

**Total**: 19 unit tests

## GitHub Actions

Tests run automatically on every push and pull request to main/master branches.

View test results in the **Actions** tab of your GitHub repository.

## Quick Setup Command

Run this command in your terminal to set up environment and run tests:

```powershell
$javaPath = (Get-Command java -ErrorAction SilentlyContinue).Source; if ($javaPath) { $javaHome = Split-Path $javaPath -Parent | Split-Path -Parent; $env:JAVA_HOME = $javaHome }; $mavenDir = Get-Item "$env:TEMP\apache-maven-*" -ErrorAction SilentlyContinue | Select-Object -First 1; if ($mavenDir) { $env:MAVEN_HOME = $mavenDir.FullName; $env:PATH = "$env:MAVEN_HOME\bin;$env:PATH" }; cd "search-library-assignment"; mvn clean test
```

## Author

BSE-6A - Software Quality Assurance
