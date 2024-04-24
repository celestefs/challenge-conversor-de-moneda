## Challenge Alura-ONE G6 - Java Back End 

### Conversor de Moneda

![unnamed](https://github.com/celestefs/challenge-conversor-de-moneda/assets/114313324/5867c439-2bde-4fa5-8567-ee74e73a1d09)

### Consigna:

En este challenge se nos pidió realizar un conversor de monedas a través de solicitudes realizadas a una API de tasas de cambio. Obtenemos de esa API un JSON el cual manipulamos utilizando una biblioteca (Gson) y filtramos los datos para renderizarlos luego por pantalla a través de un sistema de interacción con el usuario en donde él decide a través de un menú cuáles son los pares de monedas en los que quiere realizar la conversión y el monto mismo de dicha conversión. 

![foto1](https://github.com/celestefs/challenge-conversor-de-moneda/assets/114313324/4870c090-dcc8-434d-9594-c6daede60739)

El sistema se encuentra dentro de un loop permitiéndole al usuario que continúe realizando la cantidad de conversiones que desee, y solo saliendo de dicho loop con la opción dada en dicho menú para realizar esa acción, finalizando así el programa.

![foto2](https://github.com/celestefs/challenge-conversor-de-moneda/assets/114313324/ed34704b-8ca5-4b97-9643-0059e88ddc72)

![foto4](https://github.com/celestefs/challenge-conversor-de-moneda/assets/114313324/3861f54a-1229-4028-bda9-9e1d1cf78f34)

Además, como ejercicio extra se le ha agregado la opción de que mientras el programa se encuentre corriendo, recopile las conversiones realizadas en una lista de conversiones en la que podemos ver también la fecha y hora en que se realizaron utilizando la biblioteca java.time. Queda pendiente realizar esos registros de manera persistente y permanente.

![foto3](https://github.com/celestefs/challenge-conversor-de-moneda/assets/114313324/d2d980c6-8c1f-4e29-81ce-1fccc7d8ec50)

### ✔️ Tecnologías utilizadas para el conversor de moneda:

• JAVA 17

• La biblioteca [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1)

• La API [Exchange Rate-API](https://www.exchangerate-api.com/)



