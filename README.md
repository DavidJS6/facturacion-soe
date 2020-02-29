# Facturación SOE

Aplicación desarrollada para el proyecto del módulo Nroº 6 de la maestría en 
dirección estratégica en ingeniería de software.

### Tecnologías utilizadas para la implementación del proyecto

1. [SpringBoot](https://spring.io/projects/spring-boot)
2. [PostgreSQL](https://www.postgresql.org/)
3. [Java](https://es.wikipedia.org/wiki/Java_(lenguaje_de_programaci%C3%B3n)

### Prerequisitos

1. Tener instalado Java, mínimamente el [JRE de Java en su versión 1.8](https://www.java.com/es/) como mínimo
2. Tener instalado [PostgreSQL en su versión 11.6.3](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)

### Intrucciones para desplegar el proyecto

1. Clonar el repositorio

2. Crear un usuario en PostgreSQL con los siguientes parámetros:
    - Username: facturacion-soe 
    - Password: facturacion-soe
    
    Opcionalmente se puede configurar el usuario y la contraseña para la conexión con la
    base de datos en el archivo [application.properties](src/main/resources/application.properties) 
    que se encuentra en resources
    
3. Crear una base de datos en PostgreSQL con el nombre de "facturacion-soe". Para ello 
se puede utilizar el gestor "pgAdmin"

4. Proporcionar todos los privilegios sobre la base de datos creada en el punto 3 
al usuario creado en el punto 2

5. Ejecutar el script del esquema de la base de datos 
[schema_1.1.0.sql](src/main/resources/database/schema_1.1.0.sql) (el cual se encuentra en 
la ruta resources\database)

6. Ejecutar el archivo [facturacion-soe-1.0.0.jar](bin/facturacion-soe-1.0.0.jar) utilizando
el siguiente comando desde la raíz del proyecto

        java -jar bin/facturacion-soe-1.0.0.jar 

    Si es que se hubiese utilizado una configuración especial para la Base de Datos (punto 2)
    debe compilarse el proyecto antes de ejecutarlo
    
        mvn package
    
7. Cargar los archivos [collection](src/main/resources/postman/collection.json) y
[environment](src/main/resources/postman/environment.json) (Los cuales se encuentran en 
la ruta resources\postman) en la aplicación [Postman](https://www.postman.com/downloads/)

### Lista de servicios web

La aplicacion (por ende tambien la coleccion Postman) tiene los siguientes servicios web:

1. Productos
    * Crear producto
    * Actualizar producto
    * Eliminar producto
    * Obtener un producto específico
    * Obtener todos los productos
    
2. Precios
    * Registrar precio
    * Actualizar precio
    * Eliminar precio
    * Obtener un precio específico
    * Obtener todos los productos
    
3. Facturas
    * Registrar factura
    * Cancelar factura
    * Eliminar factura
    * Obtener una factura especifica
    * Obtener todas las facturas