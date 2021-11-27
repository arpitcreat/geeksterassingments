package assingments123;

import java.util.Scanner;

public class perfectsq {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=0;
		for(int i=0;i<a;i++) {
			if((i*i)==a)
				b=1;}
		
	if(b==1)
		System.out.println("a perfect square");
	else
		System.out.println("not a perfect square");

}
}
