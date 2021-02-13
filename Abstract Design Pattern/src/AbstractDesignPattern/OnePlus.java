package AbstractDesignPattern;

public class OnePlus implements Device {
    private String Processor;
    private String Ram;


    public OnePlus(String Processor, String Ram){
        this.Processor=Processor;
        this.Ram = Ram;

    }



    @Override
    public String getDetails() {
        return "OnePlus Configuration::  " +
                " Processor:"+this.Processor+
                ", Ram Size:"+this.Ram;
    }

    @Override
    public String toString() {
        return "OnePlus{" +
                "Processor='" + Processor + '\'' +
                ", Ram='" + Ram + '}';
    }
}
