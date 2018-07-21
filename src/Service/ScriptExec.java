/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

/**
 *
 * @author RipPer
 */
public class ScriptExec {
    
    public void executeScript(String script) {
	try {
	    String bash = "/bin/bash";
	    String[] command = { bash, script };
            URL resource = this.getClass().getResource("/ressources/"+script);
	    System.out.println("Starting execute the script" + resource.toString());
	    ProcessBuilder processBuilder = new ProcessBuilder(command);
	    
	    Map<String, String> env = processBuilder.environment();
	    env.put("ENV_KEY", "ENV_VALUE");
	    Process process = processBuilder.start();
	
	    BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    String line = null;
	    while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }
	    process.waitFor();
	    System.out.println("Script executed successfully");
	} catch (IOException | InterruptedException e) {
	    throw new RuntimeException("Can not execute the install script successfully");
	}
    }
}
