# Voll-Med API REST

**Voll-Med API REST** es una aplicación desarrollada con **Spring Boot** como parte de tu aprendizaje en desarrollo backend. Permite gestionar operaciones típicas de una clínica médica, como registro de pacientes, medicos y citas.
---

## 🚀 Tecnologías principales

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security (opcional)
- Validación de datos con Bean Validation (`@Valid`)
- Lombok (para reducir boilerplate)
- Flyway (para migración de base de datos, si aplica)
- MySQL (o H2 si es in-memory)
- Maven para gestión del proyecto

---

## 📂 Estructura del proyecto (ejemplo)
```text
Voll-Med-API-REST/
├── src/
│   └── main/
│       ├── java/com/alonso/vollmed/
│       │   ├── controller/       # Endpoints REST
│       │   ├── service/          # Lógica de negocio
│       │   ├── repository/       # Interfaces JPA
│       │   ├── model/            # Entidades JPA
│       │   ├── dto/              # Objetos para transferencia de datos
│       │   └── VollMedApplication.java  # Clase principal
│       └── resources/
│           ├── application.properties     # Configuración general
│           └── db/migration/              # Scripts Flyway (si aplica)
├── pom.xml
└── README.md
```
## ⚙️ Requisitos
- JDK 17 o superior
- Base de datos (MySQL o H2)
- Maven

## ▶️ Cómo ejecutar el proyecto
### 1. Clona el repositorio:
```bash
git clone https://github.com/alonso1298/Voll-Med-API-REST.git
cd Voll-Med-API-REST
```
### 2. Configura tu base de datos en src/main/resources/application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
```
### 3. Ejecuta el proyecto con Maven:
```bash
./mvnw spring-boot:run
```
### 4. La aplicación estará disponible en:
```
http://localhost:8080
```

## 📡 Endpoints disponibles 
```http
GET    /pacientes              - Listar todos los pacientes
GET    /pacientes/{id}         - Ver paciente por ID
POST   /pacientes              - Crear nuevo paciente
PUT    /pacientes/{id}         - Modificar paciente existente
DELETE /pacientes/{id}         - Eliminar paciente (o dar de baja)
```
## 📘 Qué aprendí con este proyecto

- Arquitectura RESTful con Spring Boot
- Uso de DTOs, mapeo de entidades y repositorios
- Validación de peticiones con @Valid
- Gestión de seguridad (JWT, roles, si aplica)
- Migraciones de base de datos con Flyway (si aplica)
- Documentar API con SpringDoc
- Añadir pruebas unitarias e integración (JUnit, Mockito)
- Implementar autenticación y autorización con Spring Security

## 📄 Licencia
Este proyecto se desarrolla con fines educativos.
Puedes revisarlo, adaptarlo y experimentar libremente. © 2025


