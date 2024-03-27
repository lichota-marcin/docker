FROM maven:3.8.6-openjdk-8
# Set the working directory inside the container
WORKDIR /usr/src/app
# Copy the project files into the container
COPY . .
# Build the project
RUN mvn clean install -DskipTests
# At runtime, the container should be used to run tests
CMD ["mvn", "test"]