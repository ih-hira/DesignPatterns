/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.duck;

/**
 *
 * @author ih_hi
 */
public class Client {

    public static void main(String args[]) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        ToyDuck adapter = new Adapter(sparrow);
        // toy duck behaving like a bird 
        adapter.squeak();
    }
}
