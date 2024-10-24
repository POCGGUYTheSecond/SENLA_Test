package project.PasswordGenerator;

public class PasswordGeneratorUI{
    public void displayWelcomeMsg(){
        System.out.println("Данная программа генерирует пароль длиной от 8 до 12 символов");
        System.out.println("Длина пароля может быть задана пользователем, а может быть задана случайно");
    }
    public void displayChoosePasswordLength(){
        System.out.println("Введите '1', если хотите выбрать длину пароля");
        System.out.println("Введите '2', если хотите чтобы длина была задана случайно");
    }
    public void displayPassword(String password){
        System.out.println("Получился следующий безопасный пароль: " + password);
    }
    public void displayIfWantToContinue(){
        System.out.println("Введите 1, чтобы продолжить использование программы");
        System.out.println("Введите 2, чтобы закрыть программу");
    }
    public void displayInputLength(){
        System.out.println("Введите желаемую длину пароля (от 8 до 12 символов): ");
    }
}