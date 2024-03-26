package org.example;

public class BankAccount {
    private  long money;
    private Object lock1 = new Object() ;
    private Object lock2 = new Object() ;
    public long getMoney() {
        return money;
    }
    public  void setMoney(long money) {
        this.money = money;
    }
    public void deposit(long money) {
        synchronized(lock1) {
            this.money += money;
        }

    }

    public void withdraw(long money) {
        synchronized (lock2) {
            if (this.money >= money)
                this.money -= money;
        }
    }
}