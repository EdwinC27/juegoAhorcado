# juegoAhorcado
Es un juego muy popular donde tienes 10 intentos de adivinar una palabra

## Funcionalidad
Este código en Java implementa el juego del ahorcado, en el que un jugador debe adivinar una palabra oculta a través de adivinar letras una por una antes de quedarse sin intentos.

La primera parte del código define un array de palabras grupales y selecciona una palabra aleatoria del mismo para el jugador adivinar. Luego, inicializa un arreglo de caracteres con guiones bajos del mismo tamaño que la palabra elegida para representar las letras a adivinar. También se establece el número de intentos en 10.

Después de inicializar estas variables, comienza el bucle principal del juego. El jugador puede ingresar una letra para adivinar y se comprueba si esa letra está en la palabra oculta. Si es así, se muestra esa letra en su lugar correspondiente en el arreglo de caracteres. Si el jugador adivina correctamente todas las letras antes de quedarse sin intentos, se muestra un mensaje de victoria. Si el jugador adivina incorrectamente una letra, se reduce el número de intentos restantes y se muestra un mensaje de advertencia. Si el jugador se queda sin intentos, se muestra un mensaje de derrota y se termina el juego.

En general, el código utiliza una serie de bucles y estructuras condicionales para implementar el juego del ahorcado.

Este codigo se ejecuta en la terminal del IDE

## Requisitos:
- Para poder utilizar este programa, es necesario que su sistema operativo tenga instalado Java 11 o una versión más reciente. Si no cuenta con Java, puede descargar e instalar la versión correspondiente, por ejemplo desde la página de: https://adoptium.net/temurin/releases/.

