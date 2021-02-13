package FactoryDesignPattern;

public class Dell implements LapTop{

    private String Processor;
    private String Ram;
    private String OS;
    private String hardDisk;

    public Dell(String Processor, String Ram, String OS, String hardDisk){
        this.Processor=Processor;
        this.Ram = Ram;
        this.OS = OS;
        this.hardDisk = hardDisk;
    }



    @Override
    public String getConfiguration() {
        return "Dell Configuration::  " +
                " Processor:"+this.Processor+
                ", Ram Size:"+this.Ram+
                ", Operating System:"+this.OS+
                ", HardDisk:"+this.hardDisk;


    }
}
