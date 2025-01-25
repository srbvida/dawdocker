
# Usa una imagen base oficial de Java con OpenJDK
FROM openjdk:23-jdk-slim

#Variables de entorno
ENV NAME Sandra

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY app.jar /app/app.jar

# Define el comando para ejecutar el JAR
CMD ["java", "-jar", "app.jar"]


