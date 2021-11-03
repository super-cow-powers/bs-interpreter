/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.expscripting;

import java.util.Optional;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 *
 * @author david
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ScriptException {
        scriptEnv test_env = new scriptEnv(null, null);
        Optional tr = (Optional) test_engine.eval("");
        if (tr.isEmpty()){
            System.out.println(factory.getEngineName() + "Is EMPTY");
        } else {
            System.out.println("Is NOT EMPTY");
        }
    }
    
}
