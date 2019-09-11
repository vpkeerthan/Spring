package com.example.springjparepo.crudrepo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatus(){
        List<Status> statuses = new ArrayList<>();
        statusRepository.findAll().forEach(statuses::add);
        return statuses;
    }

    public void addStatus(Status status){
        statusRepository.save(status);
    }
}
