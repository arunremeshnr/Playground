import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int num,n1,n2,n3,rnum;
    Scanner S = new Scanner(System.in);
    num = S.nextInt();
    n1 = num%10;
    n2 = (num%100)/10;
    n3 = num/100;
    rnum = (n1*100)+(n2*10)+n3;
    System.out.println(rnum);
  }
}