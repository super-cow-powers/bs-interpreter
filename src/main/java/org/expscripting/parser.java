/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.expscripting;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author david
 */
public class parser {
    public enum operatorTypes{
        ASSIGN,
        ADD,
        MULTIPLY,
        SUBTRACT,
        DIVIDE,
        MOD,
        GREATER_THAN,
        EQUAL_TO,
        LESS_THAN,
        G_E,
        L_E
    }
    
    public class astNode {
        private List<astNode> childNodes;
        
        public astNode addChild(astNode child){
            childNodes.add(child);
            return this;
        }
        public List<astNode> getChildren(){
            return childNodes;
        }
    }
    public class rootNode extends astNode{
        private HashMap<String, Object> localVars;
        public final String name;
        public rootNode(String name){
            this.name = name;
        }
    }
    public class whileNode extends astNode{
        
    }
    public class branchNode extends astNode{
        
    }
    public class operatorNode extends astNode{
        private final operatorTypes type;
        public operatorNode(operatorTypes opType){
            this.type = opType;
        }
        public operatorTypes getType() { 
            return this.type; 
        }
    }
    public class variableNode extends astNode{
        public final String name;
        public variableNode(String nodeName) {
            this.name = nodeName;
        } 
    }
    
    private HashMap<String, astNode> functionRoots;
    
    public Optional<HashMap<String, astNode>> parse(){
        
        return Optional.of(functionRoots);
    }
    
}
