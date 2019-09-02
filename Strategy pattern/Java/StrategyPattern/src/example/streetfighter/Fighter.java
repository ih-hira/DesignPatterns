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
public abstract class Fighter {
    
    JumpBehaviorInterface jumpBehavior;
    RollBehaviorInterface rollBehavior;
    abstract void display();
    
    public void setJumpBehavior(JumpBehaviorInterface jb){
        this.jumpBehavior = jb;
    }
    public void setRollBehavior(RollBehaviorInterface rb){
        this.rollBehavior = rb;
    }
    public void kick(){
        System.out.println("Yes! I can kick you!!!");
    }
    public void punch(){
        System.out.println("Yes! I can punch you!!!");
    }
    public void move(){
        System.out.println("Yes! I can move!!!");
    }
    public void performJump(){
        jumpBehavior.jump();
    }
    public void performRoll(){
        rollBehavior.roll();
    }
}
