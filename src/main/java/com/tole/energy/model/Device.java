package com.tole.energy.model;

public class Device {
    private int id;
    private String name;
    private String type;
   

public Device(int id, String name, String type){
    this.id = id;
    this.name = name;
    this.type = type;
    
}
public String getName(){
    return name;
}
public int getId(){
    return id;
}
public String getType(){
    return type;
}


    
}
