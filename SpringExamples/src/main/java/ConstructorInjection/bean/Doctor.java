package ConstructorInjection.bean;

/**
 * Created by jcon928 on 6/23/2017.
 */
public class Doctor implements SocialWorker {

    private String typeOfSocialWork;

    public Doctor() {
    }

    public Doctor(String typeOfSocialWork) {
        this.typeOfSocialWork = typeOfSocialWork;
    }

    public void doSocialWork() {
        System.out.println("The Doctor Generally "+typeOfSocialWork);
    }
}
