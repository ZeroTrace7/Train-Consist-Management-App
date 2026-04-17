# Train Consist Management App

Train Consist Management App is a simple Java console project that shows how a railway system can manage a train consist, which is the set of bogies attached to an engine.

The project is split into small use cases. Each use case focuses on one Java concept and one train-related problem.

## What This Project Covers

- Passenger bogies with seat capacity
- Goods bogies with cargo rules
- Train composition and ordering
- Sorting and searching
- Validation and exception handling
- Streams, collections, and basic algorithms

## Use Cases

| Use Case | Topic | Java Concept |
| --- | --- | --- |
| UC1 | Start with an empty train consist | `List`, `ArrayList` |
| UC2 | Add and remove passenger bogies | `ArrayList` |
| UC3 | Keep bogie IDs unique | `HashSet` |
| UC4 | Maintain bogie order | `LinkedList` |
| UC5 | Keep insertion order without duplicates | `LinkedHashSet` |
| UC6 | Store bogie capacity values | `HashMap` |
| UC7 | Sort bogies by capacity | `Comparator` |
| UC8 | Filter high-capacity bogies | `Stream`, `filter()` |
| UC9 | Group bogies by type | `Collectors.groupingBy()` |
| UC10 | Count total seats in the train | `map()`, `reduce()` |
| UC11 | Validate train ID and cargo code format | `Pattern`, `Matcher` |
| UC12 | Check goods bogie safety rules | `allMatch()`, lambda |
| UC13 | Compare loop and stream performance | `System.nanoTime()` |
| UC14 | Block invalid passenger capacity | Custom checked exception |
| UC15 | Handle unsafe cargo assignment safely | `try-catch-finally` |
| UC16 | Sort capacities using Bubble Sort | Manual algorithm |
| UC17 | Sort bogie names alphabetically | `Arrays.sort()` |
| UC18 | Find a bogie ID using Linear Search | Sequential search |
| UC19 | Find a bogie ID using Binary Search | Divide and conquer |
| UC20 | Stop searching when no bogies exist | `IllegalStateException` |

## Requirements

- Java 8 or later
- Command line, PowerShell, or terminal

## How To Run

Compile all use cases:

```bash
javac -d out src/usecases/*.java
```

Run one use case:

```bash
java -cp out UseCase1TrainConsistManagementApp
```

Examples:

```bash
java -cp out UseCase10TrainConsistManagementApp
java -cp out UseCase15TrainConsistManagementApp
java -cp out UseCase20TrainConsistManagementApp
```

## Project Structure

```text
src/
  usecases/
    UseCase1TrainConsistManagementApp.java
    ...
    UseCase20TrainConsistManagementApp.java
```

## Notes

- All use cases are small, console-based, and easy to run one by one.
- Output is kept simple so behavior is easy to read and verify.
- Build files in `out/` are ignored to keep the repository clean.
