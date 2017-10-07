package com.teamtreehouse.other;

import com.teamtreehouse.dao.ControlDao;
import com.teamtreehouse.dao.DeviceDao;
import com.teamtreehouse.dao.RoomDao;
import com.teamtreehouse.dao.UserDao;
import com.teamtreehouse.model.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by mark on 10/7/17.
 */
@Component
public class DBLoader implements ApplicationRunner{
    private final ControlDao controls;
    private final DeviceDao devices;
    private final RoomDao rooms;
    private final UserDao users;

    public DBLoader(ControlDao controls, DeviceDao devices, RoomDao rooms, UserDao users) {
        this.controls = controls;
        this.devices = devices;
        this.rooms = rooms;
        this.users = users;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User("Mark", "password" );
        users.save(user);
    }
}
