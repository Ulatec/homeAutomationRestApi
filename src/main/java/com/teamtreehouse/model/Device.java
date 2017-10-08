package com.teamtreehouse.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by mark on 10/7/17.
 */
@Entity
public class Device extends BaseModel{
    String name;
    @ManyToOne
    Room room;
    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    List<Control> control;
}
