import java.util.Scanner;

public class SortStrng {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String names[]=new String[5];
		String temp;
		//System.out.println("Eynyter 5 names");
		
		/*
		for (int i=0;i<5;i++)
		{
			names[i]=sc.next();
		}
		
		for (int i=0;i<5;i++)
		{
			for (int j=1;j<5;j++)
			{
				if(names[j-1].compareTo(names[j])>0)
				{
			   temp=names[j-1];
			   names[j-1]=names[j];
			   names[j]=temp;
				}
			}
		}
				
		for (int i=0;i<5;i++)
		{
			System.out.println(names[i]);
		}
		*/
		
		
//palliyndromeyyyyyyyyyy
		
		System.out.println("enter string to check pallindrome");
		temp=sc.next();
		String temp1="";
		
		int j=temp.length();
		for(int i=1; i<=(temp.length()/2);i++)
		{
			temp1=temp1+temp.charAt(j-i);
						
		}
		System.out.println(temp1);
		System.out.println(temp.substring(0,j/2).toString());
		
		if(temp1.equals(temp.substring(0,j/2)))
		{
			System.out.println("string is pallindrome");
		}
		else 
			System.out.println("not pallindrome");
		
		
		
		/*for(int i=0; i<(temp.length());i++)
		{
			temp1=temp1+temp.charAt(j-i);
						
		}*/
		
		/*if(temp.equalsIgnoreCase(temp1))
		{
			System.out.println("string is pallindrome");
		}
		else 
			System.out.println("not pallindrome");
		*/		
		
		
	}

}
