package exercises.phone_bill_calculator;

public class PhoneBillCalculator {

    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(123456, 6999, 78, 40);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}
