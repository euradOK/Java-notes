Generics
---------
1.Introduction.
2.Generic classes.
3.Bounded Types.
4.Generic Methods and wild card character(?)
5.Communication with non-Generic code
6.Conclusions.

1.Introduction:
===============
The main objectives of Generics are 
	To provide Type Safety and 
	To Resolve Type Casting problems.

	CASE1: TYPE SAFETY
----------------------------------
-Arrays are type safe that is we can give the guarantee for the type of element 
present inside array.

-For example if our progarm requirement is to hold only string type of objects we 
can choose string array. By mistake if you trying to any type of object you will get 
compile time error.

Example:
String [] s=new String [1000];
	s[0]="durga";
	s[1]="Ravi";
	s[2]=new Interger(10); //CE: Incompatible types found: java.lang.Interger  Required:java.lang.String

-Hence String array can contain String type of object due to this we can give guarantee 
for type of elements present inside arrays,hence arrays are safe to use with respect to 
type that is array is type safe.

But collections are not Type safe that is we cant give the guarantee for the type of element 
present in collection.
For Example if our progaramme requirement is to hold only string type of object and 
if we choose arraylist, By mistake if we are trying to add any type of object we wont get 
any compile time eroor but progaram may fail at Runtime.

	ArrayList l=new ArrayList();
	l.add("eurad");
	l.add("emma");
	l.add(new Interger(10));

Getting Elements from ArrayList
	String name1=(String)l.get(0);
	String name2=(String)l.get(1);
	String name3=(String)l.get(2); //RE:ClassCastException

Hence we cant give the guarantee for the type of elements present inside collection due to 
this collections are not safe to use with respect to type that is collections are not type safe.


	CASE2: TYPECASTING
------------------------------------
In the case of arrays at the time of retrieval it is not required to perform type casting 
because there is guarantee for type of element inside array.
Example:
String[] s=new String [1000];
s[0]= "eurad";
 
Retrieval
String name=s[0];  //type casting not allowed 

But in the case of collections at the time of retrieval compulsory we should perform type 
casting because there no guarantee for the type of elements present inside collections.
Example:
ArrayList l= new ArrayList();
l.add("eurad");

Retrieval
String name1=l.get(0);

CE:incopatible type found java.lang.Object Required:java.lang.String

String name1=(String)l.get(0);  //typecasting

Hence Typecasting is bigger headache in collections.
To overcome above problems of collections Sun people introduced Generics concept in 1.5v.
Hence the main objectives are:
	To provide type safety 
	To Resolve type casting problems.


3.Bounded Types.
----------------
We can bound the type parameter for a particular range by using extends key word. Such types are
called Bounded Types.

Example:
class Test<T> {
	Test<Integer> t1=new Test<Integer>();
	Test<String> t2=new Test<String>();
}
As a parameter we can pass any type and there are no restrictions and hence it is unbounded type.

Syntax for bounded types:
-------------------------

class Test<T extends x>{}
x can be either class or interface.If x is a class then T as parameter we can pass either type
or its child classes. If x is an interface then at T parameter we can pass either x type or 
its implementation classes.

Example01:
class Test<T extends Number>{}
Test<Integer> t1=new Test<Integer>();	//Valid
Test<String> t2=new Test<String>();		//CE: Type parameter j.l.String is not its bound.

Example02:
class Test<T extends Runnable>{}
Test<Runnable> t1=new Test<Runnable>();	//Valid
Test<Thread> t2=new Test<Thread>();		//Valid
Test<String> t2=new Test<String>();		//CE: Type parameter j.l.String is not its bound.

We can define bounded types even in combination also.
Example:
class Test<T extends Number & Runnable>{}
-At T parameter can take anything which should be child of Number and should implement Runnable
interface.

Example:
class Test<T extends Runnable & Comparable>{}		//valid
class Test<T extends Number & Runnable & Comparable>{} //valid
class Test<T extends Runnable & Number>{}	//Not Valid: Take class first followed by interface
class Test<T extends Number & Thread>{}	//not valid: we cant extend more than one class simulatameosly.

Note01:
We can define bounded types only by using extends key word. And we cant use implements and super
keywords but we can replace implements keyword purpose with extends keywors.

class Test<T extends Number>{}		//valid
class Test<T implements Runnable>{} //Not Valid
class Test<T extends Runnable >{}	// Valid
class Test<T super String>{}		//Not Valid 

Note02:
As T parameter we can take any valid java identifer but it convrntion to use T.
class Test<T>{} //valid
class Test<X>{}	//valid
class Test<A>{}	//valid
class Test<eurad>{}	//valid

Note03:
Based on our requirement we can declare any number of type parameters and all these type 
parameters should be separated with comma.

class Test<A,B>{}
class Test<X,Y,Z>{}
class HashMap<K,V>{}

4.Generic Methods and wild card character(?):
---------------------------------------------
1.m1(ArrayList<String> l)
--------------------------
-We can call this method by passing ArrayList of only String type.
-But within a method we can add only String type of Object to the List by 
mistake if we are trying to add any other type then we will get compile time error.
Example:
m1(ArrayList<String> l)
{
	l.add("A");	//valid
	l.add(null);//valid
	l.add(10);	//CE
}


