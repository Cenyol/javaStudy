package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Stereo;

/**
 * Created by cenyol on 14/04/2017.
 */
public class StereoOnForCDCmd implements iCommand{
    private Stereo stereo;

    public StereoOnForCDCmd(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(18);
    }

    public void undo() {
        stereo.off();
    }
}
