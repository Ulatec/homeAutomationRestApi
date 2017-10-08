package com.teamtreehouse.dao;

import com.teamtreehouse.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by mark on 10/7/17.
 */
@RepositoryRestResource
public interface UserDao extends CrudRepository<User, Long> {
    User findByName(String name);
}
