flow control
============
flow control describe the order in which the statement will be excuted at 
run time.
There are 3 type of flow control:
1.Selection Statement
Among several options only one statement will selected and excuted.
	-if-else
	-switch() 
2.iterative Statement 
A group of statements will be excuted iteratively.
	-while
	-do while
	-for()
	-for each loop(came in 1.5 version)
3.transfer Statement 

	-break
	-continue
	-return
	-try-catch-finally
	-assert
==================================================


1.Selection Statement
	-if-else
syntax:
	if (b)
	{
		Action if b is true
	}
	else
	{
		if b is false 
	}
Note:
The argument in if statement should be boolean type.if you are trying any
other type will get error.

Example:
int x=0;		//c:incompatible found int required boolen
if (x)
{
	System.out.println("Hello");
}
else
{
	System.out.println("Hi");
}

Example02:
int x=10;		//c:incompatible found int required boolen
if (x=20)
{
	System.out.println("Hello");
}
else
{
	System.out.println("Hi");
}

Example03:
boolen b=true;		//Hi
if (b=false)
{
	System.out.println("Hello");
}
else
{
	System.out.println("Hi");
}

Example04:
boolen b=false;		//Hello
if (b==false)
{
	System.out.println("Hello");
}
else
{
	System.out.println("Hi");
}


Else part and curl braces are options. Without curl braces{} only one 
Statement is allowed under if which should not be declative Statement.

Example01:
if (true)
System.out.println("Hello");  

Example02:
if (true);

Example03:
if (true)
int x=10;		//Invalid

Example04:
if (true)
{
	int x=10;		//valid
}

Semicolon is a valid java Statement which also known as empty Statement.

Note:
There is no dangling else problem in java. Every else is mapped to nearest 
if Statement.
Example:
if (true)
{
	if(true)
	System.out.println("Hello"); 
}
else
System.out.println("Hi"); 

The last else is mapped to if which output Hello and not if(true).


Switch Statement:
-----------------
if several options are available then it is not recommended to use 
nested if because it reduces readability. To handle this requirement 
which should go for switch statement.

Syntax:
switch (x)
{
case 1:
	action-1;
	break;

case 2:
	action-2;
	break;

case n:
	action-n;
	break;
default:
	default action

}

The allowed argument types for the switch statement are byte,short,char
int,wrapper classes(Byte,Character,Short,Integer),enum and String.

-except switch curl braces  are optional.(for and if {} are optional)

Both case and default are optional, That is an empty switch statement 
is valid statement.
Example:
This statement is valid.
	int x=10;
	switch (x)
	{

	}

Inside switch every statement should be under some case or default 
that is independent is not allowed inside switch.Otherwise we will
get compile time error.
Example:

	int x=10;
	switch (x)
	{
	System.out.println("hello");		//Invalid 
	}

Every case lebel should compile time constant, that is constant expression.
Example:
int x=10;
int y=20;

switch (x)
{
case 10:
	System.out.println(10);
case y:							//CE:constant expression required
	System.out.println(20);
}  

Exmaple:
int x=10;
final int y=20;

switch (x)
{
case 10:
	System.out.println(10);
case y:							//Valid: No compile error
	System.out.println(20);
}  

Both switch argument and case can be expressions but case label 
should be constant expression.
Example:
int x=10;
switch (x+1)
{
case 10:
	System.out.println(10);
case 10+20+30:
	System.out.println(60);
}

Every case label should be in the range of switch argument type otherwise
we will get compile error
Example:
byte=10;		//range from -127 to 128
switch (b)		// byte
{
case 10:
case 100:
case 1000: 		//CE:Possible loss of presion found int required byte
}

Example:
byte=10;		
switch (b+1)	//Valid: byte is promoted to int type
{
case 10:
case 100:
case 1000:		
}

Example:
int x=10;
switch (x)
{
case 97:
case 98:
case 99:
case 'a':	//CE:Duplicate case label 97 and 'a' are both equal
}


iterative statements
---------------------
While Statement 
-----------------
if we dont know number of iteration in advance then we should go for while loop.
Example01:
while (rs.next())
{
}

Exmapl02:
while (e.hasmoreElement)
{
}
example03:
while (itr.hasNext())
{
}

Syntax:
while (b)
{
	Action..
}

The argument should be boolean,if we are trying to provide any type then 
we will get CE.
Example:
while (1)		//CE: incompatible data type int required boolean
{
System.out.println("hello");
}

Curl braces are optinal and without curl braces we can take only one statement
under while which should not be declative statement.
Example01:
while (true)	//valid
System.out.println("hello");

Example02:
while (true);	//valid

Example03:
while (true)
int x=10;		//invalid 

Example04:
while (true)	//valid
{
	int x=10
}

