# Sử dụng hình ảnh chính thức của OpenJDK 17
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file JAR từ thư mục target vào thư mục làm việc của container
COPY target/*.jar app.jar

# Mở cổng mà ứng dụng sẽ chạy
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
