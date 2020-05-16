/**
 * This Object-Oriented" version of the "BankAccount" class
 * is a simple introduction to Constructors / 
 * private data members / static vs. not static / and the
 * "toString" method. 
 * 
 * SKELETON FOR LAB TEST.
 * 
 * @author Raymond Lister
 * @version September 2015;
 */

public class BankAccountOOComplete
{
    private static double interestRate = 0.0;

    // Note: the interest rate is "static". That is, all
    //       bank accounts have the same interest rate.
    // See Parsons page 117, 
    //             section "6.8 Static Fields and Methods"
    // See https://docs.oracle.com/javase/tutorial/java/ ... 
    //           ... javaOO/classvars.html
    // Or google java tutorial static fields

    /*
     * The instance variables follow (i.e. not static). These
     * are also called "fields“ or “private data members”.
     */

    private final int accountNumber;
    // The "final" reserved word indicates that the first 
    // value that this variable receives will be its final 
    // value; it cannot change. See http:// ...
    // en.wikipedia.org/wiki/Final_(Java)#Final_variables
    // NOTE: "final" is NOT the same thing as "static".  
    //       "final" means "constant across time"
    //       "static" means "constant across objects" 

    private String accountName;

    private double balance; // e.g. 1.27 means $1.27

    /**
     *   The constructors now follow
     */

    /**
     * @param    num  number for the account
     * @param    name name of the account
     */
    public BankAccountOOComplete(int num, String name)
    {
        accountNumber = num;
        accountName = name;
        balance = 0;
    } 

    /**
     * @param    num    number for the account
     * @param    name   name of the account
     * @param    bal    opening balance
     */
    public BankAccountOOComplete(int num, String name, double val)
    {
        accountNumber = num;
        accountName = name;
        balance = val;
    } 

    /**
     * @return     The account number 
     */
    public int getAccountNumber()       
    {
        return accountNumber;
    }

    /**
     * @return   The name for the account 
     */
    public String getAccountName()
    {
        return accountName;
    }

    /**
     * @param   newName The new name for the account 
     */
    public void setAccountName(String name)
    {
        accountName = name;
    }

    /**
     * @return     The account balance 
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * @param   amount  To be added to the balance
     */
    public void deposit(double val)  
    {
        balance += val;
    }

    /**
     * The withdrawal should be refused if the withdrawal
     * would result in a negative balance.
     * 
     * @param   amount  The amount to be withdrawn
     *
     * @return  new balance or -1.0 if withdrawal refused
     */
    public double withdraw(double val)
    {  
        if(val > balance){
            return -1.0;
        }
        balance -= val;
        return balance;
    }

    /**
     * @return   The interest rate 
     */ 
    public static double getInterestRate()
    {
        return interestRate;
    }

    /**
     * @param   newInterest    The new interest rate 
     */
    public static void setInterestRate(double rate)
    {
        interestRate = rate;
    }

    /**
     * It is common practise to supply a "toString" method 
     * in an object-oriented class.  In fact, if you don't 
     * explicitly supply such a method, Java produces an 
     * implicit, simplistic "toString" method which produces
     * a String like "BankAccountOO@1edd1f0". The word before 
     * the "@" is the name of the class. The hexadecimal 
     * number after the "@" is called the objects "hash code". 
     * 
     * See Nielsen, page  78,
     *          section "5.2.4 The toString Method"
     * See Nielsen, page 165,
     *          section "8.2.1 Overriding the toString Method"
     * 
     *@return   The state of this "instance of class BankAccount" or "object", the accountNumber, accountName and balance  
     */
    public String toString()
    {
        return "accountNumber = "+accountNumber+" accountName = "+accountName+" balance = "+balance; 
        //" accountName = "  
        //" balance = " 
    }

} // class BankAccountOOComplete
