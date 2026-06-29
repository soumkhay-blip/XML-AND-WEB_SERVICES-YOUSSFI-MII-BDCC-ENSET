package WS;

import java.io.Serializable;

public class Account implements Serializable {
    private int code;
    private double balance;

    public Account() {
    }

    public Account(int code, double balance) {
        this.code = code;
        this.balance = balance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}