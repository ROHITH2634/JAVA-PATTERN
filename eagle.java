import java.util.Scanner;
class eagle
{
	public static void main(String [] args)
	{
	 System.out.print("Enter the Size of EAGLE :");
	 Scanner scan=new Scanner(System.in);
	 int n = scan.nextInt();
	 // FIRST ROW
	 for(int i=0;i<=n-1;i++)
	 {
	 	  for(int j=0;j<=4*n;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if((j>=n/2&&i<=n/2&&j-i<=n/2)||(i+j>=n/2&&j<=i))
	 	  		{
	 	  			System.out.print("*");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  System.out.println();
	 }
	 //SECOND ROW
	 for(int i=0;i<=n-1;i++)
	 {
	 	  for(int j=0;j<=4*n;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j>=n-1)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	   for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j>=n-1||j<=i)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	 for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j>=n-1||j<=i)
	 	  		{
	 	  			System.out.print("*");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j<=i||i>=n/2||j>=n/2)
	 	  		{
	 	  			System.out.print("*");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}		
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print("*");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j>=n-1||i>=n/2||j<=n/2)
	 	  		{
	 	  			System.out.print("*");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j<=i||i+j>=n-1)
	 	  		{
	 	  			System.out.print("*");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");

	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j<=i||i+j>=n-1)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");

	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j<=i)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");

	 	  		}
	 	  }
	 	  System.out.println();

	 }
	 //THIRD ROW
	 for(int i=0;i<=n-1;i++)
	 {
	 	  for(int j=0;j<=4*n;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	 for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j<=n-1)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j<=n-1)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j<=n-1)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print("*");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j>=i)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j>=i)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	   for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(j>=i)
	 	  		{
	 	  			System.out.print("^");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }

	 	  System.out.println();

	 }
	 //FOURTH ROW
	 for(int i=0;i<=n-1;i++)
	 {
	 	  for(int j=0;j<=4*n;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i+j>=n-1&&i<=n/2)
	 	  		{
	 	  			System.out.print("=");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		System.out.print(" ");
	 	  }
	 	  for(int j=0;j<=n-1;j++)
	 	  {
	 	  		if(i<=n/2&&j<=i)
	 	  		{
	 	  			System.out.print("=");
	 	  		}
	 	  		else
	 	  		{
	 	  			System.out.print(" ");
	 	  		}
	 	  }
	 	 System.out.println();

	 }
	 
	}
}