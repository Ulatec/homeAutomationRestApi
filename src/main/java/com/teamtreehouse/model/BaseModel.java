package com.teamtreehouse.model;

import javax.persistence.*;

/**
 * Created by mark on 10/7/17.
 */
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Version
    private Long version;

    protected BaseModel(){
        id = null;
    }
}
