# Calculator API – SEG3502 Lab 6

Service Web REST Spring Boot (Kotlin) avec documentation OpenAPI (springdoc).

## Endpoints
- GET /calculator/add/{nombre1}/{nombre2}
- GET /calculator/subtract/{nombre1}/{nombre2}
- GET /calculator/multiply/{nombre1}/{nombre2}
- GET /calculator/divide/{nombre1}/{nombre2}  (400 si division par zéro)

## Exécution
```
./gradlew bootRun
```
- http://localhost:8080/calculator/add/5/3  -> 8.0
- OpenAPI JSON : http://localhost:8080/v3/api-docs
- OpenAPI YAML : http://localhost:8080/v3/api-docs.yaml
- Swagger UI   : http://localhost:8080/swagger-ui.html
