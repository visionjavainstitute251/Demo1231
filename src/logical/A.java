package logical;

public class A {
	
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		String s="computer";
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
				//System.out.println(count);
			}
			else
			{
				count1++;
				//System.out.println(count1);
			}
		}
		System.out.println("vovels:-"+count+"consonents"+count1);
	}
	
	

}
