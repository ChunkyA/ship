package player;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Position;

import logik.Grid;
import ship.Ship;

public class Player {

	private Grid PlayerGrid;
	private Grid Enemygrid;
	private List<Ship> ships;
	
	
	public Player() {
		this.PlayerGrid = new Grid();
		this.Enemygrid = new Grid();
		this.ships = new ArrayList<>(10);
	}
	
	
	
	 //public Array shooting(Position pos) {
		
		
		
	//}
	
	
	
	
	public Grid getPlayerGrid() {
		
		return PlayerGrid;
	}
	
	public Grid getEnemygrid() {
		
		return Enemygrid;
		
	}
	
	
	
}
