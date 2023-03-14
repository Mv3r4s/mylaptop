package Objects;

public class bank {
    public static void main(String[] args) {
        BankAccount client1= new BankAccount();
        BankAccount client2= new BankAccount();

        client1.setAccountNumber("5356357");
        client2.setAccountNumber("5356357");//error

        client1.setAccountHolderName("john due");
        client2.setAccountHolderName("");
    }
}
