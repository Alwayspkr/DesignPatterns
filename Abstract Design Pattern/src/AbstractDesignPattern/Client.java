package AbstractDesignPattern;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {

        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORTY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());

        Device apple = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORTY).getGadget(DeviceType.APPLE);
        System.out.println(apple.getDetails());


        AbstractFactoryDesign mobileFactory = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY);

        Device nokia = mobileFactory.getGadget(DeviceType.NOKIA);
        System.out.println(nokia.getDetails());

        Device onePlus = mobileFactory.getGadget(DeviceType.ONEPLUS);
        System.out.println(onePlus.getDetails());

    }
}
