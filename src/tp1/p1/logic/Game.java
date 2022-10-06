package tp1.p1.logic;

import java.util.Random;

import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.PeashooterList;
import tp1.p1.logic.gameobjects.SunflowerList;
import tp1.p1.logic.gameobjects.ZombieList;

public class Game {
	private Level level;
	private int sun;
	private int ciclos;
	private Random rand;
	public static final int NUM_ROWS = 4;
	public static final int NUM_COLS = 8;
	private SunflowerList sunflowerlist;
	private PeashooterList peashooterlist;
	private ZombiesManager zombie;

	public Game(long seed, Level level) {
		this.ciclos = 0;
		this.sun = 50;
		this.sunflowerlist = new SunflowerList();
		this.peashooterlist = new PeashooterList();
		this.zombie = new ZombiesManager(this, level, rand);
		
	}

	public String positionToString(int col, int row) {
		// TODO Auto-generated method stub
		return "";
	}
	
	public void update() {
		
	}
	
	public int getCiclos() {
		return ciclos;
	}

	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}

	public ZombiesManager getZombie() {
		return zombie;
	}

	public void setZombie(ZombiesManager zombie) {
		this.zombie = zombie;
	}

	public static int getNumRows() {
		return NUM_ROWS;
	}

	public static int getNumCols() {
		return NUM_COLS;
	}

	public int getSun() {
		return sun;
	}

	public void setSun(int sun) {
		this.sun = sun;
	}

	public void reset() {
		// TODO Auto-generated method stub
		
	}

	public void addP() {
		// TODO Auto-generated method stub
		
	}

}
