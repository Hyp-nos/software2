package ch.fhnw.richards.lecture02.exercises;

/*
 * factory pattern: 
 * Want to create objects implementing some interface 
 * or having same parents 
 * create an object is complex ; e.g. lots of constructor parameters 
 * Possible to simplify choice of objects 
 * 
 */

import java.util.Scanner;

public class FactoryExample {

	public static void main(String[] args) {
		
		//this is the classic way
		EnemyShip ufoShip = new UFOEnemyShip();
		
		
		//part of the classic way 
		EnemyShip theEnemy =null;
		// now here we test user input
		Scanner userInput = new Scanner(System.in);
		
		String enemyShipOption="";
		System.out.println("What Type of ship ? (U/R) ");
		if (userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
			
		}
		
		if(enemyShipOption.equals("U")){
			theEnemy= new UFOEnemyShip();
		}
		if (enemyShipOption.equals("R")){
			theEnemy = new RocketEnemyShip();
		}
		doStuffEnemy(theEnemy);
		/*
		 * this is the old way, the best way is to create factory class or method
		 * in this class we make the other objects instead of creating them in the main method
		 * watch Factory Design Pattern by Derek Banas
		 */
		
		
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
		
	}

}
