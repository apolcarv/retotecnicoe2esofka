# Autor: Alejandro Polo Carvajal
#### https://www.linkedin.com/in/alejandro-polo-carvajal-790b79186/
##### ------------------------------------------------------------------------------------------------------
# Reto tecnico sofka E2E:
##### ------------------------------------------------------------------------------------------------------

#### Pagina automatizada: https://www.saucedemo.com/
#### Funciones automatizadas: • Autenticarse con el usuario: standard_user y password: secret_sauce • Agregar dos productos al carrito • Visualizar el carrito • Completar el formulario de compra • Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”
#### Patron de diseño: Screenplay
#### Framework: gherkin, cucumber, Junit, SerenityBDD, selenium
#### Framework adicionales: librerias lombok, Faker, SonarLink, cucumber for java, json
#### Lenguaje programacion: Java
#### version gradle: gradle-8.4
#### OPEN_JDK Version 17.0.9
#### Driver: Edge version  121.0.2277.128 (Descarga remota)
#### ID: Intellij IDEA community Edition 2023.1
##### ------------------------------------------------------------------------------------------------------

### Todos los casos pruebas cumplen con cada criterio solicitado
### Todas las clases estan con auto-ident lines y reformat code
### El codigo no tiene ningun Bug o codeSmell
##### ------------------------------------------------------------------------------------------------------
# PASOS PARA LA EJECUCIÓN

## Opcion 1
### PASO A PASO PARA LA EJECUCIÓN POR CONSOLA

## Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno, segun el orden alfabetico dentro de la carpeta runners
#### ./gradlew clean test

### Comando para ejecutar por feature
### EJEMPLOS
#### ./gradlew test --tests "co.com.sofka.project.runners.AddProductsToCartRunner" --- un solo feature 
##### ------------------------------------------------------------------------------------------------------
#### ./gradlew test --tests "co.com.sofka.project.runners" --- TODOS LOS FEATURES

### Comando para limpiar la carpeta Target (Reportes)
#### ./gradlew clearReports

### Comando para generar reporte despues que haya terminado un test (Por consola arrojara la ruta .html )
#### ./gradlew reports


