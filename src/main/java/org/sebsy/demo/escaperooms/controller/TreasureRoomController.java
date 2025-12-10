package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.TreasureService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class TreasureRoomController {
    private TreasureService tresorService;

    public TreasureRoomController(@Qualifier("treasure2Service") TreasureService tresorService) {
        this.tresorService = tresorService;
    }

    public String fin() {
        return tresorService.ouvrir();
    }

    public void setTresorService(TreasureService tresorService) {
        this.tresorService = tresorService;
    }
}
