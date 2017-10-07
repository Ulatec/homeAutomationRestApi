package com.teamtreehouse.model;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by mark on 10/7/17.
 */
@Entity
public class Room extends BaseModel{
    String name;
    int area;
    List<Device> devices;
    List<User> administrators;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
