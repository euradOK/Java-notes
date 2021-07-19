Arrays:
======
An array is indexed collection of fixed number of homogenous data elements.
The main advantage of array is we can repsent multiple values by using single varibale 
so that readability of code will be improved.

Limitations of Arrays:
======================
01.Arrays are fixed in size i,e once we create an array there is no chance of increasing 
or decreasing size based on requirement due to this to use Arrays concept complusory 
we should know the size in advance which may not possible always.

02.Arrays can hold only homogenous data type elements.
Example:
Student[] s=new Student[1000];
s[0]=new Student();		//valid 
s[1]=new Customer();	//CE:Incompatible types found: Customer Required:Student

We can solve this problem by using Object type Arrays
Example:
Object[] a=new Object[1000];
a[0]=new Student();		//valid
a[1]=new Customer();	//Valid

03.Arrays concepts is not implemented based some standard data structure and hence 
ready made method support is not available.
For every requirement we have to write a code explicitly, which increases the 
complexity of code.

Collections:
===========
To overcome the above problems of arrays we should go for Collections concepts.
Collections are growable in nature i,e based on our requirement we can increase 
or decrease size.

Collections can hold both homogenous and heterogenous objects.

Every Collections class is implemented based on some standard data structure hence 
for every requirement ready made method support is available.

Being a programmer we are responsible to use those methods and we are not responsible
to implement those methods.

Difference Collections vs Arrays:
=================================

01.Arrays is fixed in size i,e once we create an Arrays we can not increase or decrease 
size based on our requirements.
Collections are growable in nature i,e based on our requirement we can increase or 
decrease the size.

