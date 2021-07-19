	INTERFACES
	==========
	1.Introduction
	2.Intefaces declaration and implementation
	3.Extends vs Implements 
	4.Interface methods 
	5.Interface variables 
	6.Interfaces naming conflicts 
		-method naming conflicts 
		-variable naming conflicts 
	7.Marker interface 
	8.Adapter classes
	9.interface vs abstract class vs concrete 
	10.Difference btn interface and abstract class


	1.Introduction
	===============
Definition 01.
--------------
Any service requirement specification(srs) is considered as an interface.

Example 01:
JDBC API acts as requirement specification to develop database drivers.
Database vendor is responsible to implement JDBC API.

Example 02:
Servelet API act as requirement specification to develop web server.
Webserver vendor is responsible to implement servelet API.

Definition 02
-------------
From client point of you an interface defines the setup services what is expecting.
From service provider point of you an interface defines the setup services what is offering
hence any contract btn client and service provider is considered as interface.

Example:
Through Bank ATM GUI screen bank people are highlighting the setup service what they 
offering at the same time the GUI screen repsents the setup services what customer 
is expecting hence this GUI screen act as contract btn customer and bank people.

Definition 03.
----------------
Inside interface every method is always abstract whether we are declaring or not
hence interface is considered as 100% pure abstract class.

Summary Definition
-------------------
Any service requirement specification or any contract btn client and service provider
are 100% pure abstract class is interface.


2.interface Declaration and implementation
=============================================
A class can extends only one class at a time.
an interface can extends any number interfaces simultaneosly. 

A class can implements any number of interface simultaneosly.
A class can extends another class and can implements any number of interface simultaneosly.
example:
class A extends B implements D,E,F


