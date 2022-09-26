package InterfaceTopic;

interface Demmo
{
	void add();
	void addd();
}
 class Hello1 implements Demmo
{
	public void add()
	{
		System.out.println("hello");
	}
	public void addd()
	{
		System.out.println("hello");
	}
}
class Interface_1{
	public static void main(String[] args)
	{
		Hello1 h1=new Hello1();
		h1.add();
		h1.addd();
	}
}