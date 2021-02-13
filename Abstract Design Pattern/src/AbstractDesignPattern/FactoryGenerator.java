package AbstractDesignPattern;

public class FactoryGenerator {
    public static AbstractFactoryDesign getFactory(FactoryType factoryType){
        switch(factoryType){
            case LAPTOPFACTORTY:
            return new LaptopFactory();

            case MOBILEFACTORY:
                return new MobileFactory();
        }
        return null;
    }
}
