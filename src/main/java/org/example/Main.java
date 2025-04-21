package org.example;

import org.example.demo.MyService;
import org.example.framework.core.AnnotationApplicationContext;

public class Main {
    public static <AnnotationApplicationContext> void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("org.example.demo");
        org.example.MyService service = context.getBean(MyService.class);
        service.doSomething();
    }
}
