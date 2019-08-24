/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.mediaplayer;

/**
 *
 * @author ih_hi
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
        System.out.println("Play VLC file ....");
    }

    @Override
    public void playMp4() {
        //do nothing
    }
    
}
