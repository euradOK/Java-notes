Qn1. Explain JBDBC architure.

JDBC ARRCHITECTURE:
-------------------
-JDBC API provides DriverManager to Java application.
-Java Application can communicate with any database with help of DriverManager and database
specific driver software.

DriverManager:
--------------
-It is a main component in JDBC architecture.
-It is a class present in java.sql package.
-It is respondible to manage all database drivers.
-It is responsible to register and unregister database drivers.
	DriverManager.registerDriver(driver);
	DriverManager.unregisterDriver(driver);
-It is responsible to establish conection to database with the help of driver software.
	Connection con=DriverManager.getConnection(Jdbcurl,username,password);

Database Driver:
----------------
-It is very important component of Jdbc Architecture.
-Without Driver Software, we cant touch database.
-It act as bridge between java applicatin and database.
-It is responsible to convert java calls into database specific calls and database specific
calls to java calls.

Qn2.Explain about how Java is Platform Independent and Database Independent.
Java is Platform independent: JVM is a reason for this nature.
JAva is Database independent:Driver  Software is a reason for this.

Qn3.What is Driver and how many drivers are available in JDBC.
-While communicating with db we have to convert Java calls to db specific calls and database
specific calls to Java calls for this Driver Software is required.

-In Market Thousands drivers are available but based on Functionality and architecture all
drivers are divided into 4 types:
	1.Type-1 Driver(JDBC-ODBC Bridge Driver or Bridge Driver)
	2.Type-2 Driver(Native API-Partly Java Driver or Native Driver)
	3.Type-3 Driver(All Java Net Protocol Driver or Network Protocol Driver or Middleware Driver)
	4.Type-4 Driver(all Java Native Protocol Driver or Pure Java Driver or Thin Driver)

Note:Progress Data Direct Software Company introduced Type-5 driver but its not yet industry
Standard.

Qn4.Which JDBC driver should be used.
-If we using only one type of database in our application then it is recommended to use Type-1 
Driver. 
Example:Standalone application and small scale applications.

-If we are using multiple types of db in our application then Type-3 Driver is recommended to use.
example:Large scale web application,enterprise application.

-If Type-3 and Type-4 Drivers are not available then only we should go for Type-2 Driver.
-If no other Driver available then we should go for Type-1 Driver.

Qn5:What are various Standard for develop JDBC application.
------------------------------------------------------------
	1.Load and Register Driver class.
	2.Establish connection between Java application and Database.
	3.Create Statement Object.
	4.Send and Excure SQL query.
	5.Process Result from ResultSet.
	6.Close Connection.

Load and Register Driver class:
-------------------------------
-From Java application if we want  to communicate with database, some special software is required
which is nothing but Driver Software. We have to make Driver Software available for to our 
program.

-Every Driver Software is available in form of Jar file and hence we have to place this Jar file
in classPath.

Note: 
Type-1 Driver is available as a part of JDK and hence we are not required to set any classpath
explicitly.

-Every Driver Software is identified by special class which is Driver class.
for Type-1, Driver class name is: sun.jdbc.odbc.JdbcOdbcDriver

-We have to Load this Driver class.
-Any Java class we can Load by Using class.ForName() method Hence we can load Driver class also 
by using this method.
	class.ForName("sun.jdbc.odbc.JdbcOdbcDriver");

Qn06.Explain types of statements available in JDBC.
---------------------------------------------------
Statement vs PreparedStatement vs CallableStatement 

1.We can use normal statement to excute multiple queries:
	st.excuteQuery(query1)
	st.excuteQuery(query2)
	st.excuteUpdate(query3)

i,e If we want to work with multiple queries them we should go for Statement object.

2.If we want to work with only one query, but should be excuted multiple times then we 
should go for PreparedStatement.

3.If we want to work with stored procedure and finctions then we should go for CallableStatement.

Qn7.Difference between Statement and PreparedStatement.
-------------------------------------------------------
Statement:
1.At the time of creating statement object, we are not required to provide any query.
	Statement st=con.createStatement();
Hence Statement object is not associated with any query and we can use for multiple queries.

2.Whenever we are using excute method every time query will be compiled and excuted.
3.Statement object can work only for static queries.
	Static query:Query without position parameter.
	Dynamic query:Query with position parameter(?)
4.Relatively performance is low.
5.Best choice if we want to work with multiple queries.
6.There may be a chance of SQL injection Attack.
7.Inserting Date Values and Large object(CLOB & BLOB) is difficult.

PreparedStatement:
------------------
1.At the time of creating preparedstatement object, we have to provide SQL query compulsory,
which will be send to database and will be compiled.
	PS pst=con.preparedStatement(query);
Hence PS always associated with only one query.

2.Whenever we are using excute method, query wont be compiled just will be excuted.
3.PrepareStatement object can work  for both static and dynamic queries.
4.Relatively performance is high.
5.Best choice if we want to work one query but required to excute multiple times.
6.There is no chance of SQL injection Attack.
7.Inserting Date Values and Large object(CLOB & BLOB) is easy

Qn09:How many excute method are available:
------------------------------------------
1.excuteQuery();
	ResultSet st=con.excuteQuery("select * from employee);
2.excuteUpdate();
	int boolean=st.excuteUpdate("insert|delete|update);
3.excute();
	boolen b=st.excute("select|non-select);
	if (b==true) //select query
	{
		RS rs=st.getResutSet();
	}
	else	//non-select query
	{
		int updateCount=st.getUpadateCount();
	}
4.excuteBatch();
	Statement st=con.createStatement();
	st.add(query1);
	st.add(query1);
	st.add(query2);
	st.add(queryn);

	st.excuteBatch();

Qn10.Explain BLOB and CLOB in JDBC:
-----------------------------------
Sometimes as a part of programming requirement, we have to insert and retrieve large files
like images,video files,resume etc to the database.

eg.
Upload image to matrinomial web sites.
Upload resume in job related web sites.

To store and retrieve large information we should go for Large Objects(LOBs).
There are two types of Large Objects.
	1.Binary Large Object(BLOB)
	2.Character Large Object(CLOB)

Binary Large Object(BLOB):
--------------------------
A BLOB is acollection of binary data stored as single entity in a database.
BLOB type Objects can be images,video files,audio files etc.
BLOB datatype can store a maxmum of 4GB of binary data.

Character Large Object(CLOB):
----------------------------
A CLOB is acollection of character data stored as single entity in a database.
CLOB can be used to store large text documents(plain text or xml documents)
CLOB type can store a maxmum of 4GB of data.




