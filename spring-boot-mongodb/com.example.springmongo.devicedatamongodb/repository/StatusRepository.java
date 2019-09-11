package com.example.springmongo.devicedatamongodb.repository;

import com.example.springmongo.devicedatamongodb.model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatusRepository extends MongoRepository<Status,String> {
}
