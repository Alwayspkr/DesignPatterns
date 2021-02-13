package AbstractDesignPattern;

public class LaptopFactory extends AbstractFactoryDesign {

    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType) {
            case HP:
                return new HP("AMD Duel Core", "12gb", "Windows", "No");

            case DELL:
                return new Dell("Intel","16gb", "Windows 10","Yes");

            case APPLE:
                return new Apple("Intel Xeon W", "20gb", "macOS", "Yes");

        }
        return null;
    }
}