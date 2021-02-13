package AbstractDesignPattern;

public class MobileFactory extends AbstractFactoryDesign {

    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case NOKIA:
                return new Nokia("Octa Core", "12gb", "Windows");

            case ONEPLUS:
                return new OnePlus("Lollipop","16gb");

        }
        return null;
    }
}