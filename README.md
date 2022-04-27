# Fusion Config Server

Configuration server for Fusion, a microservice based personal finance management web application. 

## Build & Run

Use the following command to build a docker image.

```bash
mvn clean package dockerfile:build
```

Run the Docker image using the following docker command:

```bash
docker run -d -p 8082:8082 fusion/fusion-config:0.0.1-SNAPSHOT
```

Or you may start the services using docker compose in [Fusion Web](https://github.com/sadatmalik/fusion-web).
