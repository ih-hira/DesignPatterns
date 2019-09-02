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
public class StrategyPatternDemo {
    public static void main(String args[]){
        Operation op1 = new Operation(new OperationAdd());
        System.out.println(op1.executeOperation(5, 6));
    }
}