Example:
--------
while (true)		//invalid(CE): Unreachable statement
{
System.out.println("hello");
}
System.out.println("hi");

Example:
while (false)		//invalid(CE): Unreachable statement
{
System.out.println("hello");
}
System.out.println("hi");

Example:
int a=10; b=20;
while (a<b)		//valid
{
System.out.println("hello");
}
System.out.println("hi");

Example:
int a=10; b=20;
while (a>b)		//valid
{
System.out.println("hello");
}
System.out.println("hi");

Example:
final int a=10; b=20;
while (a<b)		//invalid(CE): Unreachable statement
{
System.out.println("hello");
}
System.out.println("hi");

Example:
final int a=10; b=20;
while (a>b)		//invalid(CE): Unreachable statement '{'
{
System.out.println("hello");
}
System.out.println("hi");

Note: 
Every final variable will be replaced by the value at compile time only.
Example:
final int a=10; 
int b=20;
//after compile time 
System.out.println(a); ==System.out.println(10)
System.out.println(b);==System.out.println(b)

Example:
final int a=10; b=20;
int b=30;
//after compile time 
System.out.println(a+b); ==System.out.println(30)
System.out.println(a+c);==System.out.println(10+c)
System.out.println(a<b);==System.out.println(true)
System.out.println(a<c);==System.out.println(10<c)

Note02:
if every argument is a final variable (compile time constant) then that operation 
should be perfomed at compile time only.

do-while Loop
--------------
if we want to excute loop body at least once then we should go for do-while.

Syntax:
do
{
body
}
while (b);	//b should be boolean

Curl braces are optional and without curl braces we can take one statement between 
do and while which should not be declative statement.
Example01:
do		//valid
System.out.println("hello");
while (tue);

Exmaple02:
do ;		//valid
while ();

Example03:
do
int x=10;	//invalid
while (true);

Example04:
do
{
int x=10;	//valid
}
while (true);

Example05:
do			//invalid
while (true);

Example06:
do while(true)		//valid
System.out.println("hello");
while (false);

For Loop
---------
for loop is the most commonly used loop in java.
if we know number of iteration in advance then for loop is best choice.

Syntax:
for (initialization-section; condition-check; increment/decrement )
{
	loop body
}

Curl braces are optinal and without curl braces we can take only one statement
under loop which should not be declative statement.

Example:
for (int x=0; true;  x++)	//valid 
System.out.println("hello");

Example:
for (int x=0; true;  x++);  //valid 

Example:
for (int i=0; i<10; i++)	//invalid 
int x=10;

Initialization-section
------------------------
This part will be excuted only once in a loop life cycle.
Here we can declare and initialize local variables of for loop.
Here we declare any number of variables but should be of the same type.
By mistake if we are trying to declare different data type variables then we will 
get compile time error.

Example:
int i=0,j=0;	//valid 
int i=0, string s="eurad";	//Invalid 
int i=0, int j=0;		//invalid

In initilization section we can take any java statement including sop statement.
Example:
int i=0;
for (System.out.println("hello"); i<2; i++;)  //valid 
{
	System.out.println("hi");
}

Condition-check:
----------------
Here we can take any valid java expression but should be of the type Boolean.
This part is optional and if we are not taking anything then compiler will always 
place true.

Increment/decrement Section:
-----------------------------
In this section we can take any valid java statement including sop.
Example:
int i=0;
for (System.out.println("hello"); i<3; System.out.println("hi"))	//valid
{
	i++;
}

All parts of for loop are independent each other and are optional.
Example:
for (; ; )		//valid: Infinite loop
{
	System.out.println("hello");
}

for (; ; );		//Valid: Infinite loop


Unreachable code in For loop
----------------------------
Example01:
for (int i=0; true; i++)
{
	System.out.println("hello");
}
System.out.println("Hi");	//Invalid: unreachable statement 

Example02:
for (int i=0; false; i++)
{							//Invalid: unreachable statement '{'
	System.out.println("hello");	
}
System.out.println("Hi");

Example03:
for (int i=0;; i++)
{
	System.out.println("hello");
}
System.out.println("Hi");	//Invalid: unreachable statement 

Example04:
int a=10,b=20;
for (int i=0;a<b; i++)		//Valid:infinite Loop op:hello.....
{
	System.out.println("hello");
}
System.out.println("Hi");

Example05:
int a=10,b=20;
for (int i=0;a>b; i++)		//valid: op Hi
{
	System.out.println("hello");
}
System.out.println("Hi");

Example06:
fina int a=10,b=20;
for (int i=0;a<b; i++)
{
	System.out.println("hello");	
}
System.out.println("Hi");	//Invalid: unreachable statement 

Example07:
fina int a=10,b=20;
for (int i=0;a>b; i++)
{							//Invalid: unreachable statement '{'
	System.out.println("hello");
}
System.out.println("Hi");


