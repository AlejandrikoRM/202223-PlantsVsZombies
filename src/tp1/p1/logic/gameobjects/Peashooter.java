package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Peashooter {
	private Game game;
	private int x, y;
	private int cost;
	private int resist;
	private double freq;
	private int dmg;
	
	public Peashooter(int x, int y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
		this.cost = 50;
		this.resist = 3;
		this.freq = 1;//  1 disparo por ciclo
		this.dmg = 1;
	}

	public static String getDescription() {
		
		String desc = "S["/*resistencia*/ +"]";
		
		return desc;
	}

	public int getResist() {
		return resist;
	}

	public void setResist(int resist) {
		this.resist = resist;
	}

}
