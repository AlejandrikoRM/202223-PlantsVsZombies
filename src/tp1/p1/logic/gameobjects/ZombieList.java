package tp1.p1.logic.gameobjects;

public class ZombieList {
	
	private int contador;
	private Zombie[] list;
	
	public ZombieList(int remainingZombies) {
		this.contador = 0;
		this.list = new Zombie[remainingZombies];
	}

}
