package SetterPropertiesInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jcon928 on 6/23/2017.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
