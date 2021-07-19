ARRAY
-----
1.INTRODUCTION
2.ARRAY DECLARATION
3.ARRAY CREATION 
4.ARRAY INITIALIZATION 
5.ARRAY DECLARATION,CREATION & INITIALIZATION IN ASINGLE LINE
6.length vs length()
7.Anonymous Arrays
8.Array element assignments
9.Array variable assignments


1.Introduction
---------------
Array is INDEXED collection of FIXED number of HOMOGENOUS elements.
Array is used to represent huge number of values using single variable.
Readability is code improved.
int[] x= new int[1000]

Limitations of Array:
1.Array is fixed in size. Once created there is no chance to increase or decrease.
2.Array carries homogenous data types.

2.ARRAY DECLARATION
=====================
int[] x;
int []x;
int x[];

All of array declaration above is valid. But int[] x is mostly recommended b'se name is claerly separated from type. 

Note01:In time of creation we cant specify the size of array. We can specify in time of declation.
int[6] x;	Invalid  Compile error.()
int[] x;	 Valid

Two Dimension Array
-------------------
int[][] x;
int [][]x;
int x[][];

int[] []x;
int[] x[];
int []x[];

All above declaration are valid for two Dimension array;

Which of the Folowing are Valid 
int[] a,b;	a->1,b->1
int[] a[],b;	a->2,b->1
int[] a[],b[];	a->2,b->2
int[] []a,b;	a->2,b->2
int[] []a,b[];	a->2,b->3
int[] []a,[]b;	CE(compile Error)

NOTE02:If we want to specify the dimension before the variable, the fisility is aolicable only for first varibale in a declaration.
if we are trying to apply for remaining variables we will get Compile Error.

int[] []a,[]b,[]c;	for []a is valid but []b and []c violate the above rule.


Three Dimension Array Declaration:
----------------------------------
int[][][] a;
int [][][]a;
int a[][][];
int[] [][]a;
int[] a[][];
int[] []a[];
int[][] []a;
int[][] a[];
int [][]a[];
int []a[][];


above declaration are valid.


ARRAY CREATION
--------------
Every array in Java is an Object only hence we can create array by using new operator.
int[] a=new int[3]; 

For every array type corresponding classess are available.(For objects is created for only classes)
And these classes are part of java language and not available for programmer level

Example:
class Test
{
	public static void main(String [] args)
	{
		int[] x=new int[3];	//  [I
		int[] x=new int[3];	//  [[I	
		System.out.print(x.getClass().getName()
	}
}


Array type with correspong class type
int[]		->[I
int[][]		->[[I
double[]	->[D
short[]		->[S
byte		->[B
boolean		->[Z


Consider the following examples;
Example 01:
int[] x=new int[];	Invalid At time of array creation cumpolsory we should specify size of array.
int[] x=new int[6];	Valid 

Example 02:
int[] x=new int[0];	Valid.It Legal to have array of 0 size
class Test
{
	public static void main(String [] args)
	{
		System.out.print(args.length)
	}
}

Example 03:
int[] x=new int[-2];	Invalid.If we try specify array size of int negative value Then we will get RunTime Exception:NegativeArraySizeException

Example 04:
int[] x=new int[x];	Valid
int[]=new int['a']	Valid

byte b=20;
int[] x=new int[b];	Valid

short s=30;
int[] x=new int[s];	Valid

long l=40;
int[] x=new int[l]	Invalid


To specify Array size allowed Data types are byte,char,short, int if we are trying to specify other type then will get CE



ARRAY -PART 2
-------------
Two Dimension Array Creation
In Java Two dimension array not implemented by using matrix style. Sun people followed Array of Arrays approach for Multi-dimension array creation.
The main advantage of this apparoch is memory utilization will be improved.

Specify which is valid and which is invalid

int[] a=new int[];			Invalid: Atleast base size we have to specify
int[] a=new int[3];			Valid
int[][] a=new int[][];			Invalid:Atleast base size we have to specify
int[][] a=new int[3][];			Valid
int[][] a=new int[][4];			Invalid:Without Specify base size you cannot specify next level
int[][] a=new int[3][4];		Valid
int[][][] a=new int[3][4][5];		Valid
int[][][] a=new int[3][4][];		Valid
int[][][] a=new int[3][][5];		Invalid
int[][][] a=new int[][4][5];		Invalid


ARRAY INITILIZATION
---------------------
Once we create an array every element is initialized with default values. If we are not satisfied with default values then we can override 
these values with our customezed values.

Example:
int[] x=new int[3];
x[0]=1;
x[1]=20;
x[3]=30;
x[4]=50; RE(ArrayIndexOutOfBoundException)
x[-4]=50; RE(ArrayIndexOutOfBoundException)
x[2.5]=50; CE(ArrayIndexOutOfBoundException)

Example:
class Test
{
	public static void main(String [] args)
	{
		int[] x=new [3];
		System.out.print(x)	//hashcode
		System.out.print(x[0])	//0

	}
}

Whenever we are trying to print any reference variable internally toString method will be called which is implemented 
by default to return the string in following form classname@hashcode_in_hexadecimal_form

Example:
class Test
{
	public static void main(String [] args)
	{
		int[][] x=new [3][2];
		System.out.print(x)	//hashcode
		System.out.print(x[0])	//hashcode
		System.out.print(x[0][0])//0

	}
}

class Test
{
	public static void main(String [] args)
	{
		int[][] x=new [3][];
		System.out.print(x)	//hashcode
		System.out.print(x[0])	//null
		System.out.print(x[0][0])//RE (RunTime Exception)--you cant ask anything Null

	}
}








