import exceptions.InsufficientAmountException;
import model.Account;
import model.User;

/**
 * Simple bank application simulation using principles of OOP in Java language programming.
 * @author Erika Castro
 * @version 0.0.0 (first feature application)
 * Email : erika.contax@gmail.com
 **/

public class BankApplication {
    public static void main(String[] args) {
        User joao = new User("Joao", "Da Silva", 32);
        User maria = new User("Maria", "Porto Aguiar", 25);

        Account acc = new Account(joao, 100);
        Account acc2 = new Account(maria, 100);

        System.out.println("Bank Application v0");
        System.out.println("-----------------");
        try {
            acc.deposit(100);
            acc.withdraw(50);

            acc2.deposit(1000);
            acc2.withdraw(300);

            System.out.println("Users:");

            System.out.println(joao.getFirstName() + " " + joao.getLastName());
            System.out.println("Idade: " + joao.getAge());
            System.out.println(acc.getBalance());

            System.out.println();
            System.out.println(maria.getFirstName() + " " + maria.getLastName());
            System.out.println("Idade: " + maria.getAge());
            System.out.println(acc2.getBalance());
        } catch (InsufficientAmountException e) {
            e.getMessage();
        }
    }
}