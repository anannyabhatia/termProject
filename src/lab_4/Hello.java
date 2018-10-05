package lab_4;


public class Hello {

	public static main(String[] args) 
	{
		Hello hello = new Hello();
		hello.methodA();
		hello.methodB();
		hello.methodC();
	}

	public void methodA(void ) { 
	System.out.println("first scenario");}

	public void methodB(void) { }

	public void methodC(void) { 
	System.out.println("User A's changes to method C");}
}
