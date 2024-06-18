# Conversor de Moneda

![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/9f49b648-7745-41ac-8f61-e0b3108f7c8d)

## Descripción

Este proyecto fue desarrollado como un reto de Alura Cursos en el curso avanzado de Java, con el objetivo de mejorar nuestros conocimientos en el consumo de API's. La función principal de este proyecto es servir como un conversor de moneda, permitiendo al usuario elegir la divisa correspondiente y realizar el cambio a la moneda deseada con la ayuda de una API que nos proporciona estos datos.

## Instalación

Si deseas usar este código, eres libre de hacerlo y de dejar comentarios. Solo debes seguir los siguientes pasos:

1. Haz un fork de este repositorio.
2. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-moneda.git
3.Regístrate en ExchangeRate-API y obtén tu API key, aqui: https://www.exchangerate-api.com/.

4.Copia y pega tu API key en el archivo de configuración correspondiente del proyecto:

![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/f6394aca-67d3-4a6d-88b8-0138af3c1e69)

5 En la clase BusquedaApi en el metodo Moneda en la dirreccion cambia la palabra KEY por la llave que te proporciona la API

6.Luego, deberia correr con normalidad

## USO

¿Para qué sirve?

El conversor de moneda permite al usuario seleccionar una divisa y convertirla a otra divisa deseada utilizando datos actualizados proporcionados por la API de ExchangeRate-API.

¿Cómo funciona?

Al iniciar el programa, se presenta una interfaz donde el usuario puede seleccionar la moneda de origen y la moneda de destino.

  Con el metodo while y switch se busca que el usuario eliga una opcion y solo salga del programa cuando el lo desee 
  
 ![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/9888413c-8975-440e-b20b-5a9d6074a076)

 ![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/06f82f60-b94d-4410-b3a9-90f5204b407a)

 
El usuario ingresa la cantidad de dinero que desea convertir con ayuda del metodo BusquedaApi.

![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/29272bde-0363-43da-87ac-37bbe91c224d)

Luego, El programa realiza una solicitud a la API de ExchangeRate-API con BusquedaApi utilizando la API key proporcionada.

![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/0aed474c-faf6-48a3-a861-4f27b2095775)

Finalmente, La API responde y se muestra en consola el resultado con la tasa de cambio actual.

![image](https://github.com/EstebanTarazona/ConversorMonedas/assets/132153330/192b568d-5cc9-44c1-a1cd-931a12cf6381)

El programa va seguir trabajando e imprimiendo el menu en pantalla, hasta que el usuario quiera salir.

## Autores
Esteban Tarazona - Proyecto Conversor Monedas

## Agradecimientos
- Alura Cursos - Por el reto y el curso avanzado de Java.
- ExchangeRate-API - Por proporcionar los datos de la tasa de cambio.
