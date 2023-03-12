public class Punctuation
{
public static void main(String args[])
{
int counter=0;
String s="Successful people are not gifted; they just work-hard, then succeed on purpose." ;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='"'||s.charAt(i)==';'||s.charAt(i)=='-'||s.charAt(i)==','||s.charAt(i)=='.')
{
counter=counter+1;
}
}
System.out.println("Total num of punctuation:"+counter);
}
}
