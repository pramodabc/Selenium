import java.io.Serializable;

public class ArrayExmp 
{

	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("using new keyword");
		String s="ab";
		String s1= new String("ab");
		
		System.out.println(s.equals(s1));
		
		System.out.println(s==s1);
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
		
		System.out.println("using Literal");
		
		String s11="ab";
		String s12= "ab";
		
		System.out.println(s11.equals(s12));
		
		System.out.println(s11==s12);
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
		System.out.println("******************************");
		
		
		String s21="pqr";
		String s22= "pqr";
		
		
		System.out.println(s21.equals(s22));
		
		System.out.println(s21==s22);
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
		
		
		
		

	}

}
