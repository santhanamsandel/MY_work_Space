package hbinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="RegularEmp")
public class RegularEmp extends Employee {

	private int salary;
 public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonus() {
	return Bonus;
}
public void setBonus(int bonus) {
	Bonus = bonus;
}
private int Bonus;
} 
