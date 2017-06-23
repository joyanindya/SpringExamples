package ConstructorInjection.bean;

/**
 * Created by jcon928 on 6/23/2017.
 */
public class VetenaryDoctor extends Doctor {

    private Animal animal;

    public VetenaryDoctor(Animal animal) {
        super();
        this.animal = animal;
    }

    public VetenaryDoctor(String typeOfSocialWork,Animal animal ){
        super(typeOfSocialWork);
        this.animal=animal;
    }
    @Override
    public void doSocialWork(){
        super.doSocialWork();
        animal.typeOfAnimal();

    }
}
