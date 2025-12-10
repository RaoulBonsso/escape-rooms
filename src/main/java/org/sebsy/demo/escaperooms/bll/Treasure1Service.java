package org.sebsy.demo.escaperooms.bll;

import org.springframework.stereotype.Service;

@Service
public class Treasure1Service implements TreasureService {

    public String ouvrir() {
        return "Perdu, vous êtes tombé dans un piège !";
    }

}
