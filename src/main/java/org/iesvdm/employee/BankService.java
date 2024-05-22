package org.iesvdm.employee;

public interface BankService {

	void pay(String id, double amount);

    void pay(Employee toBePaid);
}
