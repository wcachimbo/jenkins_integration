# Imagen base: Linux con Java 17 y herramientas para compilar la aplicación.
FROM eclipse-temurin:17-jdk

# Carpeta de trabajo dentro del contenedor.
WORKDIR /app

# Copia todo el proyecto dentro del contenedor.
COPY . .

# Da permiso al Maven Wrapper y crea el archivo ejecutable JAR.
RUN chmod +x mvnw && ./mvnw package -DskipTests

# Indica que la aplicación utiliza el puerto 8999.
EXPOSE 8999

# Comando que se ejecuta automáticamente cuando inicia el contenedor.
ENTRYPOINT ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
