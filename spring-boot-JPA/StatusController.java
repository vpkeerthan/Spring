package com.example.springjparepo.crudrepo.topic;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/status")
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService){
        this.statusService = statusService;
    }

    @PostMapping(value = "/data")
    public void addStatus(@RequestBody Status status){
        statusService.addStatus(status);
    }

    @GetMapping(value = "/getData")
    public List<Status> getStatus(){
        return statusService.getAllStatus();
    }
}
