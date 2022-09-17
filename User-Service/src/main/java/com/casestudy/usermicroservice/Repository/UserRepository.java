package com.casestudy.usermicroservice.Repository;

import com.casestudy.usermicroservice.model.Role;
import com.casestudy.usermicroservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    //To find a User with his/her email
    User findByEmail(String email);
    //To find user using his/her role
    List<User> findByRolesIn(Set<Role> roles);
}
