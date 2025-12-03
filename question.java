// This class has the list of questions for the trivia game and the answers for each question.
// This class Promts the user with each question and checks if their answer is correct
// It prints out the qurstion and the list of possible answers for each question.
// If the user gets each question right, they get one point. Otherwise, they get zero points.
/* Author: Joey Laurin
Date: 11/23/2025
Purpose: To store the questions and answers for the trivia game and to handle user interaction.
 */

public class question {
    public static void main(String[] args) {
        int score = 0; // keeps track of the user's score
        int numQuestions = 0; // keeps track of the number of questions asked
        String[] questions = { // list of questions
            "What is the capital of France?\n a) Berlin\n b) Madrid\n c) Paris\n d) Rome",
            "Who wrote 'Hamlet'?\n a) Charles Dickens\n b) William Shakespeare\n c) Mark Twain\n d) Jane Austen",
            "What is the largest planet in our solar system?\n a) Earth\n b) Jupiter\n c) Saturn\n d) Mars",
            "What is the chemical symbol for water?\n a) CO2\n b) H2O\n c) O2\n d) NaCl",
            "Who painted the Mona Lisa?\n a) Vincent van Gogh\n b) Pablo Picasso\n c) Leonardo da Vinci\n d) Claude Monet",
            "What is the smallest prime number?\n a) 0\n b) 1\n c) 2\n d) 3",
            "In which year did the Titanic sink?\n a) 1910\n b) 1912\n c) 1914\n d) 1916",
            "What is the hardest natural substance on Earth?\n a) Gold\n b) Iron\n c) Diamond\n d) Silver",
            "Who is known as the 'Father of Computers'?\n a) Charles Babbage\n b) Alan Turing\n c) John von Neumann\n d) Steve Jobs",
            "What is the largest mammal in the world?\n a) Elephant\n b) Blue Whale\n c) Giraffe\n d) Great White Shark",
            "Which element has the atomic number 1?\n a) Helium\n b) Oxygen\n c) Hydrogen\n d) Carbon",
            "Who discovered penicillin?\n a) Marie Curie\n b) Alexander Fleming\n c) Louis Pasteur\n d) Gregor Mendel",
            "What is the capital city of Japan?\n a) Beijing\n b) Seoul\n c) Tokyo\n d) Bangkok",
            "How many continents are there on Earth?\n a) 5\n b) 6\n c) 7\n d) 8",
            "What is the main ingredient in guacamole?\n a) Tomato\n b) Avocado\n c) Onion\n d) Pepper",
            "Who leads the NFL in carrer passing touchdowns?\n a) Tom Brady\n b) Drew Brees\n c) Peyton Manning\n d) Brett Favre",
            "What is the smallest country in the world?\n a) Monaco\n b) Nauru\n c) Vatican City\n d) San Marino",
            "Which planet is known as the Red Planet?\n a) Venus\n b) Mars\n c) Jupiter\n d) Saturn",
            "What is the currency of the United Kingdom?\n a) Euro\n b) Pound Sterling\n c) Dollar\n d) Yen",
            "Who wrote '1984'?\n a) George Orwell\n b) Aldous Huxley\n c) Ray Bradbury\n d) J.K. Rowling",
            "What is the largest ocean on Earth?\n a) Atlantic Ocean\n b) Indian Ocean\n c) Arctic Ocean\n d) Pacific Ocean",
            "Which MLB team has won the most World Series titles?\n a) New York Yankees\n b) St. Louis Cardinals\n c) Boston Red Sox\n d) Los Angeles Dodgers",
            "Which NFL team is known as 'America's Team'?\n a) Dallas Cowboys\n b) New England Patriots\n c) Green Bay Packers\n d) Pittsburgh Steelers",
            "What is the tallest mountain in the world?\n a) K2\n b) Kangchenjunga\n c) Mount Everest\n d) Lhotse",
            "What is the biggest comeback in Super Bowl history?\n a) Patriots vs Falcons\n b) Giants vs Patriots\n c) 49ers vs Bengals\n d) Packers vs Steelers",
            "Who developed the theory of relativity?\n a) Isaac Newton\n b) Nikola Tesla\n c) Albert Einstein\n d) Galileo Galilei",
            "What is the main language spoken in Brazil?\n a) Spanish\n b) Portuguese\n c) French\n d) English",
            "What is the capital of Canada?\n a) Toronto\n b) Vancouver\n c) Ottawa\n d) Montreal",
            "Which planet has the most moons?\n a) Earth\n b) Mars\n c) Jupiter\n d) Saturn",
            "What is the largest desert in the world?\n a) Sahara\n b) Arabian\n c) Gobi\n d) Antarctic",
            "Where was the 2016 Summer Olympics held?\n a) Beijing\n b) London\n c) Rio de Janeiro\n d) Tokyo",

        };
        String[] answers = { // list of answers
            "c",
            "b",
            "b",
            "b",
            "c",
            "c",
            "b",
            "c",
            "a",
            "b",
            "c",
            "b",
            "c",
            "c",
            "b",
            "a",
            "c",
            "b",
            "b",
            "a",
            "d",
            "a",
            "a",
            "c",
            "a",
            "c",
            "b",
            "c",
            "d",
            "c"

        };

        
            
        
        for (int i = 0; i < 15; i++) { // loops through 15 questions
            numQuestions++; // counts the number of questions
            System.out.println("Question " + numQuestions + ":"); // display question number
            System.out.println(questions[i]); // display question
            System.out.print("Your answer: "); // display prompt for user answer
            String userAnswer = System.console().readLine().toLowerCase(); // get user answer and convert to lowercase
            if (userAnswer.equals(answers[i])) { // check if user answer is correct
                System.out.println("Correct!\n"); // prints if correct
                score++; // counts the score
            } else {
                System.out.println("Incorrect! The correct answer was: " + answers[i] + "\n"); // prints if incorrect and user gets no points
            
            }


        }
        System.out.println("Your total score is: " + score + " out of 15"); // display total score
    }
}
