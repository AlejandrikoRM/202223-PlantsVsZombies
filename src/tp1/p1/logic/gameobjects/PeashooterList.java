package tp1.p1.logic.gameobjects;

public class PeashooterList {
	
	private int contador;
	private static final int SIZE = 100;
	private Peashooter[] list;
	
	public PeashooterList() {
		this.contador = 0;
		this.list = new Peashooter[SIZE];
		
	}
}
