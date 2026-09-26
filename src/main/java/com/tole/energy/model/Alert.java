package com.tole.energy.model;

public class Alert {
    private Device device;
    private String message;
    private String severity;

    public Alert( Device device, String message, String severity){
        this.device = device;
        this.message = message;
        this.severity = severity;

    }
    public Device getDevice() {
    return device;
    }

    public String getMessage(){
        return message;
    }
    public String getSeverity() {
    return severity;
    }


}
