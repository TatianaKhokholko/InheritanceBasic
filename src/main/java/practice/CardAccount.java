package practice;

public class CardAccount extends BankAccount {
    public CardAccount() {
        amount = super.getAmount();
    }

    @Override
    public void take(double amountToTake) {
        double commission = 0.01;
        super.take(amountToTake + amountToTake * commission);
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }
}
