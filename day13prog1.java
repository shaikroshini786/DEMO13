// Counting the no  characters in string using arraylist
import java.util.*;
class CharAtExample7
{
ArrayList<Character>al;
CharAtExample7()
{
al=new ArrayList<Character>();
al.add('0');    
al.add('1');
al.add('2');
al.add('3');
al.add('4');
al.add('5');
al.add('6');
al.add('7');
al.add('8');
al.add('9');
}
private boolean  isDigits(int c)
{
for(int i=0;i<al.size();i++)
{
if(c == al.get(i))
{
return true;
}
}
return false;
}
public int countDigits(String s)
{
int count=0;
int size=s.length();
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isDigits(c))
{
countDigits=countDigits+1;
}
}
return countDigits;
}
public static void main(String args[])
{
CharAtExample7 obj=new CharAtExample7();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfDigits=obj.countDigits(str);
System.out.println("String:"+str);
System.out.println("The total no of Digits in the string are:"+noOfDigits+"\n");
}
}
