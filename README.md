
# Proyecto Gestión de Eventos

## Descripción

Esta aplicación permite gestionar eventos y añadir participantes en ellos. Incluye funciones como agregar eventos, ver la lista de eventos y eliminar eventos, entre otras. La aplicación está desarrollada en Java (NetBeans), utiliza una base de datos MariaDB (HeidiSQL) para el almacenamiento de datos y se comunica con una API para la gestión y transferencia de información.

## Interfaz Gráfica
- ### Crear Evento:

Permite crear un evento estableciendo parámetros como nombre del evento, fecha, hora y ubicación.
![eve 1](https://github.com/user-attachments/assets/268abd47-5862-42e8-a2f2-059360b2f127)

Si completas todos los campos y presionas el botón "Guardar", aparecerá una notificación con tu ID.
![eve 2](https://github.com/user-attachments/assets/cca3fd30-9970-45c7-9e03-61dea2853a2b)

Si no completas todos los campos y presionas el botón "Guardar", aparecerá una notificación informándote que debes llenar todos los campos.
![eve 3](https://github.com/user-attachments/assets/d825d9df-ad2b-43aa-8e0f-bdd1b9eabf92)

Cuando completes la primera parte del registro y presiones el botón "Guardar Evento/Siguiente", aparecerá la última parte del formulario, donde deberás rellenarlo con tus datos personales.
![eve 4](https://github.com/user-attachments/assets/f3f3f099-7925-40a2-ac35-fbe1c13fa514)

Si ingresas un ID que no existe, aparecerá una notificación informándote que ese ID no está registrado.
![eve 5](https://github.com/user-attachments/assets/6dda1114-8754-4ba0-b587-5ca04c73dbcb)

- ### Ver listado de eventos:

Podemos acceder a esta sección desde el botón "Eventos", donde podemos actualizar y visualizar todos los eventos almacenados en la base de datos.
![eve 6](https://github.com/user-attachments/assets/bcacdd82-84bb-49c6-9010-4f0d3c1fe370)

Desde el botón "Unirme Evento", podremos acceder al siguiente formulario para unirse a los eventos que vimos en la lista.
![eve 7](https://github.com/user-attachments/assets/6ec110fb-3402-4a6f-a66d-183726756fff)

Si ingresas los datos correctamente, aparecerá una notificación informándote que te has unido al evento.
![eve 9](https://github.com/user-attachments/assets/768346f7-52f8-4381-b9b6-1d5f9b207c91)

De lo contrario, si no completas todos los campos, aparecerá la siguiente notificación:
![eve 10](https://github.com/user-attachments/assets/f9dff63c-91f1-42e9-b8d6-30dbb00b67fb)

- ### Eliminar Evento:
Desde la sección de eventos, podremos eliminar eventos a través del botón "Eliminar Eventos"
![eve 12](https://github.com/user-attachments/assets/a3426cd0-0c11-402f-8219-d0be7478b13a)
Aquí podremos eliminar los eventos no deseados utilizando su ID.

## API
La API se conforma por 4 clases distintas, cada una con un propósito específico en la arquitectura de la aplicación. Estas clases son:
- ### @Entity:
Esta clase representa una entidad de la base de datos. Define la estructura de los objetos que se almacenarán en la base de datos y mapea cada atributo de la clase a una columna de la tabla correspondiente.
![api entity](https://github.com/user-attachments/assets/82625d46-0861-440b-b4c4-ec8763dbac7a)
- ### @Repository:
Esta clase se encarga de la interacción con la base de datos. Proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las entidades. Utiliza JPA (Java Persistence API) para simplificar el acceso a la base de datos.
![api repository](https://github.com/user-attachments/assets/468252d4-a13c-4f45-8b59-dbabf7f9d35e)
- ### @Service:
Esta clase contiene la lógica de negocio de la aplicación. Aquí se definen los métodos que procesan los datos antes de ser enviados al controlador o almacenados en la base de datos. También se encargará de manejar excepciones y transacciones.
![api service](https://github.com/user-attachments/assets/c4faeeb4-a81a-43a0-a1ac-9ceb716699f8)
- ### @RestController:
Esta clase es el punto de entrada de la API. Maneja las solicitudes HTTP y devuelve respuestas en formato JSON. Se encarga de recibir las peticiones del cliente, invocar los métodos del servicio y enviar los resultados de vuelta al cliente.
![api controller](https://github.com/user-attachments/assets/d47a9909-fc3f-4689-aab4-adfbc52778c3)

## Base de datos
El almacenamiento de datos se realiza en MariaDB. Aquí se almacena la información necesaria para gestionar los eventos y las personas registradas. La base de datos se compone de las siguientes tablas principales:
- ### Eventos:
Esta tabla almacena la información de cada evento creado. Incluye campos como:

- id_evento: Identificador único del evento (clave primaria).
- nombre_evento: Nombre del evento.
- fecha: Fecha en que se llevará a cabo el evento.
- hora: Hora de inicio del evento.
- ubicacion: Lugar donde se realizará el evento.
- nombre_organizador: Nombre del organizador del evento.
- apellido_organizador: Apellido del organizador del evento.
- correo: Correo electrónico de contacto del organizador.
- telefono: Número de teléfono del organizador.

![bd 1](https://github.com/user-attachments/assets/baa1f3cb-24a7-46ae-acca-e0f448c333c0)

- ### Invitados:
Esta tabla almacena los datos de los invitados registrados en cada evento. Incluye los siguientes campos:

- id_invitado: Identificador único del invitado (clave primaria).
- nombre: Nombre del invitado.
- apellido: Apellido del invitado.
- correo: Correo electrónico del invitado.
- telefono: Número de teléfono del invitado.
- id_evento: Identificador del evento al que está - - registrado el invitado (clave foránea que referencia la tabla de eventos).

![bd 2](https://github.com/user-attachments/assets/8cd1f2e3-ee00-4a22-b809-c5bddf263890)

- ### Relaciones
Relación entre Eventos y Invitados: Un evento puede tener múltiples invitados registrados, pero cada invitado está asociado a un único evento. Esta relación se establece a través del campo id_evento en la tabla de invitados, creando así una relación de uno a muchos.

- ### Configuración de Conexión
Para que la aplicación funcione correctamente con la base de datos, es necesario configurar los detalles de conexión en el archivo application.properties, que debe incluir:

_DB_URL=jdbc:mariadb://localhost:3306/registro_eventos_

_DB_USER=tu_usuario_

_DB_PASSWORD=tu_contraseña_

## Requisitos
- Java JDK (versión 8 o superior): Asegúrate de que el JDK esté correctamente instalado y configurado en tu sistema.
- MariaDB: Necesitas tener una base de datos MariaDB instalada y en funcionamiento. Asegúrate de que la configuración de la base de datos esté lista para aceptar conexiones.
- Apache NetBeans: Un entorno de desarrollo integrado (IDE) para Java, necesario para desarrollar y ejecutar el proyecto.
- Postman (opcional): Para probar la API RESTful, Postman puede ser una herramienta útil para hacer solicitudes HTTP y ver las respuestas.
- Conexión a Internet: Necesaria para descargar dependencias y acceder a cualquier recurso adicional requerido.

- ### Nota adicional

_Asegúrate de que todas las configuraciones de conexión a la base de datos estén correctamente establecidas en el archivo de configuración de la aplicación._


## Instalación
1. Clona el repositorio en tu máquina local.
2. Navega al directorio del proyecto.
3. Instala las dependencias necesarias para el proyecto de la API y instala los .Jar que deje en mi repositorio de github adentro del proyecto de la interfaz grafica.
4. Configura la base de datos
Asegúrate de tener MariaDB instalado y en funcionamiento.
Crea una base de datos para el proyecto, por ejemplo:

_CREATE DATABASE eventos_y_personas;_

5. Configura la conexión a la base de datos
Edita el archivo application.properties que se encuentra dentro del proyecto api, para incluir los detalles de conexión a la base de datos:

_DB_URL=jdbc:mariadb://localhost:3306/nombredetubasededatos_

_DB_USER=tu_usuario_

_DB_PASSWORD=tu_contraseña_

6. Abre el proyecto en Apache NetBeans:
Lanza Apache NetBeans y abre el proyecto clonado.
Asegúrate de que todas las dependencias estén correctamente configuradas en tu IDE.

7. Ejecuta la aplicación:

Ejecuta el proyecto API.                   
Ejecuta el proyecto IguEventos.

8. Listo ya puedes usar la aplicacion ;)

## Diagrama

![diag](https://github.com/user-attachments/assets/eee87192-3ac2-448c-b1b4-bd9f03a7fe5b)

- ### Gracias por tomarse el tiempo de leer mi proyecto y por favor, tenga piedad al calificar jaja :]