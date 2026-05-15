# Manual de Usuario y Documentación del Proyecto Yogurt-Maker

## 1. Introducción

Este documento cubre los principales componentes del proyecto, cómo ejecutar la aplicación y qué archivos de entrega están disponibles.

## 2. Estructura del proyecto

- `README.md` - Descripción general del proyecto.
- `LICENSE` - Licencia MIT del proyecto.
- `docs/MANUAL.md` - Manual de referencia y guía de entrega.
- `docs/EVIDENCIAS.md` - Registro de evidencia y pruebas ejecutadas.
- `src/main/java` - Código fuente de la aplicación.
- `src/test/java` - Pruebas unitarias y de integración.
- `pom.xml` - Archivo de configuración de Maven.

## 3. Cómo ejecutar el proyecto

1. Asegúrate de tener Java y Maven instalados.
2. Ejecuta el siguiente comando desde la raíz del proyecto:

```bash
./mvnw test
```

3. Para ejecutar la aplicación Spring Boot:

```bash
./mvnw spring-boot:run
```

## 4. Entrega y versión

- El repositorio está organizado en ramas.
- Se recomienda usar `master` como rama estable y `develop` como rama de desarrollo.
- El archivo `LICENSE` y la documentación de soporte ya están incluidos.

## 5. Archivos de documentación adicionales

- `README.md` - Conservado como ya estaba creado.
- `docs/EVIDENCIAS.md` - Contiene información de las pruebas realizadas y evidencias de ejecución.

## 6. Acciones recomendadas para la entrega final

1. Crear un branch `develop` para los cambios en curso.
2. Mantener `master` como rama de entrega estable.
3. Subir el repositorio a GitHub y verificar que el remoto esté bien configurado.
4. Añadir cualquier evidencia adicional en `docs/evidencias/` si hay capturas o reportes.
