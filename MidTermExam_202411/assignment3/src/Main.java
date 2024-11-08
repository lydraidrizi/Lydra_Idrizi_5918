public class Main {

    public static void main(String[] args) {

        SavingsAccount savings1 = new SavingsAccount("SA1001", 5000.0, 2.5);

        CheckingAccount checking1 = new CheckingAccount("CA2001", 1500.0, 100);

        SavingsAccount savings2 = new SavingsAccount("SA1002", 8000.0, 3.0);



        System.out.println(savings1);

        System.out.println(checking1);

        System.out.println(savings2);

    }

}