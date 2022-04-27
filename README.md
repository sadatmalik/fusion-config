# Fusion Config Server

Configuration server for Fusion, a microservice based personal finance management web application. 

## Build & Run

Use the following command to build a docker image.

```bash
mvn clean package dockerfile:build
```

Run the Docker image using the following docker command:

```bash
docker run -d -p 8071:8071 fusion/fusion-config:0.0.1-SNAPSHOT
```

You may also start the service via docker compose at [Fusion Web](https://github.com/sadatmalik/fusion-web).
