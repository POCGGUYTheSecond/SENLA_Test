package project.PasswordGenerator;

import project.InputHandler.InputHandler;

public class PasswordGeneratorInput {
    private InputHandler inputHandler;
    public PasswordGeneratorInput() {
        inputHandler = new InputHandler();
    }
    public int getUserChoiceInput(int optionsNumber){
        return inputHandler.getUserChoiceInput(optionsNumber);
    }
    public int getUserChoiceInput(int optionsBorderMin, int optionsBorderMax) {
        return inputHandler.getUserChoiceInput(optionsBorderMin, optionsBorderMax);
    }

}