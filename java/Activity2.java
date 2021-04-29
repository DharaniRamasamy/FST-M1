package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[]= {10, 77, 10, 54, -11, 10};
		 int srchNum=10;
		 int targetSumValue=30;
		 System.out.println("Result is " + calc(arr1,srchNum,targetSumValue));
	}
		 	 
		 
		 public static boolean calc(int arr1[],int srchNum, int targetSumValue)
		 {
			 int sum=0;
		 
			 for (int i = 0; i<=arr1.length-1;i++)
			 {
				 if (arr1[i]==srchNum)
				 sum=sum+arr1[i];
			 }

		 if (sum==targetSumValue)
			 return true;
		 else
			 return false;
	
}
}
