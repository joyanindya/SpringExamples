package FirstSpringprogram.domain;

/**
 * Created by jcon928 on 6/22/2017.
 */
public class HelloWorldImpl implements HelloWorld {
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }
}
