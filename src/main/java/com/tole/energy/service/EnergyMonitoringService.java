package com.tole.energy.service;

import com.tole.energy.model.Measurement;
import com.tole.energy.model.Alert;

public class EnergyMonitoringService {

    public Alert checkMeasurement(Measurement measurement) {
        // Casing corrected to camelCase: getVoltage()
        if (measurement.getVoltage() > 250.0) {
            return new Alert(measurement.getDevice(), "VOLTAGE IS TOO HIGH", "HIGH");
        }
        return null;
    }
}
