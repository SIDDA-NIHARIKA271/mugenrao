package first;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=789,r;
		int reverse=0;
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
		}
		System.out.println(reverse);
		}

	}


