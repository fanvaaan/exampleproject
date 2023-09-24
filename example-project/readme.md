# JavaFX FatJar with Main class

How to build a runnable fat jar JavaFX apps. 

## How to Build

```
$ mvn clean package
```

## How to Run

```
$ java -jar --module-path D:/Java/javafx-sdk-21/lib --add-modules=javafx.controls,javafx.fxml .\target\app-1.0-SNAPSHOT-jar-with-dependencies.jar
```