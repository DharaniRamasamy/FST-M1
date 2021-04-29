package activities;


public class Activity12 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(4, 5));
		addable ad2=(a,b)->{
			return (a+b);
			
		};
		System.out.println(ad2.add(55,100));

	}

}
