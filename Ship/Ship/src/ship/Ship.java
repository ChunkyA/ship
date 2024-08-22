package ship;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Position;

public abstract class Ship {
	private String name;
    private List<Position> positions; 
    private boolean[] hits;          

    public Ship(int size,String typ) {
        this.positions = new ArrayList<>(size);
        this.hits = new boolean[size];
        this.name = typ;
    }

 

	public void setPosition(List<Position> positions) {
        this.positions = positions;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public boolean deadShip() {
        for (boolean hit : hits) {
            if (!hit) return false;
        }
        return true;
    }

    public void hit(Position pos) {
        int index = positions.indexOf(pos);
        if (index >= 0) {
            hits[index] = true;
        }
    }

    public boolean occupies(Position pos) {
        return positions.contains(pos);
    }

    public int getSize() {
        return positions.size();
    }
}

