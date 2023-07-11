class Amstrong 
{
	public static void main(String[] args) 
	{
		int n=153,pro=1,temp=n,sum=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;  // 3
			pro=pro*rem*rem*rem; // 27
			//System.out.println(pro);
			sum=sum+pro; // 27
			//System.out.println(sum);

			n=n/10;
			pro=1;
		}
        System.out.println(sum);
		if(temp==sum)
		{
			System.out.println( temp + "is amstromg");
		}
		else
		{
			System.out.println( temp + "is not amstromg");
		}
		
		


			
	}
}
