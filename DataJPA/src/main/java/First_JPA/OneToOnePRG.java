package First_JPA;

import javax.persistence.*;

public class OneToOnePRG {
	
		  
	    public static void main(String[] args) {  
	          
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "DataJPA" );  
	           EntityManager em = emf.createEntityManager( );  
	           em.getTransaction( ).begin( );  
	          
	           student st1=new student();  
	           st1.setId(31);  
	           st1.setSname("Vipul");  
	             
	           student st2=new student();  
	           st2.setId(32);  
	           st2.setSname("Vimal");  
	             
	             
	           em.persist(st1);  
	           em.persist(st2);  
	             
	           Library lib1=new Library();  
	           lib1.setB_id(107);  
	           lib1.setB_name("Technology");  
	           lib1.setStudent(st1);  
	             
	           Library lib2=new Library();  
	           lib2.setB_id(108);  
	           lib2.setB_name("Fundamentals");  
	           lib2.setStudent(st2);  
	             
	           em.persist(lib1);  
	           em.persist(lib2);  
	             
	           em.getTransaction().commit();  
	             
	           em.close();  
	           emf.close();  
	    }  
	      
	      
}
