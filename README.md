<h1 align="center"> API ForoHub de Daniel </h1>

![Badge en Desarrollo ](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green)

## 🗒️ Descripción del Proyecto
Este proyecto consiste en un API que simula un foro. Este ha sido elaborado con lenguaje de programación Java, y registra y consume informacion de una Base de Datos SQL.

## 🚧 Estado del Proyecto
:construction: Proyecto en construcción :construction:

## :hammer:Funcionalidades del proyecto

El proyecto ha sido probado en la herramienta de pruebas Insomnia con los metodos http POST, GET, PUT y DELETE para las funciones en las que corresponde:

- `Funcionalidad 1`: Con el metodo POST y la url: http://localhost:8080/login, se ingresa un login de autenticaión de usuario con nombre y clave en formato JSON. Se aclara que, el usuario debe estar registrado previamente en la base de datos con su nombre y un token de tipo HMAC256 que represente la clave de usuario:
{
	"login": "nombre de usuario",
	"clave": "clave de usuario"
}

- `Funcionalidad 2`: Con el metodo POST y la url: http://localhost:8080/topicos, se registran los datos de un nuevo topico para el foro en formato JSON como en el siguiente ejemplo: 
{
	"titulo": "titulo del topico",
	"mensaje": "mensaje del topico",
	"autor": "autor del mensaje",
	"curso": "nombre del curso de los disponibles (HTTP, JAVASCRIPT, HTML, CSS, JAVA, SQL)"
}

- `Funcionalidad 3`: Con el metodo GET y la url: http://localhost:8080/topicos, se muestra la lista de topicos registrados y su respectiva información.

- `Funcionalidad 4`: Con el metodo GET y la url: http://localhost:8080/topicos/{id}, se muestra la informacion de un topico específico registrado (en la url, {id} se reemplaza por el numero de uno de los id registrados. El id que se indique en la url será el registro mostrado).

- `Funcionalidad 5`: Con el metodo PUT y la url: http://localhost:8080/topicos, se actualiza un topico específico. En el body se deben ingresar los nuevos datos en formato JSON como en el siguiente ejemplo: 
{
	"id": 9,
	"titulo": "nuevo titulo",
	"mensaje": "nuevo mensaje"
}
NOTA: cualquiera de los campos "titulo" o "mensaje" que se deje vacio, no se realizará modificacion en ese campo. Solo se modifica el campo al que se añada informacion. El id que se indique será el registro modificado.

- `Funcionalidad 6`: Con el metodo DELETE y la url: http://localhost:8080/topicos/{id}, se elimina la informacion de un topico específico registrado (en la url, {id} se reemplaza por el numero de uno de los id registrados. El id que se indique en la url será el registro eliminado).


## ▶️Intrucciones de uso
1.	En el archivo application.properties hay una configuracion por defecto que se puede cambiar segun las preferencias del usuario y las configuraciones de su propio gestor de base de datos.
2.	La aplicacón se puede probar en herramientas como Postman o Insomnia.
3.	Al ejecutar el programa, se deben tener creados en Postman o Insomnia los metodos http para que esta pueda ser probada.
4.	Los datos se deben ingresar en el Body en formato JSON o en la url segun como se indica en la seccion de 'Funcionalidades del proyecto' y dependiendo de cada funcion.
5.	Dependiendo de la solicitud realizada, la información puede ser verificada en la herramienta de pruebas o en la propia base de datos.

## 📁 Acceso al proyecto
Para acceder al proyecto se pueden seguir los siguientes pasos:
1.	Abrir la url https://github.com/danielobiw/apiforohub
2.	Click en el botón verde que dice “<>CODE” de la parte superior.
3.	Download ZIP.
4.	Buscar el archivo en la carpeta de descarga y descomprimir.
5.	Abrir el entorno de desarrollo Java de preferencia.
6.	Desde el entorno de desarrollo, buscar el archivo descomprimido en la ruta donde se guardó.
7.	Seleccionar el archivo y abrirlo.

## 🛠️ Abrir y ejecutar el proyecto
Después de abrir el proyecto en el entorno de desarrollo de preferencia y ver el código en pantalla, hay que dar click en el botón “RUN” ▶️ para ejecutar el programa y verlo en funcionamiento en la consola y la herramienta de pruebas.

## 💻 Tecnologías utilizadas
Las tecnologías utilizadas en el desarrollo del proyecto fueron las siguientes:
1.	Lenguaje de programación Java 8.
2.	JDK 17
3.	Herramienta de pruebas Insomnia.
4.	Maven version 4.
5.	Spring Boot version 3.
6.	MySQL Workbench 8.0 CE.
7.	Entorno de desarrollo Intellij IDEA Community Edition 2024.

## 🧑‍🦱 Autor
[Daniel Gaviria](https://github.com/danielobiw)

## 📆 Fecha de inicio del proyecto
Diciembre 2024.

