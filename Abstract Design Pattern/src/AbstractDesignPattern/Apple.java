package AbstractDesignPattern;

public class Apple implements Device {
    private String Processor;
    private String Ram;
    private String OS;
    private String hardDisk;

    public Apple(String Processor, String Ram, String OS, String hardDisk){
        this.Processor=Processor;
        this.Ram = Ram;
        this.OS = OS;
        this.hardDisk = hardDisk;
    }



    @Override
    public String getDetails() {
        return "Apple Configuration::  " +
                " Processor:"+this.Processor+
                ", Ram Size:"+this.Ram+
                ", Operating System:"+this.OS+
                ", HardDisk:"+this.hardDisk;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "Processor='" + Processor + '\'' +
                ", Ram='" + Ram + '\'' +
                ", OS='" + OS + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }
}
