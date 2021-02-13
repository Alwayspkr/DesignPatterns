package FactoryDesignPattern;

public class factoryDesignPattern {
    public static void main(String[] args) {

    LapTop hp = new HP("AMD Duel Core", "8gb", "Windows 10", "Yes");
    LapTop dell = new Dell("Intel", "12gb", "Windows 8.1", "No");
    LapTop mac = new Mac("Intel Xeon W", "20gb", "macOS", "Yes");
    LapTop lenovo = new Lenovo("Inel Core", "16gb", "Windows 7", "Yes");


        System.out.println( hp.getConfiguration());
        System.out.println( dell.getConfiguration());
        System.out.println( mac.getConfiguration());
        System.out.println( lenovo.getConfiguration());
}}
