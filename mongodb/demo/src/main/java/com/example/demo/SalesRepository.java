package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesRepository extends MongoRepository<Sales, ObjectId> {
}
