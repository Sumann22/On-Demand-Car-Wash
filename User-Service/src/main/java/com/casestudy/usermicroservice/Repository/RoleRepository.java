package com.casestudy.usermicroservice.Repository;

import com.casestudy.usermicroservice.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {

    //To find a role by its name
    Role findByRole(String role);
}
