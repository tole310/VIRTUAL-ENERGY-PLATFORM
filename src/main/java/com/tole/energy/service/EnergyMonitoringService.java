package com.tole.energy.service;
import com.tole.energy.model.Measurement;
import com.tole.energy.model.Alert;

public class EnergyMonitoringService {
    Measurement measurement;
    private double voltage;


    public double getVoltage() {
    return voltage;
}


public class  EnergyMonitoringService {

    public Alert checkMeasurement(Measurement measurement){
if (measurement.getvoltage() > 250)
    {

    return new Alert( measurement.getDevice(),"VOLTAGE IS TOO HIGH","HIGH");
}
return null;
    }
}

    
}
