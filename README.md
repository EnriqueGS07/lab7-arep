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
- ![image](https://user-images.githubusercontent.com/98104282/224523652-5d65bdb1-9de3-4d39-bdfa-93de54c5d302.png)
- ![image](https://user-images.githubusercontent.com/98104282/224523658-125e6645-085d-4c3b-b064-f6151bc150ae.png)
- ![image](https://user-images.githubusercontent.com/98104282/224523666-9f255215-e447-4c1e-ab37-f6cc08539b45.png)

- Aqui esta la consola del balanceador de carga imprimiendo a cual servido se le delego la peticion de los logs
- ![image](https://user-images.githubusercontent.com/98104282/224523809-68f47d39-3d53-46d5-8b85-6a4a5c773c04.png)





### Versionamiento
- Version 1.0.0
### Autores
- Enrique González Suárez



