//String builder class using  delete method
class StringBuilderExample1
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello");
sb.delete(1,3);//now original string is changed
System.out.println(sb);//prints Hlo
}
}

