package org.hp.bank.entity;

public class Client {
    private String clientID;
    private String name;
    private int balance;

    public Client(String clientID, String name, int balance) {
        this.clientID = clientID;
        this.name = name;
        this.balance = balance;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

