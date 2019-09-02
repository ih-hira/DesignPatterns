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
public class StreetFighter {
    public static void main(String args[]){
        Ken f1 = new Ken();
        Ryu f2 = new Ryu();
        
        f1.display();
        f1.performJump();
        
        f2.display();
        f2.performJump();
        
        System.out.println("~~~~After Accident~~~~");
        f2.setJumpBehavior(new ShortJump());
        f2.performJump();
    }
}
