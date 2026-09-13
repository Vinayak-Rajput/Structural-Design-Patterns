# Structural Design Patterns

Java examples of common structural design patterns. Each package contains a
small, focused implementation and a corresponding problem statement describing
the design problem the pattern addresses.

## Patterns Included

| Pattern | Package | Example |
| --- | --- | --- |
| Adapter | `Adapter` | Adapts a third-party payment SDK to the application's `PaymentProcessor` interface. |
| Bridge | `Bridge` | Separates report types from delivery channels such as email, SMS, and Slack. |
| Composite | `Composite` | Treats files and directories uniformly while calculating total size recursively. |
| Decorator | `Decorator` | Adds beverage ingredients and their costs dynamically through wrappers. |
| Facade | `Facade` | Provides a simplified interface for coordinating a home theater system. |
| Flyweight | `Flyweight` | Shares tree type data while keeping each tree's coordinates separate. |
| Proxy | `Proxy` | Defers creation of an expensive high-resolution image until it is displayed. |

## Project Structure

```text
.
├── src/
│   └── com/example/structure/
│       ├── Adapter/
│       ├── Bridge/
│       │   ├── AbstractReport/
│       │   ├── ConcreteReports/
│       │   ├── ConcreteSenders/
│       │   └── SenderInterface/
│       ├── Composite/
│       ├── Decorator/
│       ├── Facade/
│       ├── Flyweight/
│       └── Proxy/
├── Structural Design Patterns.iml
└── .gitignore
```

The `Problem Statement.txt` files in the pattern directories describe the
requirements used to shape each example.

## Design Summaries

### Adapter

`PaymentProcessor` exposes `pay(double dollar)`, while
`ThirdPartyVendorSDK` expects an amount in cents and a currency code.
`PaymentAdapter` converts the amount and delegates to the vendor SDK without
changing either interface.

### Bridge

`Report` owns a `Sender` implementation. `SummaryReport` and
`DetailedAuditReport` represent report abstractions, while `EmallSender`,
`SMSSender`, and `SlackSender` represent delivery implementations. A report
and a delivery channel can be combined independently without creating a class
for every possible pair.

### Composite

`File` is a leaf and `Directory` is a composite. Both implement
`FileSystemElement`, allowing `getSize()` to be called consistently on an
individual file or on a directory containing nested files and directories.

### Decorator

`Beverages` defines the common beverage contract. `DarkRoast` is a concrete
beverage, and decorators such as `OatMilk` and `Whip` wrap another beverage to
add cost at runtime.

Conceptually, decorations can be composed like this:

```java
new Whip(new OatMilk(new DarkRoast()))
```

### Facade

`HomeTheaterFacade` coordinates `SmartLights`, `Projector`, and `SoundSystem`
behind a single `watchMovies(String movie)` operation. Clients do not need to
know the order or details of the subsystem calls.

### Flyweight

`TreeType` stores shared tree data, and `Tree` stores each tree's position.
`TreeFactory` caches `TreeType` instances by name so many trees can reuse the
same intrinsic data rather than allocating duplicate objects.

### Proxy

`ImageProxy` implements the same `Image` interface as `HighResImage`. It keeps
only the filename until `display()` is called; the expensive `HighResImage`
instance is then created once and reused for subsequent displays.

```java
Image image = new ImageProxy("forest.png");
image.display(); // Loads and displays the image on first use
image.display(); // Displays the already-loaded image
```

## Requirements

- Java Development Kit (JDK) 25, matching the IntelliJ project configuration.
- A Java compiler available on the command line.

The project is configured as an IntelliJ IDEA Java module with `src` as its
source root. There is no build-tool configuration or automated test suite in
the repository.

## Compile

After correcting the constructor name in
`src/com/example/structure/Decorator/OatMilk.java` from `OakMilk` to
`OatMilk`, compile all sources with:

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
```

The constructor typo currently prevents the complete source tree from
compiling as-is. The examples also do not include `main` methods, so individual
clients or small driver classes are needed to run them.

## Notes

- The examples focus on the structure of each pattern rather than production
  concerns such as validation, persistence, logging, or thread safety.
- The source package names use capitalized pattern directory names, matching
  the existing project layout.
- The proxy example demonstrates lazy instantiation of the real image object;
  the current implementation logs loading and display operations instead of
  reading an actual image file.
