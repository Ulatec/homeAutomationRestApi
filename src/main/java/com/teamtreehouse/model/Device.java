package com.teamtreehouse.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by mark on 10/7/17.
 */
@Entity
public class Device extends BaseModel{
    String name;
    @ManyToOne
    Room room;
    List<Control> control;
}
