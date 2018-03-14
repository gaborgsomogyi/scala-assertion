# A scala app that tests assertion enable/disable

## Compile the app with assertions
```
$ mvn clean package
...
$ java -jar target/scala-assertion-0.0.1-SNAPSHOT-jar-with-dependencies.jar 
>>> 20/09/16 14:22:58 INFO scala.Assertion$: Firing assertion...
>>> 20/09/16 14:22:58 INFO scala.Assertion$: Assertion fired
```

## Compile the app without assertions
```
$ mvn clean package -Pnoassert
...
$ java -jar target/scala-assertion-0.0.1-SNAPSHOT-jar-with-dependencies.jar 
>>> 20/09/16 14:24:11 INFO scala.Assertion$: Firing assertion...
>>> 20/09/16 14:24:11 INFO scala.Assertion$: Assertion NOT fired
```
