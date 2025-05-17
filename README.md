# Mini DI Framework

Un framework d'injection de dépendances léger et simple pour Java, inspiré par Spring.

## Description

Mini DI Framework est une implémentation minimaliste d'un conteneur d'injection de dépendances (Dependency Injection) pour Java. Ce framework permet de gérer les dépendances entre les composants d'une application Java en utilisant des annotations, similaire à Spring mais avec une empreinte beaucoup plus légère.

## Fonctionnalités

- Injection de dépendances par annotations
- Scan automatique des composants
- Gestion du cycle de vie des beans
- Support des annotations `@Component` et `@Autowired`

## Prérequis

- Java 21 ou supérieur
- Maven 3.6 ou supérieur

## Installation

Pour utiliser ce framework dans votre projet Maven, clonez ce dépôt et installez-le localement :

```bash
git clone https://github.com/SANTOOOF/mini-di-framework.git
cd mini-di-framework
mvn clean install
```

Ensuite, ajoutez la dépendance à votre fichier `pom.xml` :

```xml
<dependency>
    <groupId>org.example</groupId>
    <artifactId>mini-di-framework</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Utilisation

1. Créez vos classes de service et marquez-les avec l'annotation `@Component` :

```java
package org.example.demo;

import net.youssef.Component;

@Component
public class MyService {
    public void doSomething() {
        System.out.println("Service is doing something!");
    }
}
```

2. Utilisez l'annotation `@Autowired` pour injecter des dépendances :

```java
package org.example.demo;

import net.youssef.Component;
import org.example.Autowired;

@Component
public class MyController {
    private final MyService myService;
    
    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }
    
    public void processRequest() {
        myService.doSomething();
    }
}
```


3. Initialisez le contexte d'application et récupérez vos beans :

```java
import org.example.framework.core.AnnotationApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("org.example.demo");
        MyService service = context.getBean(MyService.class);
        service.doSomething();
    }
}
```



## Licence

Ce projet est distribué sous licence open source.
