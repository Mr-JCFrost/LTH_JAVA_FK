# Laboration 1 EDAA30
v 2.0
Kommentar till v 2.0 Jag saknar bra ord för git på svenska.
Tar gärna emot feedback och kommer ändra när jag undersökt frågan mer.

## Nyckelord
- Tester
- Arv
- Interface
- Objektorientering

## Syfte
Öva på testdriven utveckling, arv och polymorphism.

## Kod om papegojor
I den här laborationen finns test och kod som anger hur fort 
tre olika sorters papegojor flyger.
Uppgiften är att först lägga till funktionalitet genom att 
koda testdrivet.
Sedan är det dags att omstrukturera koden så att varje papegojsort 
har en egen klass som ärver Parrot.
I uppgift tre skrivs koden om så att Parrot istället är ett interface,
och de specifika papegojorna är av typen Record.

## Frågor att fundera på
- Hur väljs var logik hamnar i koden?
- Vilka poänger finns med arv?
- Vad är största skillnaden mellan gränssnitt och arv?
- Vad har gränssnitt och arv gemensamt?
- Vad avgör om arv eller gränssnitt är rätt val?
- Vilken lösning tycker du bäst om?

## Material som kan hjälpa
- [En film om testdriven utveckling](https://lu.instructuremedia.com/embed/d7dbc7e8-7ff2-4f47-b71d-03cdb471c7c0 )
- Labb 0 har information om hur du får koden att köra på din dator.

## Redovisa de olika stegen
Mellan varje steg behöver du spara undan förra lösningen, så att den går att redovisa.

Det här kommer vi att göra med Git. 
I labb 0 ska du ha lärt dig hur du sätter upp ett lokalt git-repo. 
Det ska du göra nu. 
Du behöver inte lägga upp resultatet på en server, t ex github, om du inte vill.
Om du gör det, se till att det är ett privat repo. 
Syftet med att använda git nu är att öva på att använda det lokalt
och för att kunna spara olika versioner av din lösning för redovisningen.

## 1 TDD

### Beskrivning
Lägg till var papegojorna bor.
Skriv en metod på Parrot-klassen som returnerar var papegojan bor.

### Förkunskaper
Du behöver kunna grunderna i TDD.
Du behöver kunna grundläggande Java.

### Syfte
Öva på TDD. 

### Redovisa
Det du skriver nu ska inte ändras under resten av laborationen.
Det kan ändå vara bra att göra en git-commit när du är klar med den.

### Frågor att tänka på
- Varför tror du att `ParrotFactory` finns?
- Vad var svårt med att skriva tester först?
- Vad blev lättare av att skriva tester först?
- Hur tog du hjälp av ditt IDE?

### Git
Gör så många commits som du vill, tills du är klar med deluppgiften.

### Specifikation
- Parrot ska ha en metod `getNest` som returnerar en sträng. 
- Den nya funktionaliteten ska skrivas testdrivet,
så att det alltid finns ett rött test innan ny kod skrivs i Parrot-klasen. 
- Afrikanska papegojor bor i hål i träd.
- Europeiska papegojor bor i ett bo byggt av pinnar.
- Norwegian blue bor i en bur, om den är fastspikad.
- Norwegian blue bor ingenstans om den inte är fastspikad.

### Filer att ändra i
- ParrotTest.java
- Parrot.java

### Instruktioner
- Skapa ett test som testar en metod som heter `getNest` som returnerar en `String`.
- Implementera metoden så att testet kompilerar, returnera en tom sträng.
- Låt det testa att metoden returnerar "hole in a tree" för afrikanska papegojor.
- Skriv koden som gör att testet blir grönt. 
- Upprepa för varje punkt i specifikationen ovan. 

### Innan du går vidare
Kolla att du har elva gröna test, varav fyra är nya.

## 2. Arv

### Beskrivning
Istället för att ha logiken för varje sorts papegoja inne i metoderna, 
går det att använda arv.

Målet är att bli av med alla case-satser i de olika metoderna, 
och istället bara ha en, i `ParrotFactory`. 
Ändra i `ParrotFactory` så att den skapar olika subklasser av `Parrot`, 
beroende på typen som kommer in.

Försök att ha sönder så få test som möjligt i taget, 
när du ändrar i din kod.

### Förkunskaper
Du behöver kunna hur du skriver en klass som ärver en annan.

### Syfte
Den här delen av laborationen är till för att visa hur logik kan kapslas in med polymorfism.
Du får också öva på arv, och på att använda dina tester som stöd. 

### Redovisning
- När du är klar med uppgift 2, gör en committ så att du lätt kan hitta tillbaka till koden som den ser ut då.

### Frågor att tänka på
- Vilka fördelar finns det med att använda arv,
istället för att lägga olika villkor i en och samma klass?
- När går det att göra `Parrot` till en abstrakt klass?
- På vilket sätt var testerna till en hjälp?
- Hur kunde ditt IDE hjälpa dig?

### Git
Gör så många committs som du vill, 
men kolla att du har en som visar när du är klar med uppgift två.
Skriv ett tydligt meddelande till din sista commit. 

### Specifikation
Skriv om lösningen så att den använder arv.
Använd testerna för att se till att koden fortfarande fungerar.
Testerna ska inte ändras, förutom `ParrotFactory.getParrot()`.
Ändra så att den returnerar olika sorters papegojor beroende på vilken enum som skickas in.
`getParrot` ska dock ha kvar sin signatur.
Du får inte ändra i `ParrotTest`.
Jobba i så små steg som möjligt.

### Filer att ändra i
- ParrotFactory.java
- Parrot.java
- EuropeanParrot.java (skapas)
- AfricanParrot.java (skapas)
- NorwegianBlueParrot.java (skapas)

### Instruktioner
- Börja med att skapa en tom klass EuropeanParrot som ärver Parrot.
- Ändra i ParrotFactory så att dem returnerar `EuropeanParrot`,
istället för `Parrot` om typen är `EUROPEAN`. 
- Kör testen.
- Skugga metoden `getNest()` från `Parrot` i `EuropeanParrot` 
och implementera den så att testet passerar. 
- Överskugga sedan de övriga metoderna i `EuropeanParrot`.
- Repetera ovanstående steg för de andra två papegoj-sorterna.
- Städa upp i `Parrot` och ta bort kod som inte behövs längre.

### Innan du går vidare
- Kolla att det enda stället där `ParrotTypeEnum` används är i `ParrotTest` och `ParrotFactory`.
- Se till att du kan använda git för att hitta tillbaka till det här stadiet i din kod.

## 3. Gränssnitt och Records

### Beskrivning
Records är Java-klasser som är till för att hålla data. 
Det ska vi använda för våra papegojor.
Men eftersom det inte går att ärva två olika klasser i Java
behöver Parrot nu bli ett interface. 
Skriv om lösningen så att varje papegoja är ett Record.

### Förkunskaper
- Du behöver kunna skapa och implementera ett interface.
- Record-klassen kan du läsa på om [här](https://blogs.oracle.com/javamagazine/post/records-come-to-java).

### Syfte
- Se skillnaden mellan interface och arv.
- Testa att använda Records.
- Öva mer på att ändra i kod som har tester.

### Redovisning
Det här är sista delen av labben, men det är ändå bra att ha en commit i slutet.

### Frågor att tänka på
- Vilka fördelar och nackdelar finns med att ärva Record?
- Hur skiljer sig gränssnitt, interfaces, från arv?

### Git
Gör så många commits som du vill,
men se till att all kod är committad när du är klar.

### Specifikation
När du är klar ska funktionaliteten vara oförändrad,
men `Parrot` ska vara ett interface och `EuropeanParrot`,`AfricanParrot` och `NorwegianBlueParrot`
ska vara subklasser av `Record`.

### Filer att ändra i
- Parrot.java
- EuropeanParrot.java 
- AfricanParrot.java 
- NorwegianBlueParrot.java 
(Testernas filer kommer ändras när du namnar om `Parrot`, 
men det ska ändras tillbaka sen.)

### Instruktioner

- Byt namn på `Parrot` till `CommonParrot`.
Använd refaktoriserings-verktyget i ditt IDE. 
Det här är så att du kan skapa ett interface som heter `Parrot`.
- Skapa ett interface `Parrot` och låt `CommonParrot` implementera det.
- Ändra så att `ParrotFactory` returnerar `Parrot` igen. 
Testerna ska inte känna till `CommonParrot` längre. 
Du kan använda git till det!
- Ändra i `EuropeanParrot` så att den implementerar interfacet `Parrot` direkt.
- Ändra i `EuropeanParrot` så att den ärver `Record`. 
- Kolla hela tiden att testerna fungerar.
- Gör om för `AfricanParrot` och `NorwegianBlueParrot` med.
- Ta bort `CommonParrot`.

### Innan du går vidare
- Kolla att alla tester är gröna och att de inte ändrats. 
- Kolla att Parrot är ett interface.
- Kolla att `EuropeanParrot`,`AfricanParrot` och `NorwegianBlueParrot`
  är subklasser av `Record`.

## Referenser
Den här övningen bygger på en kata från Emily Bache.
Hon inspirerades av Martin Fowlers bok "Refactoring". 
Innehållet kan också härledas till Monty Pythons sketch "Dead parrot".