02.With respect to memory Arrays are not recommended to use.(Arrays are inbuild feature 
of java while Collections are from API.
With respect to memory Collections are recommeded to use.

03.With respect to performance Arrays are recommended to use.
With respect to performance Collections are not recommended to use.

04.Arrays can hold only homogenous data type elements.
Collections can hold both homogenous and heterogenous elements.

05.There is no underlying datastructure for Arrays and hence ready made method 
support is not available.
For every requirement we have to write a code explicitly which increase complexity 
of programming.

Every Collection class is implemented based on some standard data structure and hence
for every requirement ready made method support is available.Being a programmer we 
can use these method directly and we not responsible to implement those methods.

06.Arrays can hold both primitives and Objects.
Collections can hold only Object types but not primitives.



	Collections:
	============
if we want to repsent a groups of individual object as a single entity then we should 
go for Collection.

Collection framework it contains several classes and interfaces which can be used to 
repsent a group of individual object as single entity.


	9 key interfaces of Collection Framework:
	=========================================
1.Collection 
2.List
3.Set 
4.SortedSet
5.NavigableSet
6.Queue
7.Map 
8.SortedMap
9.NavigableMap
==================================================

1.Collection(I)
---------------
-if we want to represent a group of individual objects as single entity then we should 
go for collection.
-Collection interface defines the most common methods which are applicable for any 
collection object.
-In generally Collection interface is considered as root interface of Collection
Framework.
-There is no concrete class which implements collection interface directly.

Difference between Collection and Collections:
----------------------------------------------
Collection is an interface.
if we want to represent a group of individual object as a single entity then we 
should go for Collection.

-Collections is an utility class present in java.util class to define several utility 
methods for collection objects(Like sorting,seaching etc)


2.List(I)
----------
-It is child interface of Collection(I).
-if we want to represent a group of individual object as a single entity where duplicates 
are allowed and insertion order must be preserved then we should go for List.
-List contain ArrayList,LinkedList,Vector and Stack. 

3.Set(I)
--------
-It is child interface of Collection.
-if we want to represent a group of individual object as a single entity where duplicates
are not allowed and insertion oder not required then we should go for set interface.

4.SortedSet(I)
------------.
-It is child interface of Set(I).
-if we want to represent a group of individual object as a single entity where duplicates
are not allowed and all object should be inserted according to some sorting order
then we should go for SortedSet.

5.NavigableSet(I)
-----------------
-It is child interface of SortedSet(I).
-It contains several methods for navigation purposes.
-The implementation class for NavigableSet(I) is TreeSet.

Collection-->Set(I)-->SortedSet(I)-->NavigableSet(I)--->TreeSet

Differences between List and Set:
---------------------------------
List							Set
----							---
-Duplicates are allowed			Duplicates are not allowed	
-insertion order preserved.		insertion order not preserved.

6.Queue(I)
----------
-Queue(I) is a child interface of Collection(I).
-if we want to represent a group of individual object prior to processing then we 
should go for Queue(I). Usually Queue follows FIFO order but based on requirement 
we can implement our own priority order also.
-Implememtation class of Queue are PriorityQueue,BlockingQueue,LinkedBlockingQueue....

All above interfaces Collections,List,Set,SortedSet,NavigableSet and Queue meant for 
repsenting a group of individual objects.

If we want to repsent a group of object as key value pairs then we should go for Map.

7.Map(I)
--------
Map is not child interface of Collection.
If we want to repsent a group of object as key value pairs then we should go for Map.
Example:

key			value
==================
S.no		name
-----------------
101			eurad
102			emma
103			Ruba
-----------------

Both Key and value are objects only.
Duplicates keys are not allowed but value can be duplicated.

Implementation class of Map are HashMap,LinkedHashMap,WeakHashMap,IdentityHashMap,
Hashtable,Dictionary,Properties.

8.SortedMap(I)
--------------
-It is child interface of Map.
If we want to repsent a group of object as key value pairs according to some sorting 
order of keys then we should go SortedMap.
-In SortedMap the sorting should be based on key but not based on value.

9.NavigableMap(I)
-----------------
--It is child interface of SortedMap.
-It defines several methods for navigation purposes.
-Implementaion class is TreeMap.

Map-->SortedMap-->NavigableMap-->TreeMap.

The following are legacy character present in collaction Framework:
-Enumeration(I)
-Dictionary(AC)
-Vector(C)
-Stack(C)
-Hashtable(C)
-Properties(C)


Collection(I)
-------------
-if we want to represent a group of individual objects as single entity then we should 
go for Collection.
-Collection interface defines the most common methods wich are applicable for any
Collection Object.
-There is no concrete class which implement collection interface directly.

Methods for Collection interface:
-------------------------------------------------------
boolean add(Object o)
boolean addAll(Collection c)
boolean remove(object o)
boolean removeall(Collection c)
boolean retainAll(Colleaction c)
	To remove all object except those present in c.
boolean contains (Object o)
boolean containsAll(Collection c)
boolean isEmpty()
int size();
Object[] toArray();
Iterator iterator();
-------------------------------------------------------

List(I)
--------
-It is child interface of Collection(I).
-if we want to represent a group of individual object as a single entity where duplicates 
are allowed and insertion order must be preserved then we should go for List.

-We can preserve insertion order via index and we can differentiate duplicate object 
by using index hence index we will play very important role in List.

-List interface defines the following specific methods:
void add(int index,Object o)
boolean addAll(int index,Collection o)
Object get(int index)
Object remove(int index)
Object set(int index,Object new)
	To repalce the element present at specifed index with provided Object and return
	old Object.
int indeOf(Object o)
	return index of first occurance of 'o'
int lastIndexOf(Object o)
ListIterator listIterator();

ArrayList
---------
-The underlying datastructure is resizable array or growable array
-Duplicates are allowed
-Insertion order is preserved
-Heterogenous Object are allowed(except TreeSet and TreeMap everywhere heterogenous
object is allowed.
-null insertion is possible.

Constructors:
-------------
1.ArrayList l=new ArrayList();
Creates an empty arraylist with default initial capacity 10.
Once ArrayList reaches its max capacity then a new ArrayList will be created with 
new capacity =(cuurent capacity*3/2)+1 

2.ArrayList l=new ArrayList(int initialization);
Creates an empty ArrayList with specified inial capacity.

3.ArrayList l=new ArrayList(Collection c);
Creates an equivalent ArrayList Object for a given Collection.

Example:
import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);//[A,10,A,null]
		l.remove(2)
		System.out.println(l);//[A,10,null)
		l.add(2,"M")
		l.add("N");
		System.out.println(l);//[A,10,M,N)
	
	}
}

