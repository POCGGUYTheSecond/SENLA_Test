package project.CurrencyConverter;

public class CurrencyConverterUI {
    public void displayWelcomeMsg(Currency[] currencies){
        System.out.println("Данная программа конвертирует сумму из одной валюты в другую\nВсего доступно 6 валют");
        displayCurrencyList(currencies);
        System.out.println("Вы можете либо воспользоваться текущим курсом валют, либо задать свой");
    }
    public void displayIfYouWantToSetExchRate(){
        System.out.println("Введите '1', если хотите продолжать с текущим курсом валют");
        System.out.println("Введите '2', если сами хотите задать курсы валют");
        System.out.println("Введите '3', если хотите восстановить курс по умолчанию");
    }
    public void displayHowDoYouWantToSetExchRate(){
        System.out.println("Введите '1', если хотите задать курсы для всех валют");
        System.out.println("Введите '2', если хотите задать курс для конкретной валюты");
    }
    public void displayRulesOfCurExchRateInput(Currency[] currencies){
        System.out.println("Правило ввода курса валют");
        System.out.println("Базовая валюта в данной программе - " + currencies[0].getShortName() + " (" + currencies[0].getFullName() + ")");
        System.out.println("Курс базовой валюты менять нельзя");
        System.out.println("Соответственно все курсы необходимо задать по отношению к " + currencies[0].getShortName());
        System.out.println("Например, по умолчанию курс " + currencies[1].getShortName() + " составляет " + currencies[0].getDefaultRate() + " " + currencies[0].getShortName() + " = " + currencies[1].getDefaultRate() + " " + currencies[1].getShortName());
        System.out.println("Соответственно вам необходимо было бы ввести " + currencies[1].getDefaultRate() + " чтобы установить корректный курс");
    }
    public void displayChooseCurrMsg(){
        System.out.println("Выберите валюту и введите соотвествующую ей цифру");
    }
    public void displayBorderBetweenMsgs(){
        System.out.println("----------------------------------------------------------------");
    }
    public void displayCurrencyList(Currency[] currencies){
        System.out.println("Доступные валюты:");
        for(int i = 0; i < currencies.length; i++) {
            if (i == 0) {
                System.out.println((i + 1) + ". " + currencies[i].getShortName() + " - " + currencies[i].getFullName() + " - Базовая валюта");
            } else {
                System.out.println((i + 1) + ". " + currencies[i].getShortName() + " - " + currencies[i].getFullName() + ": " + currencies[0].getRate() + " " + currencies[0].getShortName() + " = " + currencies[i].getRate() + " " + currencies[i].getShortName());
            }
        }
    }
    public void displaySetCurrency(String currencyName){
        System.out.println("Введите курс для " + currencyName + ":");
    }
    public void displaySuccessfulySetCurr()
    {
        System.out.println("Вы успешно задали курсы валют");
    }
    public void displayFromWhichCurrConvert(){
        System.out.println("Введите номер исходной валюты:");
    }
    public void displayToWhichCurrConvert(){
        System.out.println("Введите номер валюты в которую нужно конвертировать сумму:");
    }
    public void displayWhichSumToConvert(){
        System.out.println("Введите сумму которую необходимо конвертировать: ");
    }
    public void displayIfWantToContinue(){
        System.out.println("Введите '1', чтобы продолжить использование программы");
        System.out.println("Введите '2', чтобы закрыть программу");
    }
    public void displayConvertedSum(String currencyRateName, String convertedSum){
        System.out.println("В результате конвертации получилось: " + convertedSum + " " + currencyRateName);
    }
}
