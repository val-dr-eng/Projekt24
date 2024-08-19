# How To 
## Maven Projekt zu Maven Multi Module migrieren
1. Passende Module hinzufügen
    - Rechtsklick auf Projekt → New → Modul
    - z.B.: storage & api
2. Alten Source Dateien in neue Packages verschieben
   - Für Produktiv und Test Code
3. Package Namespace anpassen wenn nötig
   - Für Produktiv und Test Code
4. POM Files aufräumen
    - In Eltern POM dependencies → dependencyManagement und plugins → pluginManagement 
    - In Kind POM → nur benötigte dependencies und plugins einsetzen
    - In Kind POM Dependency auf anderes Kind setzen, falls benötigt.
5. Alten src Ordner löschen