2.m1(ArrayList<?> l)
---------------------
-We can call this method by passing ArrayList of any type.
-But within a method we cant add anything to the list except null because we dont 
know the value exactly.
-Null is allowed because it valid value any type.
Example:
m1(ArrayList<?> l)
{
	l.add(10.5);	//CE
	l.add(10);		//CE
	l.add("A");		//CE
	l.add(null);	//Valid
}

-This type of methods are best suitable for ready only operation.

3.m1(ArrayList<? extends x> l)
-------------------------------
-x can be either class or interface.
-If x is a class then we can call this method by passing ArrayList of x type or its
child classes.
-If x is an interface then we can call this method by passing ArrayList of x type or
its implementation classes.
-But within the method we cant add anything to the list except null because we dont 
know the type of x exactly.
-This type of method best suitable for read only operation.

4.m1(ArrayList<? super x> l)
----------------------------
-x can be either class or interface.
-If x is a class then we can call this method by passing either ArrayList of x type or its
super classes.
-If x is a interface then we can call this method by passing either ArrayList of x type or its
super classes of implementation class of x.
-But within the method we can add x type of object and null to the list.
Example:
m1(ArrayList<? super x> l)
{
	l.add(x);	//valid
	l.add(null);//valid
}

Qns:
ArrayList<String> l=new ArrayList<String>();//valid
ArrayList<?> l=new ArrayList<String>();//valid
ArrayList<?> l=new ArrayList<Integer>();//valid
ArrayList<? extends Number> l=new ArrayList<Integer>();//valid
ArrayList<? extends Number> l=new ArrayList<String>();//ce:incompatible type found: AL<String> required:AL<? extends Number
ArrayList<? super String> l=new ArrayList<Object>();//valid
ArrayList<?> l=new ArrayList<?>();//ce:incompatible type found: ? required:class or interface without bounds
ArrayList<?> l=new ArrayList<? extends Number>();//ce:incompatible type found: extends Number required:class or interface without bounds



-We can declare Type parameter either at class level or at method level.

Declare Type parameter at class level.
---------------------------------------
class Test<T>{
	We can use T in this class based on our requirement.
}


Declare Type parameter at method Level:
---------------------------------------
We have to declare Type parameter just before retutn type.
class Test{
	public <T>void m1(T ob)
	{
		We can use T in this class based on our requirement.
	}
}

-We can define bounded type also at method level
Example:
public <T>void m1()
public <T extends Number>void m1() //valid
public <T extends Runnable>void m1()//valid
public <T extends Number & Runnable>void m1()//valid
public <T extends Comparable & Runnable>void m1()//valid
public <T extends Number & Comparable & Runnable>void m1()//valid
public <T extends Runnable & Number>void m1() //ce:We have take class first followed by interface
public <T extends Number & Thread>void m1()	//ce:We cant extends more than one class.



Communication with no-generic code:
-----------------------------------
-If we send generic object to non-generic area then it starts behaving 
like non-generic object.
-Similarly if we send non-generic object to generic area then it start 
behaving like generic object. That is location in which object present 
based on behaviour will be defined.

Example:
class Test
{
	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("eurad");
		l.add("emma");
		l.add(10);//ce
		l.add("eurad");
		m1();
		System.out.println(l);//[eurad,emma,10.105,true]
		
	}

	public static void m1(ArrayList l)
	{
		l.add(10);
		l.add(10.5);
		l.add(true);
	}
}

Conclusions:
============
Note01:
The main purpose of Generics is provide Type safety and resolve Type casting problems.
Type safety and Type casting both are applicable at compile time hence Generics concepts also applicable 
only at compile time but not run time.

At time of compilation at last step generic syntax will be removed and hence for JVM Generic concept will
not be available.
Example:
ArrayList l=new ArrayList<String>();
l.add(10);
l.add(10.5);
l.add(true);
System.out.println(l); //[10,10.5,true]

Hence the following declaration are equal.
ArrayList l=new ArrayList<>(String);
ArrayList l=new ArrayList<>(Integer);
ArrayList l=new ArrayList<>(Double);
ArrayList l=new ArrayList();

The following declaration are equal:
ArrayList<String> l=new ArrayList<String>();
ArrayList<String> l=new ArrayList();

For these ArrayList object we can add only String type of objects.

Example02:
class Test
{
	public void m1(ArrayList<String> l){}
	public void m1(ArrayList<Integer> l){}
}
ce: name clash: both methods have same erasure.



	ASSERTIONS
-----------------------------
INTRODUCTION
Very common way of debbuging is usage of SOP statement.But the problem of SOP is after fixing the bug cumposulsory we have to delete SOP statement
otherwise these SOP will be excuted at Runtime for every request, which creates performance problems and disturbs server logs.

To overcome these problems some people introduced Assertions concepts in 1.4 Version.

The main advantages of Assertions when compared to SOP is after fixing the bug we are not requred to remove assert statements because the wont be excuted by default 
at Runtime. Based on our requirement we can enable and disable assertions. And by Default Assertions are Disabled.

Hence the main objective of Assertions is to perform Debbuging.
Ussually we can perform debbugging in development and test environment but not in production environment hence assertions concepts applicable for Development 
and Test environment but not in production.

Assert keyword introduced in 1.4V hence from 1.4V  onwards we cant use assert as 
identifier otherwise we will compile time error.




	
