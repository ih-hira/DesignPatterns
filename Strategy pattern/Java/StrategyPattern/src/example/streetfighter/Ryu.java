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
public class Ryu extends Fighter{
    
    
    public Ryu(){
        this.rollBehavior = new NoRoll();
        this.jumpBehavior = new LongJump();
    }

    @Override
    void display() {
        System.out.println("Hey ! I am Ryu...");
    }
    
}
