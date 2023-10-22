package practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    protected double amount;

    public BankAccount() {
        this.amount = 0.0;
    }

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0.0) {
            amount += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amount >= amountToTake && amountToTake > 0.0) {
            amount -= amountToTake;
        }
    }
}
