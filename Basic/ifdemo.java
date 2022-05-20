package Basic;

public class ifdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("if condition");
		int a = 20;
		if(a>30)
		{
			System.out.println("block1");
		}
		else if(a>25)
		{
			System.out.println("block2");
		}
		else if(a<=20)
		{
			System.out.println("block3");
		}
		else
		{
			System.out.println("not in range");
		}

	}

}
