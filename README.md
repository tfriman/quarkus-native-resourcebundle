# nativemessagebundle project

Seems MessageBundle is being resolved only to default locale when using native.

## JVM test:

Start app in dev mode
```
mvn quarkus:dev
```

Call with default "en"
```
curl localhost:8080/en
```

Result: "English key"

Call with fi
```
curl localhost:8080/en
```
Result: "Finnish key"

## Native

Create native image
```
mvn clean package -DskipTests -Pnative
```

Start native
```
target/nativemessagebundle-1.0.0-SNAPSHOT-runner
```

Call with default "en"
```
curl localhost:8080/en
```

Result: "English key"

Call with fi
```
curl localhost:8080/en
```
Result: "English key" instead of "Finnish key".


