package logik;

public class Cell {
	
	private boolean ship;
	private boolean Hit;
	
	
	public Cell() {
		this.ship = false;
		this.Hit = false;
	}
	
	
	public boolean shipExist() {
		
		return ship;
	}
	

	
	public boolean getShip() {
		
		return Hit;
	}
	
	public void setHit(boolean Hit) {
		this.Hit = Hit;
	}
}
