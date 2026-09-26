package com.tole.energy;
import com.tole.energy.model.Device;
import com.tole.energy.model.Measurement;
import com.tole.energy.model.Alert;
import com.tole.energy.service.EnergyMonitoringService;


public class Main {
     public static void main(String[] args) {
            
     System.out.println("Virtual Energy & IOT Monitoring Platform");
     System.out.println("Project skeleton is working.");
     System.out.println("Git is now tracking this project.");

     Device device = new Device(1, "Solar Panel 1", "SOLAR_PANEL");
       

      System.out.println(device.getName());
      System.out.println(device.getId());
      System.out.println(device.getType());


      Measurement measurement = new Measurement(device,230.5, 4.75);

      System.out.println(measurement.calculatePower());
      System.out.println(measurement.getDevice().getName());

      Alert alert = new Alert( device,"VOLTAGE IS TOO HIGH", "HIGH");
      
    System.out.println(alert.getDevice().getName());
    System.out.println(alert.getMessage());
    System.out.println(alert.getSeverity());

    EnergyMonitoringService service = new EnergyMonitoringService();

Alert result = service.checkMeasurement(measurement);

if (result != null) {
  System.out.println("Alert");
    System.out.println(result.getDevice().getName());
    System.out.println(result.getMessage());
    System.out.println(result.getSeverity());
    
}



    }
    
}
