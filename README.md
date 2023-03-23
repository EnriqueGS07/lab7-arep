# lab7-arep
# APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES
Se sesarrollo una aplicación Web segura con los siguientes requerimientos:

Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

### Arquitectura de la aplicación
![image](https://user-images.githubusercontent.com/98104282/227108061-7b57eeef-a987-43f3-9b70-595a885dd643.png)


- El sistema de la figura tiene los siguientes elementos:
- Cada servidor genera su keystore el cual permite la conexión ssl, un servidor debe tener un truststore para poder indicarle en que certificados debe confiar al momento de hacer la conexión
cada uno de los servicios sera una instancia de EC2 de Amazon Web Services


### Construción
- Amazon web services: EC2
- Spark java
- [Maven](https://maven.apache.org/) - Dependency Management
Se crearon 5 instancias de ec2 en amazon web services y las tres intancias del log services  y al balanceador de cargas se les instalo java, luego se subio el codiogo de java que se ibaa correr y se empezo a correr el servicio


### Video Demo
- https://pruebacorreoescuelaingeduco.sharepoint.com/:v:/s/videos645/Eecq6jkLh0NMmxno5MaAiZoBu9La-EkEBXJYNYA1ioMAnA?e=yASixr





### Versionamiento
- Version 1.0.0
### Autores
- Enrique González Suárez



