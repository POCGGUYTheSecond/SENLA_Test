package project.InputHandler;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in); }

    public int getUserChoiceInput(int optionsNumber){
        int userChoice = 11;
        boolean validInput = false;

        while(!validInput) {
            try {
                userChoice = scanner.nextInt();
                if(userChoice <= optionsNumber && userChoice > 0) validInput = true;
                else System.out.println("Ошибка: Введите корректную цифру: ");
            }
            catch(Exception e) {
                System.out.println("Ошибка: Введите корректную цифру: ");
                scanner.nextLine();
            }
        }
        return userChoice;
    }
    public int getUserChoiceInput(int optionsBorderMin, int optionsBorderMax){
        int userChoice = 11;
        boolean validInput = false;

        while(!validInput) {
            try {
                userChoice = scanner.nextInt();
                if(userChoice <= optionsBorderMax && userChoice >= optionsBorderMin) validInput = true;
                else System.out.println("Ошибка: Введите корректную цифру: ");
            }
            catch(Exception e) {
                System.out.println("Ошибка: Введите корректную цифру: ");
                scanner.nextLine();
            }
        }
        return userChoice;
    }
    public double getUserInputDouble(){
        double userInput = 11;
        boolean validInput = false;

        while(!validInput) {
            try {
                userInput = scanner.nextDouble();
                validInput = true;
            }
            catch(Exception e) {
                System.out.println("Ошибка: Введите корректное число: ");
                scanner.nextLine();
            }
        }
        return userInput;
    }
    public Character getInputChar() {
        String input = scanner.nextLine();
        while (input.length() != 1) {
            System.out.print("Ошибка: введите одну букву: ");
            input = scanner.nextLine();
        }
        return input.charAt(0);
    }
    public void clearScanner(){
        scanner.nextLine();
    }
}
