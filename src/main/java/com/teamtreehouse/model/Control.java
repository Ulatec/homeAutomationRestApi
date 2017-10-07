package com.teamtreehouse.model;

import javax.persistence.Entity;

/**
 * Created by mark on 10/7/17.
 */
@Entity
public class Control extends BaseModel{
    String name;
    Device device;
    int value;
    User lastModifiedBy;
}
