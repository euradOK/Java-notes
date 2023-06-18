
//INITIATIZATION OF FINAL INSTANCE
//Posible places to perfom initilization of final instance variables
//Instance block is excuted before constructor

//At time of declaration
class  Test
{
	final int x=0;
	
}

//Inside instance block
class  Test
{
	final int x;
	{
		x=0;
	}
	
}


//Inside constructor
class  Test
{
	final int x;
	Test()
	{
		x=0
	}
	
}


Note01:
if a variable is not varied from object to object such type of variable is not recommended 
to declare as instance varibale we have to  declare those varibale a class level by using 
static modifiers.  


Note02:
In case of instance variable for every object a separate copy will be created.
But in case of static varaibles a single copy will be created at class level and shared 
by every object of that class.
  
Note03:
For static variables it is not required to perform initialization explicitly JVM 
will always provide default values.

Example:
class Test
{
	static int x=0;
	public static main(String args[])
	{
		System.out.println(x);  //0
	}
}

Note04:
If a static variable declared as final then compulsory we should perform initialization 
explicitly otherwise we will get CE and JVM will not provide default values

Example:
class Test
{
	final static int x;  //CE  should be initilized 
}

Rule: For final static variables complusory we should perform initilization 
		before class load completion i,e the following are various places for this 

At time of declaration:

class Test
{
	final static int x=0;
}

Inside Static Block
class Test
{
	final static int x;
	static
	{
		x=0;
	}
}

Note05: 
If we are trying to perform initialization anywhere else then will get compile error
Example:

class Test
{
	final static int x;
	public void m1()
	{
		x=10;  //CE
	}
}

Note06:
FOr Local variables JVM will not provide default values compulsory we should perform 
inititilzation explcitly before using that local variable.
i,e if we are not using then it is not required to perform initilization for local
variables.

Example:
class Test
{
	public static void main(String args[])
	{
		int x;
		System.out.println("Hello") // Hello
	}
}

class Test
{
	public static void main(String args[])
	{
		int x;
		System.out.println(x) // CE: you should initiliaze x before using it.
	}
}


Even though local variable is final before using using only you have to perform 
initiazation i,e if we are not using then not required to perform initization even 
though is final

Example:
class Test
{
	public static void main(String args[])
	{
		final int x;
		System.out.println("Hello") // Hello
	}
}


The only applicable modifier for local variable is final.
By mistake if you are tryig to use any modifier then we will get CE:

example:
class Test
{
//instance variables
		private int x=10;		
		public int x=10;		
		protected  int x=10;	
		static int x=10;
		
		public static int y=10;		
		private static int y=10;		
		protected static int y=10;	
		static int y=10;
				

	public static main(String args[])
	{
		//Local variables
		private int x=10;		//Invalid
		public int x=10;		//Invalid
		protected  int x=10;	//Invalid
		static int x=10;		//Invalid
		transient  int x=10;	//Invalid
		volatile int x=10;		//Invalid


		final int x=10;   //Valid 


	}
}

Note:
If we are not declaring any modifiers then by default it is default by this rule is 
applicable only for instance and static variable but not for local variables.

Note:
Formal parameters of a method simply access local variables of that method hence 
formal parameter can be declared as final.

if formal parameter declared as final then within a method we cant perform re-assignment

Example:
class Test
{
	public static void main(String args[])
	{
		m1(10,20)  //actual parameters 
	}
	
	public static void m1(final int x,int y) //formal parameters 
	{
		int x=100;   //CE: Cannot assign a value to final variable
		int y=200;

		System.out.println(X + Y);
	}
}