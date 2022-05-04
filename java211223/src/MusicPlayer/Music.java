package MusicPlayer;

public class Music {

	private String song;
	

	private String singer;
	
	private String parh;
	

	public Music(String song, String singer, String parh) {
		super();
		this.song = song;
		this.singer = singer;
		this.parh = parh;
	}


	public String getSong() {
		return song;
	}


	public String getSinger() {
		return singer;
	}


	public String getParh() {
		return parh;
	}
}