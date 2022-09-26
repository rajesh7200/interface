package InterfaceTopic;

public class Interface_2 {

	public static void main(String[] args) {
		
		Memo3 m1=new Memo3();
		m1.fo();
		m1.mo();
	}

}

interface Sampl
{
	void fo();
	void mo();
}

abstract class Demo3 implements Sampl
{
 public void fo()
 {
	 System.out.println("fofo");
 }
 public abstract void mo();
}
 
 class Memo3 extends Demo3
 {
	public void mo()
	{
		System.out.println("momo");
	}
 }
