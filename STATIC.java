Note:
static is modifier applicable for methods and variables but not for classes

We can not declare top level class with the static modifier but we can declare inner 
class as static (such type of inner classes are called static nested classes).

In the case of instance variables for every object a separate copy will be created but 
in the case of static variables a single copy will be created a class level and shared 
by every object of that class.

class Test
{
	static int x=10;
	int y=20;

	public static void main(String args[])
	{
		Test t1=new Test();
		t1.x=888;
		t1.y=999;

		Test t2=new Test();

		System.out.println(t2.x + "...."+t2.y)   //888 ...20
	}
}


We can not access members directly from static area but we can access from instance 
area directly.

We can access static members from both instance and static area directly.

Example:
Consider the following declaration
1.int x=10
2.static int x=10;
3.public void m1()
{
	System.out.println(x);
}

4.public  static void m1()
{
	System.out.println(x);
}

Within the same class which of the above declaration we can take simultaneously.
1 & 3	//Valid 
1 & 4	//Invalid  CE: non-static variable can not referenced from a static context 
2 & 3	//Valid 
2 & 4	//Valid 
1 & 2	//Invalid CE:x is already defined  in Test
3 & 4	//InValid  CE:m1 is already defined in  Test

Note: In the same class two method having same signature is not allowed (m1())


case 01:
Overloading concepts applicable for static methods including main method but JVM 
can always call String args[] main method only.

class Test
{
	public static void main(String args[])
	{
		System.out.println("String args[]");  //String args[]
	}
	public static void main(int args[])
	{
		System.out.println("int args[]");
	}
} 

case 02:
inheritance concept applicable for static method includig main method, Hence while
excuting child class if child does not contain main method, then parent class 
main method will be excuted.

Example:
class p
{
	public static void main(String args[])
	{
		System.out.println("parent Main")  //parent Main
	}
}

class c extends p
{
}  //parent Main


case 03:
 It seems overriding applicable for static methods but it not overriding and 
 is method hiding.

 Example:
class p
{
	public static void main(String args[])
	{
		System.out.println("parent Main")  //parent Main
	}
}

class c extends p
{
	public static void main(String args[])
	{
		System.out.println("Child Main")  //Child Main
	}
} 

Note:
For static method overloading and inheritance concepts are applicable but 
overriding concept not applicable. But instead overriding, method hiding 
is applicable.


	WHEN TO USE STATIC OR INSTANCE METHOD
	=======================================
Inside method implementation if we are using atleast one instance variable then that
method talks about a particular object hence we should declare a method as instance 
method 

Inside method implementation if we are not using any instance variable then this 
method nowhere related to a particular object, hence we have to declare such type 
of method as static method irrespective of whether we are using static variable 
or not.

Example:
class Student 
{
	String name;
	int rollno;
	int marks;
	static String cname;
}

getStudentinfo() //instance
{
	return name +"..."+ marks;
}
getCollegeinfo() //static
{
	return cname;
}
getAverage(int y,int x) //static
{
	return x+y/2;
}
getCompleteinfo() //instance 
{
	return name +"..."+ marks +"..."+ cname + "..."+rollno;
}

Note:
For static methods implementation should be available whereas for abstract 
method implementation should not be available, hence abstract static combination 
is illegal for methods



	syncronized 
	============
syncronized is a modifier applicable for methods and blocks but not for classes and 
variables.

If multiple Thread are trying to operate simultaneosly on the same java object 
then there may be a chance of data inconstance problem, this is called Leece 
condition
We can overcome this problem by using syncronized key.

If a method or block declared as syncronized then at time only one thread is allowed
to excute that method or block on a given object so that data incosistance problem
will be resolved.

But main disadvantage is it increase waiting time of threads and creates performance 
problems hence if there is no specific requirement then it is not recommended to use 
syncronized key word.

Syncronized method should compulsory contain implementation whereas abstract method 
does not contain any implementation hence abstract syncronized is illegal combination
of modifier for methods.