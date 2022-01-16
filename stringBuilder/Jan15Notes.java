package stringBuilder;

public class Jan15Notes {
    /*
    Jan_15_2022
map
hashtable: synchronized, no null key or values
blocks:
  {} --> instance blocks --> initialize instance varibales
                              it runs for every object
  static{} static blocks --> initialize static varibales
                              runs before everthing in the class
access modifiers:
  public: every where in the same project
  private: in the same class, you need to use setter to set values,
                              use getters to see/get the values
  protected: same package and sub-class
            sub-class means child class, you use extends keywprd to make the connection
              btwn parent and child
  default: same package, sub classes in the same package
=========================================
immutable class:
  when you have all of variables as private and if there is only getters in a class,
   no setters, that type of classes are called immutable classes.
  -if you want to create a constructor, it should be no argument constructor.
=========================================
String str = "Text";
String str1 =  new String();
  str = "Text is simple";
  str.concat("is One");
  sout(str); --> Text is simple
String is immutable:
=========================================
StringBuilder: is mutable
=========================================
Task : create a method that will take StringBuilder as a parameter
        and this method will delete "dashes"(-) from it
        and return/show the word without dashes
          I-n-te-rv-i-ew --> Interview

     */
}