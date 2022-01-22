package OOP.Abstraction.Interfaces;
/*
Jan_22_2022
===Abstraction===
    abstract class:
    "abstract" keyword
    you can have abstract and non-abstact methods in a abstract class
 !>  public abstract int name(); this is an abstract method,
        abstract method can not have method body
 !>  you cannot create Object from abstract class

        concrete class: it is a child class of abstract class which is,
          regular class with all implementations of abstract methods from parent
!>   if you extend abstract class to non-abstract class you must implement
      all abstract methods
!> you can extend abstract class by another abstract class
!> you can extend regular class by an abstract class
!>- abstract methods can not be private, final, static
    =====Interface=======:
interface
'implements'
-all variables and methods will be public
=================================
>>in a regular class
access modifiers:
  public
  private
  protected
  --default--
  >>in interface
access modifiers:
  everything is public by default
 > default <
================inheritance=====================
overriding
=======abstract class=====
=======interface ========
    void a();
    void b();
===================
TASK:
interface -->  shape
have some intance fields
have area and perimeter methods
----
triangle: implement shape in the triangle class */
