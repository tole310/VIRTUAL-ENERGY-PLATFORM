package com.tole.energy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tole.energy.model.Device;
import com.tole.energy.model.Measurement;
import com.tole.energy.model.Alert;
import com.tole.energy.service.EnergyMonitoringService;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // This launches the Spring Boot Application context and embedded Tomcat server
        SpringApplication.run(Main.class, args);
        
        // Your existing confirmation logs
        System.out.println("==================================================");
        System.out.println("Virtual Energy & IOT Monitoring Platform Booted!");
        System.out.println("Project framework: Spring Boot converted successfully.");
        System.out.println("==================================================");
        
        // Basic diagnostic structural checks
        Device device = new Device(1, "Solar Panel 1", "SOLAR_PANEL");
        System.out.println("Verified Device: " + device.getName());

        Measurement measurement = new Measurement(device, 230.5, 4.75);
        System.out.println("Calculated Power: " + measurement.calculatePower() + " W");

        EnergyMonitoringService service = new EnergyMonitoringService();
        Alert result = service.checkMeasurement(measurement);
        if (result != null) {
            System.out.println("Alert Condition Triggered: " + result.getMessage());
        }
    }
}
