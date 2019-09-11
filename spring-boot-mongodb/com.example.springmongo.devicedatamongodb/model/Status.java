package com.example.springmongo.devicedatamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DeviceData")
public class Status {

    @Id
    String id;
    String healthStatus;
    String networkStrength;

    public Status(){

    }

    public Status(String id, String healthStatus, String networkStrength){
        this.id = id;
        this.healthStatus = healthStatus;
        this.networkStrength = networkStrength;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getHealthStatus(){
        return this.healthStatus;
    }

    public void setHealthStatus(String healthStatus){
        this.healthStatus = healthStatus;
    }

    public String getNetworkStrength(){
        return this.networkStrength;
    }

    public void setNetworkStrength(String networkStrength){
        this.networkStrength = networkStrength;
    }
}
