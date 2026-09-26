package com.tole.energy.model;


public class Measurement {
    
    private Device device;
    private double voltage;
    private double  current;
    

    public Measurement( Device device,double voltage, double current){
        this.device = device;
        this.voltage = voltage;
        this.current = current;
        
    }
    public Device getDevice() {
    return device;
}


public double calculatePower(){
    return voltage * current;
}


    
}