-Usually we can use collections to hold and transfer objects from one location 
to another(container).
-To provide support for this requirement every collection class by default imprements
Seriaizable and clonable interfaces.
-Arraylist and Vector classes imprements RandomAccess interface so that any random 
element we can access with the same speed hence Arraylist is the best for random
access elements.

RandomAccess:
-------------
RandomAccess interface present in java.util package and doesnt contain any method 
it is a marker interface,where required ability will be provided automatically 
by the JVM.

Example:
ArrayList l1=new ArrayList();
LinkedList l2=new LinkedList();
System.out.println(l1 instanceof Serializable );	//true
System.out.println(l2 instanceof Cloneable);		//true
System.out.println(l1 instanceof RandomAccess );	//true
System.out.println(l2 instanceof RandomAccess );	//true

-ArrayList is the best choice if our frequent operation is retrive operation because 
arraylist imprements RandomAccess interface.
-ArrayList is the worst choice if our frequent operation is insertion or deletion in 
the middle.

Differences btn ArrayList and Vector:
--------------------------------------
ArrayList
---------
-Every method present in arraylist is non-syncronized.
-At a time multiple Thread is allowed to operate on ArrayList object and hence it is not 
Thread safe.
-Relatively performance is high beacuse Thread are not required to wait to opearate on 
ArrayList Object.
-Introduced in 1.2 Version and it is non-legacy.

Vector
------
-Every method present in Vector is non-syncronized.
-At a time only Thread is allowed to operate on Vector object and hence it is a Thread safe.
-Relatively performance is low beacuse Thread are  required to wait to opearate
on Vector Object.
-Introduced in 1.0 Version and it is legacy.


How to get syncronized Version of ArrayList Object:
---------------------------------------------------
-By default ArrayList is non-syncronized but we can get syncronized version of ArrayList 
object by using SynchronizedList() method of Collections class.
public static List SynchronizedList(List I);

Similarly we can get synchronized version of Set and Map object by using the following 
method of Collections class.
public static Set synchronizedSet(Set s)
public static Map synchronizedSet(Map m)


LinkedList:
-----------
The underlying datastructure is double linkedList.
-Insertion order is preserved.
-Duplicate objects are allowed.
-Heterogenous objects are allowed.
-Null insertion is possible.
-LinkedList implements Serializable and Cloneable interfaces but not RandomAccess.
-LinkedList is best choice if our frequent operation is insertion or deletion in
the middle.
-LinkedList is the worst choice if our frequent operation is retrieve operation.

Constructors:
-------------
1.LinkedList l=new LinkedList()
-Creates an empty linkedlist object.

2.LinkedList l=new LinkedList(Collection c)
-Creates an equivalent linkedlist object for the given Collection.

LinkedList class spefic method.
-------------------------------
Usually we can use linked list to develop stack and Queue.
To provide support for this requirement LinkedList define the following method.
void addFirst(Object o)
void addLast(Object o)
Object getFirst()
Object getLast()
Object removeFirst()
Object removeLast()

Example:
import java.util.*;
class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("eurad");
		l.add(30);
		l.add(null);
		l.add("eurad");			//[eurad,30,null,eurad]
		l.set(0,"software");	//[software,30,null,eurad]
		l.add(0,"venky");		//[venky,software,30,null,eurad]
		l.removeFirst();		//[software,30,null,eurad]
		l.removeLast();			//[software,30,null]
		l.addFirst(CC);			//[CC,software,30,null]
		System.out.println(l);	//[CC,software,30,null]
	}
}


