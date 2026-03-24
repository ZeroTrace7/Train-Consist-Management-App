# Train Consist Management App

A console-based Java project that models how a railway system manages a train consist. Each use case is a focused, runnable example that teaches one data-structure concept through a realistic train scenario.

## Highlights

- Clear, incremental use cases from initialization to key-value mappings.
- Real-world train operations modeled with core Java collections.
- Deterministic console output for easy verification and learning.

## Features (Implemented)

- Initialize a train consist and show initial bogie count (UC1).
- Add, remove, and check passenger bogies with `ArrayList` (UC2).
- Enforce unique bogie IDs using `HashSet` (UC3).
- Maintain ordered consist using `LinkedList` with positional inserts/removals (UC4).
- Preserve insertion order while preventing duplicates using `LinkedHashSet` (UC5).
- Map bogie names to capacities using `HashMap` and `entrySet()` iteration (UC6).

## Use Cases

| Use Case | Title | Data Structure |
| --- | --- | --- |
| UC1 | Initialize Train and Display Consist Summary | `List` / `ArrayList` |
| UC2 | Add Passenger Bogies to Train | `ArrayList` |
| UC3 | Track Unique Bogie IDs | `HashSet` |
| UC4 | Maintain Ordered Bogie Consist | `LinkedList` |
| UC5 | Preserve Insertion Order of Bogies | `LinkedHashSet` |
| UC6 | Map Bogie to Capacity | `HashMap` |

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
```

## Notes

- Each use case is intentionally console-based and deterministic for clarity.
- Build output is ignored using `.gitignore` to keep the repo clean.
