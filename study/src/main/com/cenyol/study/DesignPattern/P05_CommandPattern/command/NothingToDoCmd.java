package com.cenyol.study.DesignPattern.P05_CommandPattern.command;

/**
 * Created by cenyol on 14/04/2017.
 */
public class NothingToDoCmd implements iCommand{

    public NothingToDoCmd(){}

    public void execute() {}

    public void undo() {}
}
