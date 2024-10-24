package project.PasswordGenerator;

public class PasswordGenerator {
    PasswordGeneratorLogic pgLogic;
    PasswordGeneratorInput pgInput;
    PasswordGeneratorUI pgUI;

    PasswordGenerator() {
        pgLogic = new PasswordGeneratorLogic();
        pgInput = new PasswordGeneratorInput();
        pgUI = new PasswordGeneratorUI();
    }

    public void execute() {
        pgUI.displayWelcomeMsg();
        while(true) {
            pgUI.displayChoosePasswordLength();
            if (pgInput.getUserChoiceInput(2) == 1)// Если пользователь желает сам задать длину пароля
            {
                pgUI.displayInputLength();
                pgUI.displayPassword(pgLogic.generatePassword(pgInput.getUserChoiceInput(8, 12)));
            } else { // Если пользователь хочет случайную длину пароля
                pgUI.displayPassword(pgLogic.generatePassword());
            }
            pgUI.displayIfWantToContinue();
            if(pgInput.getUserChoiceInput(2) == 1) {} // Если пользователь хочет продолжить использовать программу то не прерывать цикл
            else break;
        }

    }

    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        pg.execute();
    }

}
