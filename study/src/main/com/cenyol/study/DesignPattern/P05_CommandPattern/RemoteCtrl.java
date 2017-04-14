package com.cenyol.study.DesignPattern.P05_CommandPattern;

import com.cenyol.study.DesignPattern.P05_CommandPattern.command.NothingToDoCmd;
import com.cenyol.study.DesignPattern.P05_CommandPattern.command.iCommand;

import java.util.Stack;

/**
 * Created by cenyol on 14/04/2017.
 */
public class RemoteCtrl {
    private iCommand[] onCommands;
    private iCommand[] offCommands;
    private Stack<iCommand> cmdHistory;

    public RemoteCtrl(){
        onCommands = new iCommand[7];
        offCommands = new iCommand[7];
        cmdHistory = new Stack<iCommand>();

        NothingToDoCmd nothingToDoCmd =  new NothingToDoCmd();
        for (int i = 0; i < 7; i++){
            onCommands[i] = nothingToDoCmd;
            offCommands[i] = nothingToDoCmd;
        }
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        cmdHistory.push(onCommands[slot]);
    }

    public void onButtonWasPushed(int slot){
        offCommands[slot].execute();
        cmdHistory.push(offCommands[slot]);
    }

    public void undo(){
        if (!cmdHistory.empty()) {
            iCommand tmpCmd = cmdHistory.pop();
            tmpCmd.undo();
        }
    }
}
