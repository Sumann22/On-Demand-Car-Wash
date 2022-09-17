package com.casestudy.usermicroservice.Repository;

import com.casestudy.usermicroservice.model.Ratings;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepo extends MongoRepository<Ratings, Integer> {

}
