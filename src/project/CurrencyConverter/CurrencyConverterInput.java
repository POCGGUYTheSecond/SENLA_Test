package project.CurrencyConverter;

import project.InputHandler.InputHandler;

public class CurrencyConverterInput {
    private InputHandler inputHandler;
    public CurrencyConverterInput() {
        inputHandler = new InputHandler();
    }
    public int getUserChoiceInput(int optionsNumber){
        return inputHandler.getUserChoiceInput(optionsNumber);
    }
    public int getUserChoiceInput(int optionsBorderMin, int optionsBorderMax) {
        return inputHandler.getUserChoiceInput(optionsBorderMin, optionsBorderMax);
    }
    public double getUserInput(){
        return inputHandler.getUserInputPositiveDouble();
    }
}
