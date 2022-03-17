package First_JPA;

import javax.persistence.*;

public class InsertionPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("DataJPA");
EntityManager em=emf.createEntityManager();
em.getTransaction().begin();
student s=new student();
s.setSname("Shivani");
s.setSrno(2022);

student s1=new student();
s1.setSname("Shivam");
s1.setSrno(2022);
em.persist(s1);
//student s1=em.find(student.class,8);
//System.out.println(s1.getId()+" "+s1.getSrno()+" "+s1.getSname()+" "+s1.getStandard());
//em.remove(s1);
em.getTransaction().commit();

}

}
