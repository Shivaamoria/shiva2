package First_JPA;

interface shiva{
	void check(int b);
}
public class lemda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x =10;
shiva s=(b)->{	
		System.out.println(x*b);	
};

s.check(10);
	}

}
