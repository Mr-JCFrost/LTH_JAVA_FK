# Labb 0, se till att komma igång

## Information om laborationerna &check;
Laborationerna i den här kursen har två syften.
Dels så förbereder de dig på tentan. 
Därför är det viktigt att du löser laborationen själv, 
eller i alla fall förstår lösningen,
så att du skulle kunna lösa samma problem igen på en tenta.

Dessutom så är laborationerna examinerande för de delar av kursmålen som inte kommer på tentan.
Kursmålen i sin tur är designade så att du ska kunna använda den här kunskapen i kommande kurser
och i ditt kommande yrkesliv.
Ta laborationerna på allvar och be om hjälp om det är något du inte förstår.
Ställ frågor, vi sätter inga betyg på laborationerna,
och du blir inte godkänd långsammare för att du visar dig okunnig.  

## Materialet &check;
Varje laboration består av olika filer.
Tanken är att det ska vara likt hur projekt ser ut i industrin,
men samtidigt ge ett extra stöd. 

### Källkod
Laborationerna kommer dels innehålla källkod, java-filer, som ni ska ändra i eller utöka. 
Det kommer också förekomma tester, ibland som ni ska "aktivera" genom att ta bort kommentarstecken,
ibland som ni behöver se till fortsätter att fungera.

### README
Alla instruktioner finns i en README, som den här. 
Den är skriven på formatet markdown, som är ett utbrett formateringsspråk.
De flesta utvecklingsmiljöer har stöd för att visa en markdown-fil formaterad. 
Då är den lättare att läsa. 

### CLUES
I CLUES.md ligger olika ledtrådar för laborationen.
Där kan finnas kodsnuttar att använda eller tips om dokumentation att läsa.
Det finns två huvudanledningar till att vissa delar av instruktionerna hamnar i CLUES.

1. Ibland är det nyttigt att försöka själv först, genom att läsa dokumentation eller pröva sig fram.
2. Den som redan vet hur prblemet ska lösas ska inte behöva läsa onödigt mycket text. 

Om du kör fast på en uppgift, börja med att kika i CLUES.
(Om inte det hjälper får du gärna kontakta kursansvarig, för då behövs det bättre ledtrådar.)

## De olika delarna i instruktionerna &check;
Det kan vara svårt att följa instruktioner.
Jag försöker göra det så lätt som möjligt, för så många som möjligt.
Poängen med labben är koden du skriver, det du lär dig och tankarna du tänker.
Att kunna läsa krångliga instruktioner ingår inte i kursplanen, 
så om det är något som är svårt att förstå, hör av dig så att jag kan göra den bättre.


En del laborationer har följande underrubriker på varje steg, 
andra har vissa gemensamt och då kommer de inte upprepas, utan finns på översta nivån av labben. 
Läs gärna igenom instruktionerna en gång innan du börjar med labben. 

### Nyckelord
Viktiga begrepp som hanteras i delen.
De går alla att koppla till kursmålen. 

### Beskrivning
Här beskrivs uppgiften övergripande.

### Förkunskaper
Vad behöver du kunna för att genomföra laborationen. 
Tips på saker du kan läsa på.

### Syfte
Vad jag vill att du ska lära dig på den här labben.

### Redovisning
Saker att tänka på så att ditt arbete gåt att visa för andra.

### Frågor att tänka på
Ta med dig de här frågorna in i ditt kodande.

### Git
Om det finns något speciellt att tänka på gällande versionshantering. 

### Specifikation
Den här punkten definierar det du tekniskt kommer utvärderas utifrån.
Om du vill kan du sluta läsa efter du läst specifikatoinerna, 
och bara koda loss. 
Följer du det som står här så ska det gå bra ändå. 

### Filer att ändra i
Här listas de filer som du förväntas ändra i och/eller skapa.
Se det som en hjälp i hur uppgiften ska lösas.

### Instruktioner
Här finns stegvisa instruktioner för den som vill ha.
Specifikationen ska egentligen räcka, 
och om instruktionerna här inte räcker, kolla i `CLUES.md`.

### Innan du går vidare
En koll så att du har gjort det som förväntas och är redo att gå vidare.

