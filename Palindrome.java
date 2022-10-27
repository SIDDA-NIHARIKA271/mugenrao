package first;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=787;int r;
		int reverse=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		System.out.println(reverse);
		if(temp==reverse)
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not");
		}

	}

}
