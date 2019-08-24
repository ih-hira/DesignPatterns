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
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
       //do nothing
    }

    @Override
    public void playMp4() {
        System.out.println("Play MP4 Music");
    }
    
}
