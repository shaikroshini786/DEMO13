//String builder class using replace method
class StringBuilderExample
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello");
sb.replace( 1,3 ,"Java");//now original string is changed
System.out.println(sb);//prints  HJavalo
}
}
/*  H   e   l     l    o
    0    1   2   3   4
    H   J    a   v   a  l  o
*/