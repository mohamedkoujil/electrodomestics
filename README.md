## Clase Electrodomestic
```
@startuml
class Electrodomestic{
-- atributs --
- preuBase: Double
- color: String
- consum: Char
- pes: Int
-- mètodes --
+ constructor(preuBase: Double, color: String, consum: Char, pes: Int): Electrodomestic
+ constructor(preuBase: Double): Electrodomestic
+ preuFinal(): Double
- comprovarConsum(): Double
- comprovarPes(): Double
+ veurePreuBase(): Double
+ toString(): String
}
@enduml
```
![image](https://github.com/mohamedkoujil/electrodomestics/assets/74406781/4948dcf3-39db-4b31-aaed-f2445982c8ed)


## Clase Rentadora
```
@startuml
class Rentadora{
-- atributs --
- carrega: Double
-- mètodes --
+ constructor(preuBase: Double, carrega: Double): Rentadora
+ constructor(preuBase: Double, color: String, consum: Char, pes: Int, carrega: Double): Rentadora
- calcularPlusCarrega(): Double
+ preuFinal(): Double
+ toString(): String
}
@enduml
```
![image](https://github.com/mohamedkoujil/electrodomestics/assets/74406781/83e3f7ad-5e8e-4c29-8fba-f3ed36cc2fa4)

## Clase Televisio 
```
@startuml
class Televisio{
-- atributs --
- mida: Double
-- mètodes --
+ constructor(preuBase: Double, mida: Double): Televisio
+ constructor(preuBase: Double, color: String, consum: Char, pes: Int, mida: Double): Televisio
- calcularPlusMida(): Double
+ preuFinal(): Double
+ toString(): String
}
@enduml
```
![image](https://github.com/mohamedkoujil/electrodomestics/assets/74406781/51f795b3-515f-48d2-a08c-c1d40d486638)




