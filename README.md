# API
Reto de programación - Rest API - Javier Mejia

## Requerimientos
El proyecto fue creado en el IDE IntelliJ IDEA versión 2020.2, todas las dependencias son cargadas a través de Maven.

## Uso del API

Para hacer uso del API puede utilizar una herramienta como Postman o Insomnia. A continuación se muestra el uso de los diferentes endpoints del API.

### **Método** GET, **Endpoint** http://<span></span>localhost:8080/api/v1/users

En la siguiente imagen se puede apreciar que el endpoint retorna todos los usuarios almacenados en la base de datos.

![GET-Users](/capturas/GET-Users.png)

### **Método** GET, **Endpoint** http://<span></span>localhost:8080/api/v1/users/{id}

En la siguiente imagen se puede apreciar que al utilizar este endpoint se obtiene un único usuario 

![GET-User](/capturas/GET-User.png)

### **Método** POST, **Endpoint** http://<span></span>localhost:8080/api/v1/users

En la siguiente imagen vemos que se envió una petición POST con un objeto JSON en el body del request para crear un nuevo usuario.

![POST-Users](/capturas/POST-Users.png)

### **Método** PUT, **Endpoint** http://<span></span>localhost:8080/api/v1/users/{id}

Aquí vemos que se envía un objeto JSON en el body del request para modificar un usuario existente.

![PUT-User](/capturas/PUT-User.png)

### **Método** DELETE, **Endpoint** http://<span></span>localhost:8080/api/v1/users/{id}

En este request se utilizó el método DELETE para eliminar un usuario de nuestros registros.

![DELETE-User](/capturas/DELETE-User.png)
