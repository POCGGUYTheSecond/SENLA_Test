package project.Hangman;

import java.util.Scanner;

public class Hangman {
    private HangmanLogic hangmanLogic;
    private HangmanUI hangmanUI;
    private HangmanInput hangmanInput;
    private Scanner scanner;


    public Hangman() {
        hangmanLogic = new HangmanLogic();
        hangmanUI = new HangmanUI();
        hangmanInput = new HangmanInput();
        scanner = new Scanner(System.in);
    }

    public void playingGame(){
        hangmanUI.displayWelcomeMsg(hangmanLogic.getMaxLives());
        scanner.nextLine();
        while(true) {
            while (hangmanLogic.hasLivesLeft()) { // Продолжать цикл пока не закончатся жизни
                if (hangmanLogic.getCurrentWord().equals(hangmanLogic.getOutputWord())) { // Если выводящееся слово равно загаданному, то игрок побеждает и игра завершается
                    hangmanUI.displayGoodGameOverMsg(hangmanLogic.getCurrentWord());
                    break;
                }
                hangmanUI.displayHangman(hangmanLogic.getCurrentLives());
                hangmanUI.displayDefaultMsg(hangmanLogic.getOutputWord(), hangmanLogic.getCurrentLives());
                Character inputChar = hangmanInput.getInputChar();
                if (hangmanLogic.getGuessedLetters().contains(inputChar)) hangmanUI.displayRepeatedCharMsg(); // Если пользователь назвал букву которую уже отгадали
                else if (!hangmanLogic.getGuessedLetters().contains(inputChar) && hangmanLogic.getCurrentWord().contains(inputChar.toString())) { // Если пользователь угадал букву
                    hangmanUI.displayCorrectCharMsg();
                    hangmanLogic.addToGuessedLetters(inputChar);
                } else { // Если пользователь не угадал букву
                    hangmanUI.displayWrongCharMsg();
                    hangmanLogic.reduceLives();
                }

            }
            if (hangmanLogic.getCurrentLives() <= 0) { // Если у игрока закончились жизни вывести сообщение о конце игры
                hangmanUI.displayHangman(hangmanLogic.getCurrentLives());
                hangmanUI.displayBadGameOverMsg();
            }
            hangmanUI.displayIfWantToContinue();
            if(hangmanInput.getUserChoiceInput(2) == 1){ // Если пользователь хочет продолжить использовать программу, то не прерывать цикл
                hangmanLogic = new HangmanLogic(); // Создаём новый экземпляр, чтобы сбросить состояние игры
                hangmanInput.clearScanner();
            }
            else break;
        }
        scanner.close();

    }
    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.playingGame();
    }
}