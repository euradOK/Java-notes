class Student
{
	static{
		System.out.println("Static Block");
	}
}
class  Test
{

	public static void main(String[] args) 
	{
		Class.ForName("Student"); 
	}
	
}