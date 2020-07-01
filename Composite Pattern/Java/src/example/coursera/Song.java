package example.coursera;

public class Song implements IComponent{
	
	public String songName;
	public String artist;
	public float speed = 1;

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Song played..");
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		System.out.println("Playback speed "+speed);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.songName;
	}
	public String getArtist() {
		// TODO Auto-generated method stub
		return this.artist;
	}
}
