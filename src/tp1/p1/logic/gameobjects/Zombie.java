package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Zombie {
	
	private int x, y;
	private int resist;
	private int dmg;
	private double speed;
	private Game game;
	private String name = "Z";
	
	public Zombie(int x, int y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
		this.resist = 5;
		this.dmg = 1;
		this.speed = 0.5;//se mueve una casilla cada 2 ciclos 
	}
	
	public String getDescription() { 
		
		String desc = this.name+"["+ this.resist +"]";
		
		return desc;
	}
	
}
