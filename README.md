Poc de comunicação paginada entre micro serviços com openFeign

Usando:

* JDK 11
* Spring 2.4.3
* IntelliJ
* Lombok
* Gradle
* OpenFeigh
* Spring web
* H2
* Spring data jpa

O Projeto consiste em duas api que através de chamadas rest trocam dados persistidos em banco, inviando de forma paginada os dados.

Para requisição paginada:

URL(GET): http://localhost:8081/customers/?page=0&size=5&sort=id,asc

URL(GET): http://localhost:8082/customers/ {quantidade de itens por página}
