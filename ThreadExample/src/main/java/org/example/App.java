package org.example;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args ) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        CounterThread t1 = new CounterThread(bankAccount, Operation.DEPOSIT);
        CounterThread t2 = new CounterThread(bankAccount, Operation.WITHDRAW);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long money = bankAccount.getMoney();
        System.out.println(money);
    }


}
