ackage net.youssef.org.example;

@Component
public class MyService {

    @Autowired
    private MyRepository repo;

    public void doSomething() {
        repo.sayHello();
    }
}
