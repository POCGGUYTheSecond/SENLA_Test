package project.Hangman;

import project.InputHandler.InputHandler;

public class HangmanInput {
    private InputHandler inputHandler;
    public HangmanInput() {
        inputHandler = new InputHandler();
    }

    public Character getInputChar() {
        return inputHandler.getInputChar();
    }
    public int getUserChoiceInput(int optionsNumber){
        return inputHandler.getUserChoiceInput(optionsNumber);
    }
    public void clearScanner(){
        inputHandler.clearScanner();
    }

}
