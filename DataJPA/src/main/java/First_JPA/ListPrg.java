package First_JPA;

import javax.persistence.*;
public class ListPrg {
	public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("DataJPA");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Address a1= new Address();
        a1.city="agra";
        a1.state="up";
        Address a2= new Address();
        a2.city="delhi";
        a2.state="delhi";
        Address a3= new Address();
        a3.city="noida";
        a3.state="UP";
        student s1=new student();
        s1.setId(100);
        s1.setSname("vaibhav");
        s1.getAddress().add(a1);
        student s2=new student();
        s2.setId(101);
        s2.setSname("Aakash");
        s2.getAddress().add(a2);
        student s3=new student();
        s3.setId(102);
        s3.setSname("Amaid");
        s3.getAddress().add(a3);
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
     em.getTransaction().commit();
        
	}
}
