# Train Consist Management App

A console-based Java project that simulates how a railway system manages a train consist. Each use case is a focused, runnable example that demonstrates a core data-structure concept in a realistic railway scenario.

## Prerequisites

- Java 8+ (JDK)
- Command line (PowerShell / CMD / Terminal)
- Git

## Quick Start

Compile all use cases:

```bash
javac -d out src/usecases/*.java
```

Run a specific use case (example UC1):

```bash
java -cp out UseCase1TrainConsistManagementApp
```

Replace `UseCase1TrainConsistManagementApp` with any of the classes below.

## Use Cases Included

- UC1: Initialize Train and Display Consist Summary
- UC2: Add Passenger Bogies to Train (ArrayList Operations)
- UC3: Track Unique Bogie IDs (HashSet)
- UC4: Maintain Ordered Bogie Consist (LinkedList)
- UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
- UC6: Map Bogie to Capacity (HashMap)

## Source Layout

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
