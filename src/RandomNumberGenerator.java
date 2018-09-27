import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {

        Scanner keyboard;
        int generatedNumber;
        boolean playGameAgain;
        String userQuestion;
        String userQuestionAnswer;
        String explanationGreeting;
        String magicBallMath;
        String userPlayAgain;

        keyboard = new Scanner(System.in);
        explanationGreeting = "Welcome to the Coding Magic 8 Ball! It's simple. Ask a question, and I will will predict the future.";
        userQuestion = "Now, ask me a \"yes\" or \"no\" question.";
        magicBallMath = "Now, your future will be predicted...";
        playGameAgain = true;

        System.out.println(explanationGreeting);

        while (playGameAgain){
            generatedNumber = (int) (Math.random() * 100);

            System.out.println(userQuestion);
            userQuestionAnswer = keyboard.nextLine();
            System.out.println(magicBallMath);
            System.out.println();
            System.out.println("\\ \\ \\ \\ \\ \\ \\ Results \\ \\ \\ \\ \\ \\ \\");
            System.out.println();
            System.out.println("To your question: " + userQuestionAnswer + "\nThe Magic 8 Ball Predicts:");

            if (generatedNumber <= 10 && generatedNumber >= 0) {
                System.out.println("No! Never!");
            } else if (generatedNumber <= 20 && generatedNumber >= 11) {
                System.out.println("The odds are in your favor.");
            } else if (generatedNumber <= 30 && generatedNumber >= 21) {
                System.out.println("Without a doubt.");
            } else if (generatedNumber <= 40 && generatedNumber >= 31) {
                System.out.println("No. Just no. You should'nt have asked. Just no.");
            } else if (generatedNumber <= 50 && generatedNumber >= 41) {
                System.out.println("Definitely. Unless it's murder, or drugs. Then no.");
            } else if (generatedNumber <= 60 && generatedNumber >= 51) {
                System.out.println("That could never be true.");
            } else if (generatedNumber <= 70 && generatedNumber >= 61) {
                System.out.println("The future is cluttered with the word \"yes\". Wonder what that means.");
            } else if (generatedNumber <= 80 && generatedNumber >= 71) {
                System.out.println("Not in a million years.");
            } else if (generatedNumber <= 90 && generatedNumber >= 81) {
                System.out.println("My sources say no. And my sources are good.");
            } else if (generatedNumber <= 100 && generatedNumber >= 91) {
                System.out.println("Signs point to yes. Especially the signs that have \"yes\" written on them.");
            }
            System.out.println("\nDo you want another prediction?");
            System.out.println("(Answer \"yes\" or \"no\".)");
            userPlayAgain = keyboard.nextLine();
            if (userPlayAgain.equals("yes")){
                userQuestion = "Okay. Ask another \"yes\" or \"no\" question.";
            }
            else if (!userPlayAgain.equals("yes")){
                System.out.println("Good Bye!\nSHUTTING DOWN...");
                playGameAgain = false;
            }


        }
    }
}
