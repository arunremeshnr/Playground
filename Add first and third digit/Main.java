import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      	int number,last,first,sum;
		Scanner s = new Scanner(System.in);
      	number = s.nextInt();
      	last = number%10;
      	first = number/100;
      	sum = last + first;
      	System.out.println(sum);
	}
}