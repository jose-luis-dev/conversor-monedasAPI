# Conversor de Monedas 💱

¡Bienvenido/a a mi proyecto de conversor de monedas! Este programa permite convertir entre el dólar estadounidense (USD) y varias monedas de América Latina utilizando datos en tiempo real de la API ExchangeRate-API. Es un desafío desarrollado como parte del programa Oracle Next Education (ONE) - Alura Latam.

## 🚀 Funcionalidades

- Obtener tasas de cambio actualizadas desde una API externa.
- Filtrar y seleccionar tasas para monedas específicas.
- Interfaz de consola interactiva con un menú que permite al usuario elegir la conversión deseada.
- Conversión bidireccional entre:
  - Dólar ⇄ Peso argentino (ARS)
  - Dólar ⇄ Peso colombiano (COP)
  - Dólar ⇄ Real brasileño (BRL)
  - Dólar ⇄ Peso chileno (CLP)
  - Dólar ⇄ Boliviano (BOB)
- Validación de entradas numéricas para evitar errores.

## 📸 Ejemplo de uso

```bash
*******************************
* Sea bienvenido/a al conversor de moneda*

1) Dólar =>> Peso argentino.
2) Peso argentino =>> Dólar.
...
11) Salir

Elija una opción valida:
*******************************
```

🛠 Tecnologías
- Java 17
- API ExchangeRate-API (https://www.exchangerate-api.com/)
- Biblioteca Gson para parsear JSON

📂 Estructura del proyecto

ConversorMoneda/
├── src/
│   └── PrincipalConversor.java
│   └── ConsultaMoneda.java
│   └── Moneda.java
├── pom.xml
├── .gitignore
└── README.md

✅ Requisitos
- Java 17 o superior instalado.

⚙️ Instalación y ejecución
1. Clona el repositorio:
  - git clone https://github.com/tu-usuario/tu-repositorio.git

2. Accede a la carpeta del proyecto:
  - cd ConversorMoneda

3. Ejecuta el programa
   -  Abrir el proyecto en IntelliJ IDEA y correr la clase PrincipalConversor.java directamente.


✨ Mejoras futuras

 * Añadir interfaz gráfica (GUI) con JavaFX o Swing.
 * Permitir al usuario elegir cualquier par de monedas disponibles en la API.
 * Implementar pruebas unitarias automatizadas.
 * Agregar logs para auditoría de conversiones.

👨‍💻 Autor
Jose Luis Alvarado – [Tu LinkedIn](https://www.linkedin.com/in/jose-alvarado-72620220b/) | [Tu GitHub  ](https://github.com/jose-luis-dev) 

  



