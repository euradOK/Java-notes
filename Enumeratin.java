							Enum(Enumeration):
							==================
If we want to represent a group of named constants then we should go for enum.
eg:
enum Month{
	JAN,FEB,MAR.APR.....DEC;
}
	
Enum Beer{
	SERE,KILI,TUSK.....; //semicolon is optional
}

The main ojective of enum is define our own data types(enumerated data types)
Enum concept introduced in 1.5 version.
When compared with old languages enum, Java enum is more powerful.

		Internal implementation of Enum:
		--------------------------------
1.Every enum is internally implememnted by using class concept.
2.Every constant is always public static final.
3.Every enum constant represent an object of type enum.

eg:
enum Beer{
	SERE,KILI
}

Internally repsented as 
class Beer{
	public static final BEER SERE=new Beer();
	public static final BEER KILI=new Beer();
}

			Enum declaration and Usage:
			---------------------------
Every enum constant is always public static final and hence we can access enum constant by using 
enum name.
eg:
enum Beer{
	KF,FO,RC,KO
}
class Test{
	public static void main(String[] args){
		Beer b=Beer.RC;
		System.out.println(b); //RC
	}
}

Note:
-Inside enum toString method is implemented to return name of the constant.
-We can declare enum either within a class or outside the class but not inside a method.

-If we are trying to declare inside a method then we will get compile error saying 
enum types must not be local.
eg:
class X{
	public void m1(){
		enum Y{}  //CE:enum types must not be local
	}
}


-If we declare enum outside of the class the applicable modifiers are public, default and strictfp.
-If we declare enum inside of the class the applicable modifiers are public, default,strictfp,
private, protected and static.

			Enum vs switch():
			------------------
-Until 1.4 the allowed argument types for the switch statement are byte,short,char,int.
-But from 1.5 onward corresponding wrapper classes and enum types allowed.
-From 1.7 string type also allowed.

1.4		1.5			1.7
byte	Byte		String
short	Short
char	Character
int		Integer
		enum

Hence from 1.5 version onward we can pass enum type as argument to switch statement.
eg:
enum Beer{
	KF,FO,RC,KO
}
class Test{
	public static void main(String[] args){
		Beer b=Beer.RC;
		switch(b){
			case KF:
				System.out.println("This is children brand");
				break;
			case RC:
				System.out.println("It is not that kick");
				break;
			case FO:
				System.out.println("Buy one get one free");
				break;
			case KO:
				System.out.println("This is too light");
				break;
			default:
				system.out.println("Other brand not recommended");
		}
	}
}

If we pass enum type as argument to switch statement then every case label should be valid 
enum constant otherwise will get compile time error.

eg:
switch(b){
	case KF:
	case KO:
	case RC:
	case FO:
	case KALYANI: //CE:unqualified enumeration constant name required
}

			Enum vs Inheritance:
			--------------------
-Every Enum is always direct child class of java.lang.Enum and hence our Enum cant extend any
other Enum (because java wont provide support for multiple inheritance)
-Every Enum is always final implicitly and hence for our Enum we cant create child Enum.

-Because of above reason we can conclude inheritance concept not applicable for enum explicitly
under we cant use extend keyword for Enum.
eg:
1.	enum x{}
	enum Y extends X{} //Error

2.	enum X extends java.lang.Enum{} //Error

3.	class X{}
	enum Y extends X{} //CE: cannot 

4.	enum X{}
	class Y extends X //CE1:enum types are not extensible
						//CE2:Can not inherit from final X
	
Anyway an enum can implements any number of interfaces.
eg:
interface X {}
enum Y implements X{}


		Conclusion about java.lang.Enum:
		--------------------------------
-Every enum in java is directly child class java.lang.enum and hence this class act as base class 
of all java enums.
-It is an abstract class and its direct child class of object.
-It implements Serializable and Comparable.

values() method:
----------------
Every enum implictly contain values method to list out values present inside enum.
eg.
Beer[] b=Beer.values();

Note:
Values method not present in java.lang.Enum and Object classes.Enum keyword implicitly provide 
this keyword.


ordinal() method:
-----------------
-Inside enum order of constants is important and we can reprsent this order by using ordinal value.
-We can find ordinal value of enum constant by using ordinal method.
	public final int ordinal();
-Ordinal value is 0 based like array index.

eg:
enum Beer{
	KF,FO,RC,KO
}
class Test{
	public static void main(String[] args){
		Beer b=Beer.RC;
		for (Beer b1:b )
		{
			System.out.println(b1 + "...." + b1.ordinal());
		}
	}
}


