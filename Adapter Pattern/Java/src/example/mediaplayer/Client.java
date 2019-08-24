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
public class Client {
    public static void main(String args[]){
        VlcPlayer vlcPlay = new VlcPlayer();
        vlcPlay.playVlc();
        
        MediaPlayer adapter = new Adapter(new Mp4Player());
        adapter.play();
    }
}
