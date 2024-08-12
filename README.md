# NoSQL-Datenbanken – Grundlagen

Dies ist das Repository für den **LinkedIn Learning** Kurs `NoSQL-Datenbanken – Grundlagen`. Den gesamten Kurs finden Sie auf [LinkedIn Learning][lil-course-url].

![COURSENAME][lil-thumbnail-url] 

Auf Websites, die große Datenmengen im Griff halten müssen, stoßen die klassischen relationalen Datenbanksysteme schnell an ihre Grenzen. NoSQL-Datenbanken – NoSQL steht für »Not only SQL«  – versprechen hier Abhilfe: Dieses Video-Training mit dem erfahrenen Softwareentwickler Christian Trutz macht Sie mit spannenden Möglichkeiten, die die Entwicklung von Anwendungen deutlich vereinfachen oder überhaupt erst ermöglichen, vertraut.<br><br>

Sie lernen drei verschiedene Datenbankarten kennen: MongoDB als dokumentenorientierte Datenbank, Neo4j für graphenorientierte Datenbanken und Redis als Key-Value-Datenbank. Anhand von Code-Challenges können Sie das Erlernte sofort testen und Ihre Lösung auch gleich mit der von Ihrem Trainer angebotenen Solution vergleichen.<br><br>

Dieser Kurs richtet sich an Java- und Python-Entwickler:innen und zeigt ihnen, wie sie mit Visual Studio Code, Docker und weiteren Tools moderne Web-Anwendungen erstellen können.

## Anleitung

Dieses Repository hat Branches für jedes Video im Kurs. Verwenden Sie das Ausklappmenü "Branch: ..." in GitHub um zwischen den unterschiedlichen Branches hin und her zu wechseln bzw. um bei einem spezifischen Status einzusteigen. Oder Sie fügen `/tree/BRANCH_NAME` der URL hinzu um direkt in den gewünschten Branch zu wechseln.

## Branches

Die Git Branches sind passend zu den Videos im Kurs strukturiert. Die Namenskonvention lautet `Kapitel#_Video#`. Der Branch `02_03` beinhaltet zum Beispiel die Übungen für das dritte Video im zweiten Kapitel. 
Einige Branches haben einen Anfangsstatus (`b`) für "beginning" und einen Endstatus (`e`). Der Branch mit dem `e` am Ende beinhaltet in diesem Fall stets den Code der am Ende des Videos zu sehen ist. Der `master` Branch beinhaltet den initialen Quellcode und wird nicht für die Übungen innerhalb des Kurses genutzt.

Wenn Sie von einem Branch nach Änderungen zum nächsten Branch wechseln, erhalten Sie möglicherweise die folgende Meldung:

```
error: Your local changes to the following files would be overwritten by checkout:        [files]
Please commit your changes or stash them before you switch branches.
Aborting
```

Dieses Problem lösen Sie wie folgt:
    Add changes to git using this command: git add .
    Commit changes using this command: git commit -m "some message"

### Autor

**Christian Trutz**

_[Softwareentwickler]_

Sehen Sie sich andere Kurse des Autors auf [LinkedIn Learning](https://www.linkedin.com/learning/instructors/christian-trutz) an.

[0]: # (Replace these placeholder URLs with actual course URLs)
[lil-course-url]: https://www.linkedin.com/learning/nosql-datenbanken-grundlagen/
[lil-thumbnail-url]: https://media.licdn.com/dms/image/D4E0DAQFAdIaBucfbxw/learning-public-crop_675_1200/0/1723448296346?e=2147483647&v=beta&t=PCdw4dyNX0bx566E2M_wFaJ0kRvGV3Rx2d8n98ie1ns
