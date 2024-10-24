package project.CurrencyConverter;

import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
   private CurrencyConverterLogic ccLogic;
   private CurrencyConverterUI ccUI;
   private CurrencyConverterInput ccInput;
   private Scanner scanner;

    public CurrencyConverter(){
        scanner = new Scanner(System.in);
        ccLogic = new CurrencyConverterLogic();
        ccUI = new CurrencyConverterUI();
        ccInput = new CurrencyConverterInput();
    }

    public void execute() {
        ccUI.displayWelcomeMsg(ccLogic.getAllCurrencies());
        while (true) {
            ccUI.displayIfYouWantToSetExchRate(); // Хочет ли пользователь менять курс валют
            switch (ccInput.getUserChoiceInput(3)) {
                case 1: // Если пользователь хочет продолжить с текущим курсом валют
                    break;
                case 2: // Если пользователь хочет изменить курс
                    ccUI.displayHowDoYouWantToSetExchRate();
                    switch (ccInput.getUserChoiceInput(2)) {
                        case 1: // Если пользователь хочет изменить курс всех валют
                            ccUI.displayBorderBetweenMsgs();
                            ccUI.displayRulesOfCurExchRateInput(ccLogic.getAllCurrencies());
                            ccUI.displayCurrencyList(ccLogic.getAllCurrencies());
                            for (int i = 1; i < ccLogic.getCurrenciesAmount(); i++) {
                                ccUI.displaySetCurrency(ccLogic.getCurrencyShortName(i));
                                ccLogic.setCurrency(i, ccInput.getUserInput());
                            }
                            break;
                        case 2: // Если пользователь хочет изменить курс только одной валюты
                            ccUI.displayBorderBetweenMsgs();
                            ccUI.displayRulesOfCurExchRateInput(ccLogic.getAllCurrencies());
                            ccUI.displayCurrencyList(ccLogic.getAllCurrencies());
                            ccUI.displayChooseCurrMsg();
                            int choice = ccInput.getUserChoiceInput(2, ccLogic.getCurrenciesAmount()) - 1;
                            ccUI.displaySetCurrency(ccLogic.getCurrencyShortName(choice));
                            ccLogic.setCurrency(choice, ccInput.getUserInput());
                            break;
                    }
                    ccUI.displaySuccessfulySetCurr();
                    ccUI.displayCurrencyList(ccLogic.getAllCurrencies());
                    break;
                case 3: // Если пользователь хочет установить курс по умолчанию
                    ccLogic.setDefaultCurrency();
                    ccUI.displaySuccessfulySetCurr();
                    ccUI.displayCurrencyList(ccLogic.getAllCurrencies());
                    break;
            }
            ccUI.displayFromWhichCurrConvert(); // Из какой валюты в какую хочет конвертировать
            int fromWhichCurr = ccInput.getUserChoiceInput(1, ccLogic.getCurrenciesAmount()) - 1;
            ccUI.displayToWhichCurrConvert(); // В какую валюту хочет конвертировать
            int toWhichCurr = ccInput.getUserChoiceInput(1, ccLogic.getCurrenciesAmount()) - 1;
            ccUI.displayWhichSumToConvert();  // Какую сумму хочет конвертировать
            double sumToConvert = ccInput.getUserInput();
            // Отобразить сконвертированную сумму
            ccUI.displayConvertedSum(ccLogic.getCurrencyShortName(toWhichCurr), ccLogic.convertSum(ccLogic.getCurrencyRate(fromWhichCurr), ccLogic.getCurrencyRate(toWhichCurr), sumToConvert));
            ccUI.displayIfWantToContinue(); // Хочет ли пользователь продолжить, или закрыть программу
            if (ccInput.getUserChoiceInput(2) == 1) {}
            else break;
        }
        scanner.close();

    }

    public static void main(String[] args) {
        CurrencyConverter сс = new CurrencyConverter();
        сс.execute();
    }
}