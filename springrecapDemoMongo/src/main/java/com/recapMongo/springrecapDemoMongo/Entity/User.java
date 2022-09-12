package com.recapMongo.springrecapDemoMongo.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "hello")
public class User {
    private String id;
    private String name;
    private String lname;
}
