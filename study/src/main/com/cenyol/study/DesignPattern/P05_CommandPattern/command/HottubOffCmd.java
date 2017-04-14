package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Hottub;

/**
 * Created by cenyol on 14/04/2017.
 */
public class HottubOffCmd implements iCommand{
    private Hottub hottub;

    public HottubOffCmd(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute() {
        hottub.jetsOff();
    }

    public void undo() {
        hottub.jetsOn();
        hottub.setTemp(30);
    }
}
