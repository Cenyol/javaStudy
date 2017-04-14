package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Hottub;

/**
 * Created by cenyol on 14/04/2017.
 */
public class HottubOnCmd implements iCommand{
    private Hottub hottub;

    public HottubOnCmd(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOn();
        hottub.setTemp(30);
    }

    public void undo() {
        hottub.jetsOff();
    }
}
