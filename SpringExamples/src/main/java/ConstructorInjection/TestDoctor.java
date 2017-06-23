package ConstructorInjection;

import ConstructorInjection.bean.SocialWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jcon928 on 6/23/2017.
 */
public class TestDoctor {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Doctor.xml");
        SocialWorker socialWorker = (SocialWorker) context.getBean("vetenarydoctor");
       socialWorker.doSocialWork();
    }
}
