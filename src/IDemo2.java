
public class IDemo2 {
	public static void main(String[] args) {
		IDemo id=new IDemo()
				{
			@Override
			public int add(int a,int b) {
				return a+b;
			}
			
				};
				System.out.println(id.add(5, 7));
		
	}

}
