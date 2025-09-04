# Ledtrådar för laboration 1 EDAA30
v 1.0

## 1 TDD
Du får använda vilka strängar du vill för att beskriva papegojans bo. 
Har du svårt att välja kan du använda "hole in a tree",
"made of sticks", "cage" respektive "nowhere".

Du ska ha totalt fyra nya test när du är klar. 
Ett test var för alla typer, förutom `NORWEGIAN_BLUE`, den behöver två, 
ett där `isNailed` är `true` och ett där det är `false`. 

För `EUROPEAN` och `AFRICAN` ska det inte spela någon roll vilka de övriga värdena är.

## 2 Arv

Om metoden i en subklass inte är implementerad kommer 
metoden kallas i superklassen.
Så fram till dess att `getNest()` finns i  t ex `AfricanParrot`
så kommer metoden som finns, och redan fungerar, kallas i `Parrot`.
Det går att använda för att långsamt flytta funktionalitet från en 
klass till en subklass. 

## 3 Interfaces och Records

Om du inte gör några commits mellan det att du byter namn på `Parrot` till `CommonParrot`
och det att du skapar interfacet `Parrot`, 
kan du använda git checkout på filerna i `test` för att återställa 
så att testerna beror på rätt abstraktion igen.

En subklass till en klass som implementerar ett interface kommer också ha det interfacet,
så när `CommonParrot` fungerar som `Parrot` genom ett interface, 
så kommer de andra papegojorna också göra det.

Interfacet Parrot bör ha följande metoder:
> public double getSpeed()
> public String getNest()

Records är speciella klasser att ärva, eftersom de ersätter `class`
i deklarationen med `record`.

Första raden blir då t ex.
> public record EuropeanParrot( int numberOfCoconuts, double voltage, boolean isNailed) implements Parrot{}
