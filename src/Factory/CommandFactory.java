/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Service.ScriptExec;

/**
 *
 * @author RipPer
 */
public class CommandFactory {
    
    private String getScriptByCommandID(String commandID){
        return commandID + ".sh";
    }
    
    public void executeCommand(String commandID){
        ScriptExec scriptExec = new ScriptExec();
        scriptExec.executeScript(getScriptByCommandID(commandID));
    }
}
