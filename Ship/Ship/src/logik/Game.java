package logik;

import player.Player;

public class Game {

	private Player player1;
	private Player player2;
	private long StartTime;
	private long EndTime;
	
	
	public Game() {
		
		this.player1 = new Player();
		this.player2 = new Player();
		
	}
	
	
	
	public void StartTime() {
		
		StartTime = System.currentTimeMillis();
		
	}
	
	
	public String EndTime() {
		
		EndTime = System.currentTimeMillis();
		long GameTime = EndTime - StartTime ;
		
	    long seconds = (GameTime / 1000) % 60;
	    long minutes = (GameTime / 1000) / 60;
	    return minutes + " Minuten und " + seconds + " Sekunden";
		
	}
	
	
	
	
}
