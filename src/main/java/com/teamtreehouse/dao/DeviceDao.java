package com.teamtreehouse.dao;

import com.teamtreehouse.model.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mark on 10/7/17.
 */
@RepositoryRestResource
public interface DeviceDao extends CrudRepository<Device, Long>{

}
