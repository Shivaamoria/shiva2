package First_JPA;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="student") 
public class student {	
	@Id
	 int id;	
	@ElementCollection
	private List<Address> address=new ArrayList<Address>();
 public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSrno() {
	return Srno;
}
public void setSrno(int srno) {
	Srno = srno;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}

int Srno;
 String Sname;


	}