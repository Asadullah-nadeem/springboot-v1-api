## ✅ Common `mvn` Commands

| Command                  | Use                                                   |
| ------------------------ | ----------------------------------------------------- |
| `mvn clean`              | Deletes the `target/` folder (cleans old build files) |
| `mvn compile`            | Compiles the source code (Java `.java` files)         |
| `mvn test`               | Runs test classes (if you have JUnit tests)           |
| `mvn package`            | Creates a `.jar` or `.war` file in `target/` folder   |
| `mvn install`            | Builds and installs your project to local Maven repo  |
| `mvn spring-boot:run`    | Runs the Spring Boot app (best for dev/testing)       |
| `mvn dependency:tree`    | Shows project dependencies (and conflicts)            |
| `mvn validate`           | Checks if your project is correct and all files exist |
| `mvn site`               | Generates project documentation (HTML files)          |
| `mvn help:effective-pom` | Shows final merged `pom.xml` after inheritance        |

---

## 🔧 Typical Daily Usage for Spring Boot

```bash
mvn clean install           # Clean and build
mvn spring-boot:run         # Run the Spring Boot app
mvn package                 # Create a JAR file
```

---

## 📂 Output Locations

| Command       | Output                                |
| ------------- | ------------------------------------- |
| `mvn package` | `target/your-app-name.jar`            |
| `mvn install` | `.m2/repository/...` local Maven repo |
| `mvn clean`   | Deletes `target/` folder              |

---

## ✅ Full Build Lifecycle (For Understanding)

```bash
validate → compile → test → package → verify → install → deploy
```

You can run any of these like:

```bash
mvn compile
mvn test
```

---

## 🧠 Pro Tip: Combine Commands

```bash
mvn clean package
```

(Cleans + Builds into `.jar`)

---
