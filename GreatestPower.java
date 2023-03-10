public class GreatestPower
{
public static void main(String args[])
{
int ans;
int base1=2;
int power1=5;
int ans1=1;
for(int i=1;i<=power1;i++)
{
ans1=base1*ans1;
}
//System.out.println(ans1);
int base2=5;
int power2=2;
int ans2=1;
for(int i=1;i<=power2;i++)
{
ans2=base2*ans2;
}
//System.out.println(ans2);
ans=(ans1>ans2?ans1:ans2);
System.out.println("Greatest ans= "+ ans);
}
}