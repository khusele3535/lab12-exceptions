void main() {

    try {
        IO.println("Done");
    } catch (ArithmeticException e) {
        IO.println("Cannot divide by zero");
    }
    IO.println("Program continues...");

    try {
    } catch (NullPointerException e) {
        IO.println("Null error!");
    }

    try {
        int[] arr = new int[3];
        IO.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        IO.println("Index error");
    } catch (Exception e) {
        IO.println("General error");
    }

    try {
        int x = 5;
        IO.println("Value: " + x);
    } catch (Exception e) {
        IO.println("Error");
    } finally {
        IO.println("Always runs");
    }

    Calculator calc = new Calculator();
    try {
        calc.divide(0);
    } catch (ArithmeticException e) {
        IO.println(e.getMessage());
    }

    UserInput u = new UserInput();
    try {
        int num = u.getNumber("abc");
        IO.println(num);
    } catch (NumberFormatException e) {
        IO.println("Invalid number!");
    }

    BankSystem bank = new BankSystem();
    try {
        bank.withdraw(2000);
    } catch (CustomException e) {
        IO.println(e.getMessage());
    } finally {
        IO.println("Full system integration complete.");
    }

    IO.println("Robust program finished successfully without crashing.");
}
