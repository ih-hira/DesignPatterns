/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.calculator;

/**
 *
 * @author ih_hi
 */
public class Operation {
    private OperationBehaviorInterface strategy;
    
    public Operation(OperationBehaviorInterface strategy){
        this.strategy = strategy;
    }
    
    public int executeOperation(int num1,int num2){
        return strategy.doOperation(num1, num2);
    }
}
