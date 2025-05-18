# 🧪 Challenge — Spring Security Nivel Intermedio

## 🎯 Objetivo

- Reemplazar el login por defecto de Spring Security con un endpoint personalizado (`/api/login`).
- Validar credenciales contra una base de datos en memoria (H2).
- Agregar validaciones a los DTOs.
- Implementar manejo global de excepciones.
- Proteger todos los endpoints: solo usuarios autenticados pueden operar.

---

## 🧱 Requisitos Técnicos

- Spring Boot 3+
- Spring Web
- Spring Security
- Spring Data JPA
- H2 Database
- Bean Validation (Jakarta Validation)
- (Opcional) Lombok

---

## 🛠️ Instrucciones

### Paso 1: Crear el microservicio

- Entidad `Usuario` (id, username, password).
- Entidad `Producto` (id, nombre, precio).
- Repositorio de usuarios para autenticación.
- CRUD completo de productos protegido por seguridad.
- Base de datos H2 poblada desde `data.sql`.

---

### Paso 2: Seguridad

- Desactivar el login por defecto de Spring Security.
- Implementar un controlador de autenticación con endpoint `POST /api/login`.
- El usuario envía credenciales (username y password) por JSON.
- Si son válidas, responder con un mensaje de bienvenida.
- Si son incorrectas, responder con error HTTP 401.

---

### Paso 3: Validaciones

- Utilizar `@Valid` en los DTOs.
- Ejemplo: nombre no vacío, precio mayor a cero.
- Validar que el JSON esté bien formado.

---

### Paso 4: Manejo de errores

- Usar `@RestControllerAdvice` para manejar errores globalmente.
- Capturar:
    - `MethodArgumentNotValidException`
    - Usuario no encontrado / contraseña incorrecta
    - Errores de autenticación
    - Excepciones generales

---

## ✅ Checklist

- [ ] CRUD funcional de `Producto`.
- [ ] Entidad `Usuario` con credenciales en base de datos.
- [ ] Endpoint `POST /api/login` funcional.
- [ ] Seguridad configurada: sin login UI, todo requiere autenticación.
- [ ] Validaciones aplicadas a los DTOs.
- [ ] Estructura clara para los errores.
- [ ] Consola H2 accesible (opcional).

---

## 🧠 ¿Qué deberías aprender?

- Cómo reemplazar el login por defecto de Spring Security.
- Qué es `AuthenticationManager`.
- Cómo usar `UsernamePasswordAuthenticationToken`.
- Cómo proteger un microservicio REST completo.
- Validaciones automáticas con `@Valid`.
- Manejo de errores profesional y centralizado.
- Buenas prácticas para APIs REST seguras.

---

## 💡 Tips y conceptos clave

### 🔐 Login personalizado
Spring Security permite definir tu propia lógica de login mediante un endpoint manual.

### 🛡️ AuthenticationManager
Valida credenciales usando un token de tipo `UsernamePasswordAuthenticationToken`.

### 📑 Validaciones DTO
Usá anotaciones como `@NotBlank`, `@Min`, `@Email`, etc. El uso de `@Valid` en el controlador lanza excepciones automáticamente si hay errores.

### 🧯 RestControllerAdvice
Permite capturar errores comunes desde un solo lugar, con métodos `@ExceptionHandler`.

---

## 🔥 Bonus (Opcional)

- Loguear intentos de login exitosos y fallidos.
- Crear un endpoint `POST /api/usuarios` para registrar nuevos usuarios.
- Dejar todo listo para integrar JWT en el siguiente nivel.

---

