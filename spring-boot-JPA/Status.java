package com.example.springjparepo.crudrepo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
