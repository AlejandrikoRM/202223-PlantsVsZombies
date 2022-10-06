package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Sunflower {

	private int x, y;
	private int cost;
	private int resist;
	private double freq;
	private int dmg;
	private Game game;
	private String name = "S";
	
	
	public Sunflower(int x, int y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
		this.cost = 20;
		this.resist = 1;
		this.freq = 0.5;// dudas 10 soles cada dos ciclos  
		this.dmg = 0;
	}

	public static String getDescription() {
		
		String desc = "S["+ /*this.resist +*/"]";
		
		return desc;
	}

}
