package com.clay;

/**
 * CreditCard
 */
public class CreditCard {

    String cardType;

    String cardNumber;

    String cardExpDate;

    final String CC_DATA_FILE = "CC.txt";

    public CreditCard(String ccType, String ccNumber, String ccExpDate) {
        this.cardType = ccType;
        this.cardNumber = ccNumber;
        this.cardExpDate = ccExpDate;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public boolean isValid() {
        return true;
    }
}