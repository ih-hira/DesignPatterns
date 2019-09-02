/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.streetfighter;

/**
 *
 * @author ih_hi
 */
public class NoRoll implements RollBehaviorInterface{

    @Override
    public void roll() {
        System.out.println("I can't Roll");
    }
    
}
