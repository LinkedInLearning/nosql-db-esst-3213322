package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

public record Sales(@MongoId ObjectId id, Integer quantity) {
}