package org.example;

import net.youssef.org.example.MyRepository;

public class MyService {

    @Autowired
    private MyRepository repo;

    public void doSomething() {
        repo.sayHello();
    }
}

