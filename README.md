# BIOS

![Build Backend](https://github.com/VincentDroppelmann/BIOS/workflows/Build%20Backend/badge.svg)

Bücherei Implemented On Spring

## Entwicklung

```
cd src/main/frontend/bios
ng build --watch
```

```
gradlew bootRun
```


docker run --name biosdb -e POSTGRES_PASSWORD=bios -p 5432:5432 -d postgres