For-each loop
--------------
Introduced in 1.5 Version it is specially designed loop to retrive elements 
of arrays of arrays and collections.

Example01:
To print element of one dimensional array

Int[] x={10,20,30,50}

Normal For-loop
for (int i=0;x.length; i++)
{
	System.out.println(x[i]);
}

For-each Loop
for (x1:x)
{
	System.out.println(x1);
}

Example02:
To print element of two dimensional array

Int[][] x={{10,20,30},{40,50}};

Normal For-loop
for (int i=0; i<x.length; i++)
{
	for (int j=0; j<x[i].length; j++)
	{
		System.out.println(x[i][j]);
	}
}

For-each Loop
for (int[] x1:x)
{
	for (int x2:x)
	{
		System.out.println(x2);
	}
}

For each loop is the best choice to retrieve elements of arrays and collection.
But its limitations is it is applicable for arrays and collection and it is not 
generally purpose loop.
Example:
for (int i=0; i<10; i++)
{
	System.out.println("Hello");
}

We cant write equivalent for each loop for above code.

By using normal for loop we cant print array elements either in original or 
reverse order.
But by using for each loop we can print array elements only in origainal but 
not in reverse order.

Example:
int[] x={10,20,30,40,50};
for (int i<length-1;i>=0; i--)
{
	System.out.println(x[i]);
}
We cant write equivalent for each loop for above code.

Iterable(I)
-----------
for (eachiteam:target )
{
}
The target element in For each loop should be iterable object.
An object is said to be iterable if only if corresponding class implements
java.lang.iterable interface.
Iterable interface introduced in 1.5 Version and contains only one method iterator.
public Iterator iterator();
All arrays related classes and collection implemented classes already implement
iterable interface.
Being a programmer we are not required to do anything just we should aware the point.

Difference btn iterator and iterable:
-------------------------------------
Iterator 
--------
-it is related to collections.
-we can use to retrieve elements of collection one by one.
-java.util package 
-3 Methods.(hasNext(),next(),remove())

Iterable
--------
-it is related to For each loop.
-The target in For each loop should be iterable.
-java.lang package 
-1 Methods.(iterator())

break Statement:
-----------------
1.we can use break statement in the following palces inside switch to stop follow through
Example:
int i=0;
switch(x)
{
	case 0:
		System.out.println(0);

	case 1:
		System.out.println(1);
		break;

	case 2:
		System.out.println(2);
}

op: 0


2.Inside loop:
To break loop execution based on some condition.
for (int i=0;i<10 ;i++ )
{
	if (i==10)
		break;
	System.out.println("hello");
}
op: 1 2 3 4 

3.Inside labelled blocks
To break block excution based on some condition.
Example:
class Test
{
	public static void main(String[] args)
	{
		int x=10;
		l1:
			{
				System.out.println("begin");
				if (x==10)
				break l1;
				System.out.println("end");
			}
			System.out.println("Hello");
	}
}

op: begin Hello

These are the only places where we can use break statement.if we will get compile 
time error saying break outside switch or loop.
Example:
class Test
{
	public static void main(String[] args)
	{
		int x=10;
		if (x==10)	//CE: break outside switch or Loop
			break;
	}
}

Continue Statement:
-------------------
We can use continue statements inside loops to skip current iteration and continue 
for next iteration.

for (int i=0;i<10 ;i++ )
{
	if (i%2==0)
	{
		continue;
	System.out.println(i);
	}
}
op: 1 3 5 7 9

We can use continue statement only inside loops if we are using anywhere we will get 
compile time error saying continue outside of loops.
Example:
class Test
{
	public static void main(String[] args)
	{
		int x=10;
		if (x==10)	//CE: continue outside switch or Loop
			continue;
	}
}

Labelled break & continue:
--------------------------
We can use labelled break and continue to break or continue a particular Loop 
in nested Loops.
Example:
l1:
	for (; ; )
	{
	l2:
		for (; ; )
		{
			for (; ; )
			{
				break l1;
				break l2;
			}
		}
		l2...
	}
	l1...

Example:
l1:
for (int i=0; i<3; i++)
{
	for (int j=0; j<3; j++)
	{
		if (i==j)
		{
			break;
		System.out.println(i+"..."+j);
		}
	}
}

op:
break:	1...0   break l1:		continue:			continue l2:
		2...0			no op			0...1					1...0
		2...1							0...2					2...0
										1...0					2...1
										1...2
										2...0
										2...1

do while and Continiue:
Example:
int x=0;
do
{
	x++;
	System.out.println(x);
	if (++x<5)
	continue;
	x++;
	System.out.println(x);
}
while (++x<10);

op: 1 4 6 8