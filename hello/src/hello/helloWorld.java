package hello;
class abc{

	public abc(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}
	int k=10;
	int p;
	String name="CHARANPREET KAUR DHILLON IS MY NAME. THIS IS NEW REPO CHANGE";
}
public class helloWorld {
	public static void main(String args[])
	{
		System.out.println("hello");
		int i=10,j=20;
		int r;
		r= max(i,j);
		System.out.println(r);
		abc ob = new abc(20,30,"dhillon");  //here simple abc ob; does not work. we have to give it this way only.
		System.out.println("my name is "  + ob.name + " \nmy int is " + ob.k + "p is"+ ob.p);
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j)
			return j;
		else 
			return i;
	}

}
