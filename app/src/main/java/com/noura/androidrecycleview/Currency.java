package com.noura.androidrecycleview;

public class Currency {


    private String currrencyCode;
    private String currencyName;
    private double exchangeRate;

    public Currency(String currrencyCode, double exchangeRate, String currencyName) {

        this.currrencyCode = currrencyCode;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getCurrrencyCode() {
        return currrencyCode;
    }
}
