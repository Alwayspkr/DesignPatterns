package AbstractDesignPattern;

public class Nokia implements Device {
    private String Processor;
    private String Ram;
    private String OS;


    public Nokia(String Processor, String Ram, String OS){
        this.Processor=Processor;
        this.Ram = Ram;
        this.OS = OS;

    }




    @Override
    public String getDetails() {
        return "Nokia Configuration::  " +
                " Processor:"+this.Processor+
                ", Ram Size:"+this.Ram+
                ", Operating System:"+this.OS;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "Processor='" + Processor + '\'' +
                ", Ram='" + Ram + '\'' +
                ", OS='" + OS +
                '}';
    }
}
