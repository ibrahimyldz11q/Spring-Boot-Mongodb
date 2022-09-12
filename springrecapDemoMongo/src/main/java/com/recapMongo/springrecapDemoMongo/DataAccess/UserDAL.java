package com.recapMongo.springrecapDemoMongo.DataAccess;

import com.recapMongo.springrecapDemoMongo.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAL  extends MongoRepository<User , String> {

}
