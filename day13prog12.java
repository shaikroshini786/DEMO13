//lexicography  value compareto () gives ASCII values
//String == operator compares reference not values
class Teststringcomparision3
{
public static void main(String args[])
{
String s1="Sachin";
String s2="Sachin";
String s3="Rathan";
System.out.println(s1.compareTo(s2));//0
System.out.println(s1.compareTo(s3));//1
System.out.println(s3.compareTo(s1));//-1
}
}


