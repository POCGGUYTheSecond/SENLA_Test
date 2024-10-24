package project.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverterLogic {
    private static final int currenciesAmount = 6;
    private Currency[] currencies = new Currency[currenciesAmount];

    CurrencyConverterLogic(){
        currencies[0] = new Currency(CurrencyDefaultRates.DEFAULT_RUB, "RUB", "Российский рубль"); // Первая валюта всегда должна быть базовой, а её курс равен 1.0
        currencies[1] = new Currency(CurrencyDefaultRates.DEFAULT_RUB_TO_USD, "USD", "Доллар Соединённых Штатов");
        currencies[2] = new Currency(CurrencyDefaultRates.DEFAULT_RUB_TO_EUR, "EUR", "Евро");
        currencies[3] = new Currency(CurrencyDefaultRates.DEFAULT_RUB_TO_GBP, "GBP", "Фунт стерлингов");
        currencies[4] = new Currency(CurrencyDefaultRates.DEFAULT_RUB_TO_JPY, "JPY", "Японская иена");
        currencies[5] = new Currency(CurrencyDefaultRates.DEFAULT_RUB_TO_NZD, "NZD", "Новозеландский доллар");
    }
    public void setDefaultCurrency()
    {
        for(int i = 0; i < currencies.length; i++) currencies[i].setRateToDefault();
    }
    public Currency getCurrencyObject(int choice){
        return currencies[choice];
    }
    public double getCurrencyRate(int choice)
    {
        return currencies[choice].getRate();
    }
    public void setCurrency(int choice, double rate){
        currencies[choice].setRate(rate);
    }
    public Currency[] getAllCurrencies(){
        return currencies;
    }
    public int getCurrenciesAmount(){
        return currencies.length;
    }
    public String getCurrencyShortName(int choice){
        return currencies[choice].getShortName();
    }
    public double convertSum(double fromWhichCurrRate, double toWhichCurrRate, double sumToConvert){
        return (toWhichCurrRate / fromWhichCurrRate) * sumToConvert;
    }
}
