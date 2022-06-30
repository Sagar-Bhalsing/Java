## Class 
- A class is a user defined blueprint or prototype from which objects are created
- It's a collection of objects

## Conctructor
- It is a special method that is used to initialize objects
- It cannot declare with return type
- When we create object the body of constructor invoked because there is always a default constructor in your code
- Types
   <br>-- Default
   <br>-- Parameterized 
   <br>-- Copy
      <br>-- By Constructor
      <br>-- By assigning the value of one object into another
      <br>-- By using clone() method

## Constructor Overloading
- constructors having same name but different in parameters

## Object
- Run time entity which has 
   <br>-- identity(name of dog)
   <br>-- state/attributes(breed,age,color) 
   <br>-- behaviors(bark,sleep,eat)
- Instance of a class
- Initialised 
   <br>-- Using Reference 
   <br>-- Using Method
   <br>-- Using Constructor

## Method Overloading
- methods having same name but different in parameters

## Static Keyword
- It is used to invoke the body of class without creating object
- static w are using for memory management
- Characteristics
   <br>-- static keyword actually belongs to class rather than object of class
   <br>-- we can use static keyword with 
      <br>-- variable
      <br>-- method 
      <br>-- as block
      <br>-- in nested class
- Understanding
   <br>-- without static --> different copies of variables/methods for every object
   <br>-- with static    --> same variable/method for every object)

## this Keyword
- used as a reference variable which refer the current object 
- It can be used with methods as well as constructors
- can be used 
   <br>-- to refer the current class instance variable
   <br>-- to invoke the current class method 
   <br>-- to invoke the current class constructor/reuse of constructor 
      <br>-- constructor chaining
   <br>-- to pass as argument in the method - used to reuse one object in multiple methods purpose in event handling
   <br>-- to pass as argument in constructor
      <br>-- when we have multiple classes and we trying to use one object to that 
