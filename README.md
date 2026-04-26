# Sistema de Inventario Distribuido - Backend

Este repositorio contiene la arquitectura de microservicios desarrollada para la gestión de inventario de una carnicería. El sistema utiliza una arquitectura basada en Spring Cloud para garantizar la comunicación y el descubrimiento de servicios.

## Estructura del Proyecto

El ecosistema está compuesto por 4 servicios principales:
1. **Eureka Server**: Servidor de descubrimiento para el registro de los microservicios.
2. **API Gateway**: Punto de entrada único que gestiona el enrutamiento y la configuración de CORS para el frontend.
3. **MS-Inventario**: Microservicio encargado del manejo de la base de datos H2 y el stock de cortes.
4. **MS-Ventas**: Microservicio que actúa como intermediario para consultar la disponibilidad.

## Requisitos previos
* Java JDK 17 o superior.
* Maven 3.6+.
* NetBeans o IntelliJ IDEA.

## Configuración y Puertos
* Eureka Server: 8761
* API Gateway: 8080
* MS-Ventas: 8081
* MS-Inventario: 8082

## Orden de ejecución
Para que el sistema funcione correctamente, los servicios deben levantarse en este orden:
1. Ejecutar `eureka-server`.
2. Ejecutar `ms-inventario` (esperar a que se registre en Eureka).
3. Ejecutar `ms-ventas`.
4. Ejecutar `api-gateway`.

La base de datos se inicializa automáticamente en memoria (H2) con los datos precargados en el archivo `data.sql` del microservicio de inventario.
