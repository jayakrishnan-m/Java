import java.util.*;
class peramid1{
	public static void main(String args[]){
		System.out.println("Enter number of rows:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j;
		for(int i=1;i<=n;i++){
			j=1;
			while(j<=i){
			System.out.print('*');
			j++;
			}
			System.out.println();
		}
	}
}