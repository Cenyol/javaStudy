package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Light;

/**
 * Created by cenyol on 14/04/2017.
 */
public class LightOffCmd implements iCommand{
    private Light light;

    public LightOffCmd(Light light){
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
