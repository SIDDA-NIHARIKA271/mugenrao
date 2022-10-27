package first;

public class TestMethodDeclaration {
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
           TestMethodDeclaration t=new TestMethodDeclaration();
           System.out.println(t.sum(75,25));
           System.out.println(t.sub(75,25));
           System.out.println(t.mul(8,8));
           System.out.println(t.div(64,8));
	}

}
