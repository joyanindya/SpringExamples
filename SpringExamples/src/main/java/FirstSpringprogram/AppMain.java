package FirstSpringprogram;

import FirstSpringprogram.Configaration.HelloWorldConfig;
import FirstSpringprogram.domain.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by jcon928 on 6/22/2017.
 */
public class AppMain {

    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
        bean.sayHello("Spring 4");
        context.close();
    }

}
