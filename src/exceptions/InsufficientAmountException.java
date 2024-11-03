package exceptions;

/**
 *  @author Erika Castro
 *  Email : erika.contax@gmail.com
 */

public class InsufficientAmountException extends Exception {
    private static final long serialVersionIUD = 1L;

    public InsufficientAmountException(double amount){
        super("Amount" + amount + "is negative");
    }
}
