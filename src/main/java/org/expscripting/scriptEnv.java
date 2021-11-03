
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.expscripting;

import java.util.HashMap;
import java.util.Optional;

/**
 *
 * @author david
 */
public class scriptEnv {

    private final scriptEnv parent;
    private HashMap<String, Object> givenLocalExtAttrs;
    private HashMap<String, Object> envFunctions;

    public scriptEnv(scriptEnv parentEnv, HashMap<String, Object> localAttrs) {
        this.parent = parentEnv;
        this.givenLocalExtAttrs = localAttrs;
    }

    public Optional parseScript(String scriptString) {

        return Optional.empty();
    }
    public Optional runLine(String lineString){
        //Parse and run single line, in environment
        return Optional.empty();
    }
    public Optional run() {

        return Optional.empty();
    }

    public Optional getFunction(String function) {
        if (envFunctions.containsKey(function)) {
            return Optional.of(envFunctions.get(function));
        }
        if (parent != null) {
            return parent.getFunction(function);
        } else {
            return Optional.empty();
        }
    }

}
