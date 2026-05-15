# 🍦 Yogur Maker API

## 📌 Descripción

**Yogur Maker API** es una aplicación backend desarrollada con **Java y Spring Boot**, diseñada para gestionar el proceso de elaboración de yogur artesanal.

El sistema permite administrar recetas, lotes de producción, monitoreo de temperatura y control del proceso de fermentación, aplicando buenas prácticas de arquitectura en capas.

---

## 🏗️ Arquitectura del proyecto

El sistema sigue una arquitectura en capas para garantizar escalabilidad, mantenibilidad y separación de responsabilidades:

- **Controller** → Manejo de peticiones HTTP (API REST)
- **Service** → Lógica de negocio
- **Repository** → Acceso a base de datos
- **Model** → Entidades del sistema
- **DTO** → Transferencia de datos entre capas
- **Exception** → Manejo centralizado de errores

---

## 📂 Estructura del proyecto

```bash
src/
 └── main/
     ├── java/com/yogurmaker/
     │    ├── controller/
     │    ├── service/
     │    │     └── impl/
     │    ├── repository/
     │    ├── model/
     │    ├── dto/
     │    ├── exception/
     │    └── YogurMakerApplication.java
     │
     └── resources/
          ├── application.properties
          └── data.sql (opcional)
```

## ⚙️ Tecnologías utilizadas

El proyecto fue desarrollado utilizando las siguientes tecnologías:

- ☕ Java 17+ → Lenguaje principal de programación  
- 🌱 Spring Boot → Framework principal para desarrollo backend  
- 🌐 Spring Web → Creación de API REST  
- 🗄️ Spring Data JPA → Acceso y manejo de base de datos  
- 🔗 Hibernate → ORM para la persistencia de datos  
- 📦 Maven → Gestión de dependencias y construcción del proyecto  
- 🐬 MySQL / H2 Database → Base de datos utilizada  
- 🧪 Postman → Pruebas de los endpoints de la API  

---
## 🚀 Instalación y ejecución
1. Clonar el repositorio
```bash
git clone https://github.com/sebastianmolina1/yogur.git
cd yogur
```
 Configurar base de datos

 2. Editar el archivo:
```bash
src/main/resources/application.properties
```
Ejemplo con MySQL:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/yogur_db
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```



3. Ejecutar el proyecto
```bash

./mvnw spring-boot:run
```
O desde tu IDE:

Ejecutar YogurMakerApplication.java

---

##  📡 Endpoints principales


### 🥛 Recetas

GET /api/recetas → Listar recetas

POST /api/recetas → Crear receta

GET /api/recetas/{id} → Buscar receta

PUT /api/recetas/{id} → Actualizar receta

DELETE /api/recetas/{id} → Eliminar receta

---

### 🧪 Lotes

GET /api/lotes → Listar lotes

POST /api/lotes → Crear lote

GET /api/lotes/{id} → Buscar lote

PUT /api/lotes/{id} → Actualizar lote

DELETE /api/lotes/{id} → Eliminar lote

---

### 🧠 Buenas prácticas

Arquitectura en capas

Separación de responsabilidades

Uso de DTOs

Manejo centralizado de errores

Inyección de dependencias


Proyecto desarrollado como práctica de backend con Spring Boot.
