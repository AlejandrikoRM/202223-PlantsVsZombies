package tp1.p1.control;

import static tp1.p1.view.Messages.*;

import java.util.Scanner;

import tp1.p1.logic.Game;
import tp1.p1.view.GamePrinter;
import tp1.p1.view.Messages;

/**
 * Accepts user input and coordinates the game execution logic.
 *
 */
public class Controller {

	private Game game;

	private Scanner scanner;

	private GamePrinter gamePrinter;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		this.gamePrinter = new GamePrinter(game);
	}

	/**
	 * Draw / Paint the game.
	 */
	private void printGame() {
		System.out.println(gamePrinter);
	}

	/**
	 * Prints the final message once the match is finished.
	 */
	public void printEndMessage() {
		System.out.println(gamePrinter.endMessage());
	}

	/**
	 * Show prompt and request command.
	 *
	 * @return the player command as words
	 */
	private String[] prompt() {
		System.out.print(Messages.PROMPT);
		String line = scanner.nextLine();
		String[] words = line.toLowerCase().trim().split("\\s+");

		System.out.println(debug(line));

		return words;
	}

	/**
	 * Runs the game logic.
	 */
	public void run() {
		
		String[] op;
		boolean exit = false;
		this.printGame();
		while(!exit) {
			op = prompt();
			switch (op[0]) {
			case "a":
				game.addP();
				this.printGame();
				break;
			case "l":
				System.out.println(Messages.PEASHOOTER_DESCRIPTION);
				System.out.println(Messages.SUNFLOWER_DESCRIPTION);
				break;
			case "r":
				game.reset();
				break;
			case "h":
				System.out.println(Messages.HELP);
				break;
			case "e":
				System.out.println(Messages.PLAYER_QUITS);
				exit = true;
				break;
			case "":
			case "n":
				game.update();
				this.printGame();
				break;
			default:
				System.out.println(Messages.INVALID_COMMAND);
			
			}
		}

	}

}
