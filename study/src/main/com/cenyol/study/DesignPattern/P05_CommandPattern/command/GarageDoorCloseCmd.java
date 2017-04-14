package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.GarageDoor;

/**
 * Created by cenyol on 14/04/2017.
 */
public class GarageDoorCloseCmd implements iCommand{
    private GarageDoor garageDoor;

    public GarageDoorCloseCmd(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
    }

    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
