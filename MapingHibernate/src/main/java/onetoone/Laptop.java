package onetoone;

import javax.persistence.*;

@Entity
public class Laptop {
	@Id
	private int LapId;
	private String lapName;
	public int getLapId() {
		return LapId;
	}
	public void setLapId(int lapId) {
		LapId = lapId;
	}
	public String getLapName() {
		return lapName;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	
	

}
