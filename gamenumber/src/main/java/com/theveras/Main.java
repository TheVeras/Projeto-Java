package com.theveras;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        int opt = 1;

        do{
            int difficulty = 0;
            Random random = new Random();
            int numero = random.nextInt(100) + 1;
            int guess = 0;
            int cond = 1;

            JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!\r\n");

            do{
                difficulty = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select the difficulty level:\n\n"+
                                                "1. Easy (10 Chances)\n"+
                                                "2. Easy (5 Chances)\n"+
                                                "3. Easy (3 Chances)"
            ));
            
                switch (difficulty) {

                    case 1:
                        JOptionPane.showMessageDialog(null, "Great! You have selected the Easy difficulty level.\n"+
                                                            "I'm thinking of a number between 1 and 100.\r\n"+
                                                            "You have 10 chances to guess the correct number."+
                                                            "Let's start the game!"
                        );

                        for (int i = 1; i<11;i++){
                            guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
                
                            if(guess > numero){
                                JOptionPane.showMessageDialog(null, "Incorrect! The number is less than "+guess);
                            } else if(guess<numero){
                                JOptionPane.showMessageDialog(null, "Incorrect! The number is greater than "+guess);
                            } else{
                                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number in "+i+" attempts.");
                                i=11;
                            }
                        }
                        cond = 1;
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Great! You have selected the Medium difficulty level.\n"+
                                                            "I'm thinking of a number between 1 and 100.\r\n"+
                                                            "You have 5 chances to guess the correct number."+
                                                            "Let's start the game!"
                        );

                        for (int i = 1; i<6;i++){
                            guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
                
                            if(guess > numero){
                                JOptionPane.showMessageDialog(null, "Incorrect! The number is less than "+guess);
                            } else if(guess<numero){
                                JOptionPane.showMessageDialog(null, "Incorrect! The number is greater than "+guess);
                            } else{
                                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number in "+i+" attempts.");
                                i=6;
                            }
                        }
                        cond = 1;
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Great! You have selected the Hard difficulty level.\n"+
                                                            "I'm thinking of a number between 1 and 100.\r\n"+
                                                            "You have 3 chances to guess the correct number.\n"+
                                                            "Let's start the game!"
                        );

                        for (int i = 1; i<4;i++){
                            guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
                
                            if(guess > numero){
                                JOptionPane.showMessageDialog(null, "Incorrect! The number is less than "+guess);
                            } else if(guess<numero){
                                JOptionPane.showMessageDialog(null, "Incorrect! The number is greater than "+guess);
                            } else{
                                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number in "+i+" attempts.");
                                i = 4;
                            }
                        }
                        cond = 1;
                        break;

                    default: JOptionPane.showMessageDialog(null, "Sorry I don't understand");
                        break;
                }
            }while (cond == 0) ;
            
            opt = Integer.parseInt(JOptionPane.showInputDialog(" Do you want to play again?\n"+
                                                                "1. Yes         2. No"
            ));
            switch (opt) {
                case 1:
                    JOptionPane.showMessageDialog(null, "OK, cool.\n"+
                                                        "Let's do it!"
                    );
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "OK, Bye bye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sorry, I don't understand!");
                    break;
            }
        }while(opt!=2);
    }
}