package Oops;

import java.util.ArrayList;
import java.util.List;

public class Association {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Satish Kumar");

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(31223344556L);

        BankAccount bankAccount_1 = new BankAccount();
        bankAccount_1.setAccountNumber(5222334455675L);

        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(bankAccount);
        bankAccountList.add(bankAccount_1);

        person.setBankAccountList(bankAccountList); // This line setting the many account number to a one person


        System.out.println(person.getBankAccountList()+" for Person "+person.getName());
    }



}

class Person{
    private String name;
    private List<BankAccount> bankAccountList;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }
}

class BankAccount{
    private Long accountNumber;
    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
