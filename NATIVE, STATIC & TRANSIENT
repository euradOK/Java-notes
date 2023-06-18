	NATIVE
	=======
native is a modifier applicable only for methods and we cant apply anywhere else.
The methods which are implemented in non java mostly c++ are called native methods 
are foreign methods.

The main objectives of native keyword are:
-To improve performance of the system.
-To achieve machine level or memory level of communication.
-To use already existing legacy non-java code 

	PSUDO CODE TO USE NATIVE KEYWORD IN JAVA 
	========================================
class Native
{
	static
	{
		System.LoadLibrary("Native Library Data");  //Load Native Library
	}
	public native void m1();	//Declare a native method
}

class client 
{
	public static void main(String args[])
	{
		Native n=new Native();
		n.m1();			//Envoke a native method
	}
}

Note:
Native method should end with semicolon.
Example:
public native void m1();		//Valid
public native void m1(){}	//Invalid  CE:native method can not have a body

For native methods implementation is already available in old languages but for 
abstract methods implemtation should not be avaialble hence we cant declare 
native mathod as abstract i,e native abstract is illegal combination for methods.

We can not declare native method as strictfp because there is not guarantee that 
old language will follow IEEE 754 standard hence native strictfp combination is illegal
combination for methods.

The main advantage of native keyword is performance will be improved but the main 
disadvantage of native keyword is it breaks platform independent of java.

	TRANSIENT
	=========
transient is a modifier applicable only for variables.
We can use transient key in serialization context

At the serialization if you dont want to save the value of particular variable to meet 
security constraints then we should declare a varibale as transient.

At the time of serialization JVM ignores origanal value of transient variables and 
save default value to file, hence transient means not to serialize.

	VOLATILE
	=========
If a value of variable keeps on changing by multiple threads then they may be a chance 
of data inconstance problems.
We can solve this problems by using volatile modifier.

If variable declared as volatile then every Thread JVM will create a separate local copy. 
Every modification performed by a thread will takes place in local copy so that there is 
no effect on remaining Threads.

The main advantage is volatile keyword is we can overcome data incostance problems.

But the main disadvantage of volatile keyword creating and maintaining a separate copy
of every threads increase complexity of programming and creates performance problems
hence if there is no specific requirement it is never recommended to use volatile 
keyword and it is almost deprecated keyword.

final variable means the value never changes whereas volatile variable means the 
value keeps on changing,hence volatile final ia illegal combination for variables.

