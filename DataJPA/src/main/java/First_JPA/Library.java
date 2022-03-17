package First_JPA;

import javax.persistence.*;

@Entity
public class Library {
	 @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int b_id;  
	private String b_name;  
	  
	@OneToOne(cascade=CascadeType.PERSIST)	
	private student student;   
	  
	public Library(int b_id, String b_name, student student) {  
	   // super();  
	    this.b_id = b_id;  
	    this.b_name = b_name;  
	    this.student = student;  
	}  
	  
	public Library() {  
	    super();  
	      
	}  
	  
	public int getB_id() {  
	    return b_id;  
	}  
	  
	public void setB_id(int b_id) {  
	    this.b_id = b_id;  
	}  
	  
	public String getB_name() {  
	    return b_name;  
	}  
	  
	public void setB_name(String b_name) {  
	    this.b_name = b_name;  
	}  
	  
	public student getStudent() {  
	    return student;  
	}  
	  
	public void setStudent(student student) {  
	    this.student = student;  
	}  
	  
	  
	      
}
