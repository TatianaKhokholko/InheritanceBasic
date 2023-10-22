package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public DepositAccount() {
        amount = super.getAmount();
    }

    @Override
    public void take(double amountToTake) {
        boolean checkPeriod = ChronoUnit.MONTHS.between(lastIncome, LocalDateTime.now()) >= 1;
        if(checkPeriod) {
            super.take(amountToTake);
        }
    }

    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }

    @Override
    public double getAmount() {
        return super.amount;
    }
}
