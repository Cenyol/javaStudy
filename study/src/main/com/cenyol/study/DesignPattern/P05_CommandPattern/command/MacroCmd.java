package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

import com.cenyol.study.DesignPattern.P05_CommandPattern.product.Light;

/**
 * Created by cenyol on 14/04/2017.
 */
public class MacroCmd implements iCommand{
    private iCommand[] cmdList;

    public MacroCmd(iCommand[] cmdList){
        this.cmdList = cmdList;
    }

    public void execute() {
        for (int i = 0; i < cmdList.length; i++){
            cmdList[i].execute();
        }
    }

    public void undo() {
        for (int i = 0; i < cmdList.length; i++){
            cmdList[i].undo();
        }
    }
}
