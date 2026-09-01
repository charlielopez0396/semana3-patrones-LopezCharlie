# Semana 3 - Patrones de Diseño

## Sistema de Gestión de Tutorías

Este proyecto corresponde a una evolución del **Sistema de Gestión de Tutorías** desarrollado previamente en la asignatura Diseño de Software.

En la versión anterior se diseñaron los principales elementos del dominio, como estudiantes, docentes, asignaturas, horarios, reservas y notificaciones. En esta nueva etapa se aplican patrones de diseño creacionales para mejorar la flexibilidad, extensibilidad y claridad del sistema.

Los patrones implementados son:

- Factory Method
- Builder

---

## 1. Factory Method

### Problema

El Sistema de Gestión de Tutorías necesita enviar notificaciones relacionadas con las reservas, por ejemplo, cuando una tutoría es registrada, confirmada o actualizada.

Si el sistema crea directamente cada mecanismo de notificación, como correo electrónico, SMS o WhatsApp, el código queda fuertemente acoplado a implementaciones concretas.

### Solución

Se aplicó el patrón **Factory Method** para delegar la creación de los diferentes tipos de notificadores.

La interfaz:

`Notificador`

define la operación común:

`enviar(destinatario, mensaje)`

Las implementaciones concretas son:

- `NotificadorEmail`
- `NotificadorSMS`
- `NotificadorWhatsApp`
- `NotificadorPush`

La clase abstracta:

`CreadorNotificador`

define el método fábrica `crearNotificador()` y utiliza el objeto creado mediante `notificar()`.

Los creadores concretos son:

- `CreadorEmail`
- `CreadorSMS`
- `CreadorWhatsApp`
- `CreadorPush`

### Extensibilidad

Inicialmente el sistema puede trabajar con correo electrónico, SMS y WhatsApp.

Como prueba de extensibilidad se incorporó posteriormente el tipo **Push**, agregando:

- `NotificadorPush`
- `CreadorPush`

Esto permite incorporar un nuevo mecanismo de notificación sin modificar las implementaciones existentes.

### Ejecución

```bash
mvn clean compile
java -cp target/classes edu.uees.patrones.factory.DemoFactoryMethod
```

---

## 2. Builder

### Problema

Una reserva de tutoría puede necesitar varios datos para su construcción.

Entre ellos:

**Datos obligatorios:**

- estudiante
- asignatura
- fecha
- hora

**Datos adicionales u opcionales:**

- docente
- modalidad
- tema
- observaciones
- estado

Utilizar un constructor con muchos parámetros dificulta la lectura y aumenta la posibilidad de errores al crear una reserva.

### Solución

Se aplicó el patrón **Builder** mediante la clase:

`ReservaBuilder`

El builder permite configurar progresivamente los datos de una `Reserva` y finalmente construirla mediante:

`build()`

Ejemplo:

```java
Reserva reserva = new ReservaBuilder()
        .estudiante("Carlos Mendoza")
        .asignatura("Diseño de Software")
        .fecha("05/09/2026")
        .hora("18:00")
        .docente("Ing. Pérez")
        .modalidad("Presencial")
        .tema("Patrones de Diseño")
        .estado(EstadoReserva.PENDIENTE)
        .build();
```

### Validaciones

Antes de construir la reserva, `ReservaBuilder` verifica que los campos obligatorios estén definidos.

Por ejemplo, una reserva sin hora es rechazada durante la construcción.

Esto permite evitar la creación de objetos incompletos o inválidos.

### Ejecución

```bash
mvn clean compile
java -cp target/classes edu.uees.patrones.builder.DemoBuilder
```

---

## 3. Diagramas UML

Los diagramas UML se encuentran en la carpeta `docs`.

### Factory Method

- `docs/factory-method.puml`
- `docs/factory-method.png`

### Builder

- `docs/builder.puml`
- `docs/builder.png`

Los diagramas representan las clases, interfaces, operaciones y relaciones implementadas en el código Java.

---

## 4. Estructura del proyecto

```text
semana3-patrones/
│
├── docs/
│   ├── builder.png
│   ├── builder.puml
│   ├── factory-method.png
│   └── factory-method.puml
│
├── src/main/java/edu/uees/patrones/
│   │
│   ├── factory/
│   │   ├── Notificador.java
│   │   ├── NotificadorEmail.java
│   │   ├── NotificadorSMS.java
│   │   ├── NotificadorWhatsApp.java
│   │   ├── NotificadorPush.java
│   │   ├── CreadorNotificador.java
│   │   ├── CreadorEmail.java
│   │   ├── CreadorSMS.java
│   │   ├── CreadorWhatsApp.java
│   │   ├── CreadorPush.java
│   │   └── DemoFactoryMethod.java
│   │
│   └── builder/
│       ├── EstadoReserva.java
│       ├── Reserva.java
│       ├── ReservaBuilder.java
│       └── DemoBuilder.java
│
├── .gitignore
├── pom.xml
└── README.md
```

---

## 5. Tecnologías utilizadas

- Java 21
- Maven
- PlantUML
- Git
- GitHub
- Visual Studio Code

---

## 6. Compilación del proyecto

Para comprobar que todo el proyecto compila correctamente:

```bash
mvn clean compile
```

El resultado esperado es:

```text
BUILD SUCCESS
```

---

## 7. Relación con el diseño anterior

Esta implementación mantiene como contexto el **Sistema de Gestión de Tutorías** desarrollado previamente.

Factory Method mejora la creación de los mecanismos de notificación utilizados por el sistema, mientras que Builder mejora la construcción de las reservas de tutoría.

De esta manera, los patrones no se aplican como ejemplos aislados, sino como mejoras sobre un dominio previamente diseñado.

---

## Autor

Charlie Alejandro López Vivas

Asignatura: Diseño de Software - UCOM0310