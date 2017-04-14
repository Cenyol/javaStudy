package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Light;

/**
 * Created by cenyol on 14/04/2017.
 */
public class LightOnCmd implements iCommand{
    private Light light;

    public LightOnCmd(Light light){
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
