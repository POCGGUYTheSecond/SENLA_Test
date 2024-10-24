package project.Hangman;

public class HangmanUI{
    public void displayWelcomeMsg(int maxLives) {
        System.out.println("Добро пожаловать в игру \"Виселица\"");
        System.out.println("Правила просты: загадывается слово, а вам нужно его отгадать называя буквы");
        System.out.println("Однако у вас есть лишь " + maxLives + " жизней");
        System.out.println("За каждую неверно названную букву вы теряете одну жизнь");
        System.out.println("Если вы потеряете все - игра окончена!");
        System.out.println("Тема: программирование");
        System.out.println("Чтобы продолжить, нажмите клавишу Enter...");
    }
    public void displayBadGameOverMsg(){
        System.out.println("Вам не удалось угадать слово и человечка повесили");
    }
    public void displayGoodGameOverMsg(String currentWord){
        System.out.println("Вы угадали слово: " + currentWord);
        System.out.println("Игра заканчивается");
    }
    public void displayWrongCharMsg(){
        System.out.println("Такой буквы нет, вы теряете одну жизнь");
    }
    public void displayRepeatedCharMsg(){
        System.out.println("Данная буква уже есть в слове");
    }
    public void displayCorrectCharMsg(){
        System.out.println("Действительно есть такая буква!");
    }
    public void displayDefaultMsg(String outputWord, int currentLives){
        System.out.println(outputWord + " Текущее количество жизней: " + currentLives);
        System.out.println("Введите букву: ");
    }
    public void displayIfWantToContinue(){
        System.out.println("Введите 1, если хотите попробовать ещё раз");
        System.out.println("Введите 2, чтобы закрыть программу");
    }
    public void displayHangman(int currentlives) {
        switch (currentlives) {
            case 5:
                System.out.println("  ____ ");
                System.out.println("  |       ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |     | ");
                System.out.println("  |     | ");
                System.out.println("  |_____| ");
                break;
            case 4:
                System.out.println("  _____ ");
                System.out.println("  |       ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |     | ");
                System.out.println("  |     | ");
                System.out.println("  |_____| ");
                break;
            case 3:
                System.out.println("  ______ ");
                System.out.println("  |       ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |     | ");
                System.out.println("  |     | ");
                System.out.println("  |_____| ");
                break;
            case 2:
                System.out.println("  _______ ");
                System.out.println("  |       ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |     | ");
                System.out.println("  |     | ");
                System.out.println("  |_____| ");
                break;
            case 1:
                System.out.println("  _______ ");
                System.out.println("  |     | ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |     | ");
                System.out.println("  |     | ");
                System.out.println("  |_____| ");
                break;
            case 0:
                System.out.println("  _______ ");
                System.out.println("  |     | ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |_____| ");
                break;
            default:
                System.out.println("  ____ ");
                System.out.println("  |       ");
                System.out.println("  |     O ");
                System.out.println("  |    /|\\ ");
                System.out.println("  |     | ");
                System.out.println("  |    / \\ ");
                System.out.println("  |     | ");
                System.out.println("  |     | ");
                System.out.println("  |_____| ");
                break;
        }
    }
}