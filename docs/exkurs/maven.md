# Maven
## Was ist Maven?
Maven ist ein **Build-Management-Tool**, um den Prozess des Software Builds und der Verwaltung zu vereinfachen.
Maven kann:
- **Abhängigkeiten** verwalten (Dependencies)
- **Build-Prozess** definieren & ausführen (Build) 
- **Tests** ausführen und **Berichte** erstellen

## pom.xml
Das Herzstück eines jeden Maven Projekts ist die pom.xml. In ih alles definiert, was Maven machen kann im Projekt.
Wichtige Tags:
- _&lt;groupId&gt;_ - Gruppen/Unternehmens Id als umgekehrte U 
- _&lt;artifactId&gt;_ - Projektname / Projekt Id
- _&lt;version&gt;_ - Version des Projekts

## Dependencies
Zum Benutzen von Bibliotheken oder Frameworks, müssen Dependencies in der pom.xml definiert werden. Dafür gibt es Tags:
- _&lt;dependencies&gt;_ - Bereich für alle Abhängigkeiten
- _&lt;dependency&gt;_ - Bereich für Informationen zu einer Dependency. Benötigt unbedingt: GroupId, ArtifactId & Version

Eine Dependency benötigt mindestens folgende Einträge
- _&lt;groupId&gt;_ - Dependency GroupId
- _&lt;artifactId&gt;_ - Dependency ArtifactId 
- _&lt;version&gt;_ - Dependency Version

## Build
Build- und Protokoll-Prozess wird mittels Plugins definiert. Bsp: Copy-Dependency, Jar, javadoc- Plugins
- _&lt;build&gt;_ - Bereich für Bau Prozess
- _&lt;finalName&gt;_ - Benutzerdefinierter Name für die Jar
- _&lt;plugins&gt;_ - Bereich für alle Plugins
- _&lt;plugin&gt;_ - Definition eines Plugins

## Properties
Properties ermöglichen es Variablen zusetzen.
Vorteil: Versionen müssen nur einmal aktualisiert werden, zB JUnit Version für mehrere Dependencies. Ebenfalls können Eigenschaften für Maven definiert werden.
- _&lt;properties&gt;_ - Bereich für Definition von Eigenschaften
- _&lt;...&gt;_ - Name der Eigenschaft
- _&lt;...&gt;Wert&lt;/...&gt;_ - Wert der Eigenschaft

## Befehle
```mvn clean```
- Löschen aller Artefakte / Löscht Target Ordner
- kombinierbar mit anderen Befehlen (```mvn clean package``)

```mvn package```
- Build und Erzeugen von Ergebnis Artefakten
- ```mvn package -DskipTests``` Test Klassen werden kompiliert, aber nicht ausgeführt

```mvn test```
- Ausführen von Unit-Tests
- ```mvn test -Dtest=Test1,Test2``` ausführen von bestimmten Tests