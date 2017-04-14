package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Stereo;

/**
 * Created by cenyol on 14/04/2017.
 */
public class StereoOffCmd implements iCommand{
    private Stereo stereo;

    public StereoOffCmd(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(18);
    }
}
