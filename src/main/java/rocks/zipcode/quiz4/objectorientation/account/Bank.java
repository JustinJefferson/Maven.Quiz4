package rocks.zipcode.quiz4.objectorientation.account;

import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private List<BankAccount> list;

    public Bank() {
        list = new LinkedList<>();
    }

    public Bank(List<BankAccount> list) {
        this.list = list;
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return list.remove(indexNumber.intValue());
    }

    public void addBankAccount(BankAccount bankAccount) {
        list.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return list.contains(bankAccount);
    }
}
