package com.SnakeAndLadder;

public class SnakeNLadderGame {

	public static void main(String[] args) {
		int playerPosition = 0;
		int diceRoll = 0;
		System.out.println("Welcome to the Game of SNAKE & LADDER");
		System.out.println("Starting Position of the Player = " + playerPosition);
		double randomnumber = (double) (Math.random() * 6) + 1;
		diceRoll = (int) randomnumber;
		System.out.println("Dice Number =" + " " + diceRoll);

	}
}