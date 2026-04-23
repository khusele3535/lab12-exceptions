public class BankSystem {
    public void withdraw(int amount) throws CustomException {
        if (amount > 1000) {
            throw new CustomException("Limit exceeded!");
        } else {
            System.out.println("Withdraw success");
        }
    }
}
