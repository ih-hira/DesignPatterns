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
public class Adapter implements ToyDuck {

    Bird bird;

    public Adapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }

}
