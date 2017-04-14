package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.GarageDoor;

/**
 * Created by cenyol on 14/04/2017.
 */
public class GarageDoorOpenCmd implements iCommand{
    private GarageDoor garageDoor;

    public GarageDoorOpenCmd(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }

    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
