package hbinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ContractEmp")
public class ContractEmp extends Employee {

	private int conTime;
	private int payments;
	
	
	public int getConTime() {
		return conTime;
	}
	public void setConTime(int conTime) {
		this.conTime = conTime;
	}
	public int getPayments() {
		return payments;
	}
	public void setPayments(int payments) {
		this.payments = payments;
	}
}
