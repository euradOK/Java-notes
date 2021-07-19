Var-args examples:
-----------------
class  Test
{
	public static void main(String[] args) 
	{
		sum();
		sum(10);
		sum(10,28,30);
		sum(289,3990,3873);
	}
	public static void sum(int... x)
	{
		int total=0;
		for (int x1:x)
		{
			total=total + x1;
		}
		System.out.println("The sum is :" + total);
	}
}

Valid var-args method declaration:
----------------------------------
m1(int... x)
m1(int ...x)
m1(int...x)