Speciality of Java Enum:
------------------------
-In old languages Enum we can take only constants but in java enum in addition to constants we 
-can take method,constructors, normal varibles e.tc and hence java Enum is more powerfull than 
old languages Enum.
-Even in Java enum we can declare method and we can run enum class direcly from command prompt.

eg:
enum Fish{
	STAR,GUPPY,GOLD;
	
	public static main(String[] args){
		System.out.println("Enum main Method"); //Enum main Method
	}
}

Note:
-In addition to constant if we are taking extra member like a method then list of constant should 
be in the first line and should ends with a semicolon.

-Inside enum If we are taking any extra member like method complsory the first line should contain
list of constants atleast semicolon at least semicolon.

-An empty Enum is valid java syntax.

eg:
1. enum Fish{
	STAR,GUPPY,GOLD;	//semicolon mandatory
	public void m1(){}
}

2.	enum Fish{
	STAR,GUPPY,GOLD  //Error: No semicolon
	public void m1(){}
}

3.	enum Fish{
		public void m1(){}
		STAR,GUPPY,GOLD; //Error : this should start before member method
		}

4.	enum Fish{
		public void m1(){} //Invalid : 	 
		}

5.	enum Fish{
		;
		public void m1(){} //valid : 	 
		}

6.	enum Fish{}  //valid


Enum vs Constructor:
--------------------
-An enum can contain constructor.
-Enum constructor will be excuted separately for every enum constant at time of enum class loading
automatically.

eg:
enum Beer{
	KF,KO,RC,FO;
	Beer(){
		System.out.print("Constructor");
	}
}
class Test{
	public static void main(String[] args){
		Beer b=Beer.RC;  //line-1
		System.out.println("Hello")
	} 	
}

java Test: output 
Constructor
Constructor
Constructor
Constructor
Hello

Note:
-And if we comment line-1 output is Hello

We cant create enum object directly and hence we cant envoke enum constructor directly.
eg:
Beer b=new Beer(); //Error: Enum type may not be instantiated

eg:
enum Beer{
	KF(60),KO(80),RC(90),FO;
	int price;

	Beer(int price){
		this.price=65
	}
	public int getPrice(){
		return price;
	}
} 
class Test{
	public static void main(String[] arg){
		Beer[] b=Beer.values();
		for (Beer b1:b )
		{
			System.out.println(b1+ "...."+b1.getPrice());
		}
	}
}

Note:
KF==>public static final Beer KF=new Beer();
KF(70)===>public static final Beer KF=new Beer(70);

-Inside enum we can declare method but should be concrete method only and we cant declate abstract 
method.

Case-01:
-Every enum constant represents an object of the type enum hence whatever method we can apply 
on normal java objects,can be applicable on enum constant also.

eg:
Beer.KF.equals(Beer.RC) //Valid
Beer.KF.hashCode()> Beer.RC.hashCode() //Valid
Beer.KF > Beer.RC //Invalid 
Beer.KF.ordinal()<Beer.RC.ordinal() //Valid 

Case-02:
-If we want use any class or interface directly from outside package then the required import is 
normal import.
-If we we access static members without class name then the required import is static import.

eg:
import static java.lang.math.sqrt;
import java.util.ArrayList;
class Test{
	public static void main(String[] args){
		ArrayList l=new ArrayList();
		System.out.println(sqrt(4));
	}
}

eg:
package pack1;
public enum Fish{
	STAR,GUPPY;
}
package pack2;
public class Test{
	public static void main(String[] args){
		Fish f=Fish.Guppy;		//required import is import pack1.fish; or import pack1.*;
		System.out.println(f);
	}
}

package pack3;
public class Test2{
	public static void main(){
		System.out.println(STAR);	//required import is import static pack1.fish.STAR; 
	}								//or import static pack1.fish.*;
}
package pack4;
public class Test{
	public static void main(String[] args){
		Fish f=Fish.STAR;			//required import is import pack1.fish; or import pack1.*;
		System.out.println(GUPPY);//required import is import static pack1.fish.GUPPY; 
	}								//or import static  pack1.Fish.*;
}


enum vs Enum vs Enumeration:
----------------------------
-enum is keyword in Java which can be used to define a group of named constants.
-Enum is class in Java present in java.lang package.Every enum in java should be direct child 
class of Enum hence this class act as base class for all java Enum.
-Enumearation is an interface present in java.util package.We can use enumeration method to get 
object one by one from the collection.
