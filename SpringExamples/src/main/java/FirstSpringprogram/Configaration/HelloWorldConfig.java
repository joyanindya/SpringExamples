package FirstSpringprogram.Configaration;

import FirstSpringprogram.domain.HelloWorld;
import FirstSpringprogram.domain.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;

/**
 * Created by jcon928 on 6/22/2017.
 */
public class HelloWorldConfig {

    @Bean(name = "helloWorldBean")
    @Description("This is a simple hello world bean")
    public HelloWorld helloWorld(){
        return new HelloWorldImpl();
    }
}
