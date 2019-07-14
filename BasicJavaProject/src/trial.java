import java.util.*;
public class trial implements aai,bbi
{
	 void disp(List  mylist)
	{
		mylist.add("hello");
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	 public static void main(String args[])
	{
		 trial t=new trial ();
		/*List<Integer>m=new ArrayList<Integer>();
		m.add(20);
		m.add(40);
		trial t=new trial();
		t.disp(m);
		Integer val=m.get(2);
		System.out.println(val);*/
		 System.out.println(t.show());
		 
		 
		
	}
	 
		public  int show()
		{
			
			 try
			 {
				return 1;
			 }
			 catch(Exception e)
			 {}
			 finally 
			 {
				 try
				 {
					return 11;
				 }
				 catch(Exception e)
				 {
					 return 22;
				 }
				 //return 2;
				 //System.out.println("gggg");
			 }
			 
		}

}

