class Person
{
protected String fname="john";
protected String Iname="Doe";
protected int age=24;
}
class Student extends Person
{
private int graduationYear=2018;
public static void main(String args[])
{
Student s=new Student();
System.out.println("Name:"+ s.fname+ " "+s.Iname);
System.out.println("Age:"+s.age);
System.out.println("Graduation Year:"+ s.graduationYear);
}
}
