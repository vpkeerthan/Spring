package com.example.springmongo.devicedatamongodb.controller;

import com.example.springmongo.devicedatamongodb.model.Status;
import com.example.springmongo.devicedatamongodb.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/status")
public class StatusController {

    @Autowired
    private StatusRepository statusRepository;

    @PostMapping("/addStatus")
    public void addStatus(@RequestBody Status status){
        statusRepository.save(status);
    }

    @GetMapping("/getStatus")
    public List<Status> getStatus(){
        List<Status> statuses = new ArrayList<>();
        statusRepository.findAll().forEach(statuses::add);
        return statuses;
    }
}
