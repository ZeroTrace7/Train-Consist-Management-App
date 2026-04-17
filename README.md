# Train Consist Management App

A console-based Java project that models how a railway system manages a train consist. Each use case is a focused, runnable example that teaches one data-structure concept through a realistic train scenario.

## Highlights

- Clear, incremental use cases from initialization to safety-rule validation.
- Real-world train operations modeled with core Java collections.
- Deterministic console output for easy verification and learning.

## Features (Implemented)

- Initialize a train consist and show initial bogie count (UC1).
- Add, remove, and check passenger bogies with `ArrayList` (UC2).
- Enforce unique bogie IDs using `HashSet` (UC3).
- Maintain ordered consist using `LinkedList` with positional inserts/removals (UC4).
- Preserve insertion order while preventing duplicates using `LinkedHashSet` (UC5).
- Map bogie names to capacities using `HashMap` and `entrySet()` iteration (UC6).
- Sort passenger bogies by capacity using `Comparator` and custom objects (UC7).
- Filter passenger bogies by capacity using `Stream` pipelines (UC8).
- Group bogies by type using `Collectors.groupingBy` (UC9).
- Count total train seats using `map()` and `reduce()` (UC10).
- Validate train IDs and cargo codes using `Pattern` and `Matcher` (UC11).
- Validate goods bogie safety rules using `allMatch()` and lambdas (UC12).

## Use Cases

| Use Case | Title | Data Structure |
| --- | --- | --- |
| UC1 | Initialize Train and Display Consist Summary | `List` / `ArrayList` |
| UC2 | Add Passenger Bogies to Train | `ArrayList` |
| UC3 | Track Unique Bogie IDs | `HashSet` |
| UC4 | Maintain Ordered Bogie Consist | `LinkedList` |
| UC5 | Preserve Insertion Order of Bogies | `LinkedHashSet` |
| UC6 | Map Bogie to Capacity | `HashMap` |
| UC7 | Sort Bogies by Capacity | `List` + `Comparator` |
| UC8 | Filter Passenger Bogies Using Streams | `Stream API` |
| UC9 | Group Bogies by Type | `Collectors.groupingBy` |
| UC10 | Count Total Seats in Train | `map()` + `reduce()` |
| UC11 | Validate Train ID & Cargo Codes | `Pattern` + `Matcher` |
| UC12 | Safety Compliance Check for Goods Bogies | `allMatch()` + `Predicate` |

## Prerequisites

- Java 8+ (JDK)
- Command line (PowerShell / CMD / Terminal)

## Quick Start

Compile all use cases:

```bash
javac -d out src/usecases/*.java
```

Run a specific use case (example UC1):

```bash
java -cp out UseCase1TrainConsistManagementApp
```

Run all use cases one by one:

```bash
java -cp out UseCase1TrainConsistManagementApp
java -cp out UseCase2TrainConsistManagementApp
java -cp out UseCase3TrainConsistManagementApp
java -cp out UseCase4TrainConsistManagementApp
java -cp out UseCase5TrainConsistManagementApp
java -cp out UseCase6TrainConsistManagementApp
java -cp out UseCase7TrainConsistManagementApp
java -cp out UseCase8TrainConsistManagementApp
java -cp out UseCase9TrainConsistManagementApp
java -cp out UseCase10TrainConsistManagementApp
java -cp out UseCase11TrainConsistManagementApp
java -cp out UseCase12TrainConsistManagementApp
```

## Project Structure

```
src/
  TrainConsistManagementApp/
    TrainConsistManagementApp.java
  usecases/
    UseCase1TrainConsistManagementApp.java
    UseCase2TrainConsistManagementApp.java
    UseCase3TrainConsistManagementApp.java
    UseCase4TrainConsistManagementApp.java
    UseCase5TrainConsistManagementApp.java
    UseCase6TrainConsistManagementApp.java
    UseCase7TrainConsistManagementApp.java
    UseCase8TrainConsistManagementApp.java
    UseCase9TrainConsistManagementApp.java
    UseCase10TrainConsistManagementApp.java
    UseCase11TrainConsistManagementApp.java
    UseCase12TrainConsistManagementApp.java
```

## Notes

- Each use case is intentionally console-based and deterministic for clarity.
- Build output is ignored using `.gitignore` to keep the repo clean.
