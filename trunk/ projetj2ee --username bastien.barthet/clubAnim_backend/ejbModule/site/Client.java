package site;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	private String name;

	public Client(String n) {
		this.name = n;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	
}
