// This class calls methods from the question class to run the trivia game.
/* Author: Joey Laurin
Date: 11/23/2025
Purpose: To run the trivia game by invoking the main method of the question class.
 */ 
public class triviagame {
    public static void main(String[] args) {
        question trivia = new question(); // create an instance of the question class
        trivia.main(args); // call the main method of the question class to start the game
        
    }
}
