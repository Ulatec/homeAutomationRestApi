package com.teamtreehouse.dao;

import com.teamtreehouse.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mark on 10/7/17.
 */
@RepositoryRestResource
public interface RoomDao extends CrudRepository<Room, Long> {
}
