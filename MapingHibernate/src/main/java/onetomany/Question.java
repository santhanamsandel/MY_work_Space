package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;



@Entity
@Table(name="question_tab")
public class Question {


@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int queId;
	private String que;
	
@OneToMany
@JoinColumn(name="que_id")
@OrderColumn(name="Type")
private List<Answers> anslist;
	
public int getQueId() {
	return queId;
}


public void setQueId(int queId) {
	this.queId = queId;
}


public String getQue() {
	return que;
}


public void setQue(String que) {
	this.que = que;
}


public List<Answers> getAnslist() {
	return anslist;
}


public void setAnslist(List<Answers> anslist) {
	this.anslist = anslist;
}

	
}
