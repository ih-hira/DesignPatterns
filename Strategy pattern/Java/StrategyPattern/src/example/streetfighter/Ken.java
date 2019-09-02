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
public class Ken extends Fighter{

    public Ken(){
        this.jumpBehavior = new NoJump();
        this.rollBehavior = new RollTwice();
    }
    @Override
    void display() {
        System.out.println("Hello ! I am ken ...");
    }
    
}
