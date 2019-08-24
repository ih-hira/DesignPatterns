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
public class Adapter implements MediaPlayer{

    AdvancedMediaPlayer advMediaPlayer;
    
    public Adapter(AdvancedMediaPlayer advMediaPlayer){
        this.advMediaPlayer = advMediaPlayer;
    }
    
    @Override
    public void play() {
        if (advMediaPlayer instanceof VlcPlayer){
            advMediaPlayer.playVlc();
        }
        else if(advMediaPlayer instanceof Mp4Player){
            advMediaPlayer.playMp4();
        }
    }
    
}