Differences between LinkedList and ArrayList:
----------------------------------------------
ArrayList:
----------
1.ArrayList is the best choice if our frequent operation is retrieve operation.
2.ArrayList is worst choice if our frequent operation is insertion or deletion in
the middle because internally several shift operation are performed.
3.In ArrayList the element will be stored in consecutive memory location and hence 
retrieve operation will become easy.

LinkedList:
----------
1.LinkedList is best choice if our frequent operation is insertion or deletion in
the middle.
2.LinkedList is the worst choice if our frequent operation is retrieve operation.
3.In LinkedList the element will not be stored in consecutive memory location and hence 
retrieve operation will become complex/difficult.


Vector:
-------
1.The underlying datastructure is resizeable array or growable array.
2.Insertion order is preserved.
3.Duplicates are allowed.
4.Heterogenous object are allowed.
5.Null insertion is possible.
6.It imprements Serializable,Cloneable and RandomAccess interfaces.
7.Every method present in the vector is synchronized and hence Vector Object
is Thread safe.

Constructors:
-------------
1.Vector v=new Vector()
-creates an empty vector object with default initial capacity 10.
-Once vector reaches its max capacity,then a new Vector object will be with new 
capacity=current capacity *2.

2.Vector v=new Vector(int initialCapacity)
-Creates an empty Vector Object with specified initial capacity.

3.Vector v=new Vector(int initialCapacity,int incrementcapacity)

4.Vector v=new Vector(Collection c)
-Creates an equivalent vector object for the given Collection.
-This constructor meant for interconvention between Collection Object.

Vector Specific methods:
------------------------
1.To add Object 
add(Object o)-------C
add(int index,Object o)----L
addElement(Object o)-----V

2.To Remove Object
remove(Object o)----V
remove(int index)----L
removeElementAt(int index)----V
clear()----C
removeAllElements()----V

3.To get Objects
Object get(int index)---L
Object elementAt(int index)----V
Object firstElement()---V
Object lastElement()----V

4.other Methods
int size()
int capacity()
Enumeration elements()

Example:
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		System.out.println(v.capacity());		//10
		for (int i=1; i<=10;i++ )
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());		//10
		v.addElement("A");
		System.out.println(v.capacity());		//20
		System.out.println(v);					//[1,2,3,4,5,6,7,8,9,10,A]
	}
}

Stack:
------
-It is a child class of Vector.
It is specially designed class for Lastin Firstout order(LIFO)

Constructor:
Stack s=new Stack();

Methods:
Object push(Object o)
	To insert an object into Stack.

Object pop()
	To remove and return top of the Stack.

Object peek()
	To return top of Stack without removal

boolean Empty()
	Return true if Stack is empty

int search(Object o)
	Return offset if element is available otherwise returns -1

Example:
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);		//[A,B,C]
		System.out.println(s.search("A"));	//3
		System.out.println(s.search("z"));	//-1
	}
}

Three (3) cursors of Java:
--------------------------
if we want to get object one by one from the Collection then we should go for cursors.
There are 3 types of cursors available in java.
1.Enumeration
2.Iterator
3.ListIterator

Enumeration:
------------
We can use Enumeration to get object one from legacy Collection object.
We can create Enumeration object by using elements() method of vector class.
example:
Enumeration e=v.elements();  //v is vector object.

Methods:
public boolean hasMoreElements()
public Object nextElement()

Example:
import java.util.*;
class EnumerationDemo
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		for (int i=0;i<=10 ;i++ )
		{
			v.addElement(i);
		}
		System.out.println(v);	//[1,2,3,4,5,6,7,8,9,10]
		Enumeration e=v.elements();
		while (e.hasMoreElements)
		{
			Integer I=(Integer)e.nextElement();
			if (I%2==0)
			System.out.println(I);	//[2,4,6,8,10]
			else 
			{
				System.out.println(I+"will be removed");
				v.remove();
				System.out.println(v);
			}
		}
	}
}