## Versionshantering &check;
Kod ändras, och för att hålla ordning på ändringar i kod används versionshantering.
Det finns flera program för att versionshantera kod (VCS - version control software),
den mest populära idag är Git. 
Git är ett distribuerat system, men med kompletta kopior på varje enhet. 
Det innebär att Git kan kopplas till en server, men att det också går att använda lokalt på en dator.
I den här kursen behöver du *inte* använda GitHub, BitBucket eller GitLab (det finns fler), som är olika sätt att ha git i molnet.
(Om du vill göra det får du vara beredd på att det finns en del saker som blir svårare.)

Använd istället git lokalt på din dator. 

## Den här laborationen
### Nyckelord
- program
- filsystem
- paket
- sökväg
- automatiska tester
- utvecklingsmiljö
- versionshantering

### Beskrivning
I den här labben ska ni läsa igenom labb 1,
skapa ett projekt i en utvecklingsmiljö ni själva väljer och se till att ni kan köra testerna.
Sedan ska ni skapa ett git-repository och göra en första commit. 

### Förkunskaper
Läs på om paket, filsystem, sökvägar och versionshantering.

### Syfte
Den här laborationen har fyra syften:
1. Du ska bekanta dig med formatet på laborationen.
2. Du ska kunna lägga in en labb i din dator så du kan köra tester och börja arbeta med uppgifterna.
För det behöver du också känna till vad som behövs för att kunna kompilera kod i Java.
3. Du ska känna till filsystem och paket i Java, skillnader och likheter.
4. Du ska ha redovisat detta för kursansvarig, så att du vet vem det är och att det alltid är ok att be om hjälp.
   (Ni är inte fler i den här kursen än att det går.)

### Redovisning
Den här laborationen redovisas för kursansvarig. 
Redovisningen går ut på att visa att du är redo att börja arbeta med labb 1.
Du ska också kunna svara på frågorna nedan.

### Frågor att tänka på 
- Vad tror du att du kommer tycka är bäst med versionshantering? - Kunna gå tillbaka till gammal kod för att se vad som fungerade tidigare elle för att man "förstrt" sin kod.
- Vad tror du att du kommer tycka är svårast med versionshantering? - Att göra commit
- Vad är poängen med paket? - Att lätt kunna ändra och återanvända kod
- Vad betyder 'package protected'? - Att koden endats går att nå innom paketet.
- Vad är ett filsystem? - Datorns arkivieringssystem för att sortera filer mappar och undermappar i en trädstruktur.
- Vad är skillnaden mellan en mapp och ett paket?
- Varför valde du den utvecklarmiljö som du valt? - Använder den till annan utveckling så för att slippa instalera fler program.
- Vad behöver datorn veta för att kunna kompilera din kod?

### Git
I den här laborationen behöver du bara göra en första commit, men det är fritt fram
att skapa ett annat projekt för att testa mer hur git fungerar.

### Specifikation
Sätt upp ett projekt i valfri utvecklingsmiljö (som fungerar med Java och JUnit 5)
Se till att koden kompilerar och att du kan köra testerna.
Skriv en ``.gitignore`` som du är nöjd med och gör en första commit. 
Läs på tills du känner dig bekväm med att svara på frågorna ovan. 

### Filer att ändra i
- .gitignore i projektet för labb 1 (skapas)

### Instruktioner
1. Gå in på Moodle och ladda ner labb 1.
2. Välj vilken utvecklingsmiljö du vill arbeta i. Ladda ner och installera om du inte redan har den.
3. Stäng av alla generativa AI-tjänster i utvecklingsmiljön.
4. Skapa ett projekt och lägg in filerna från labb 1.
5. Skapa en fil som heter ```.gitingore``` (obs '.' i början av filnamnet),
lägg in namnet på de filer som du inte vill ska komma med.
6. Se till att du har ett JDK och att utvecklingsmiljön hittar dina filer, samt vet vilken sorts filer det är.
7. Lägg till JUnit 5 som ett beroende.
8. Bygg koden och kör testerna.
9. Gör en första commit.

### Innan du går vidare
- Kontrollera att labb 1 kompilerar, utan ändringar.
- Kontrollera att testerna kör och blir gröna.
- Se till att du har en commit i git och att det inte är några ```.class``` filer med.
- Kolla att du stängt av alla generativa AI tjänster, om din miljö har några. 