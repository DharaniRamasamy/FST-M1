package activities;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="This is a string message";
		String str2=null;
try {
		exceptionTest(str1);
		exceptionTest(str2);
}
		catch(CustomException excp)
{
			System.out.println(excp.getMessage());
			
		}

	}

	
	public static void exceptionTest(String msg) throws CustomException
	{
	if (msg==null)
		
		throw new CustomException("Customised msg-Oh no, the string is nulllll");
			
	
	else
		System.out.println("The string is - " + msg);
	
}
}
