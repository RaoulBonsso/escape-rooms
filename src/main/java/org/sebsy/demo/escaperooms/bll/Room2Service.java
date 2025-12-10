package org.sebsy.demo.escaperooms.bll;

import org.springframework.stereotype.Service;

@Service
public class Room2Service implements RoomService {

    @Override
    public String entreeSalle() {
        return "Perdu, vous etes dans la mauvaise salle !";
    }

}
