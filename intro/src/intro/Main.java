package intro;


public class Main {

	public static void main(String[] args) {
		
		// don't repeat yourself
		String enterText = "internet �ubeye gir.";
		double yesterdayDollar = 8.15;
		double todayDollar = 8.18; 
		int expiry = 36;
		boolean status = true;
		
		System.out.println(enterText);
		
		if (todayDollar < yesterdayDollar) {
			System.out.println("Dolar d��t�."); 
		}else if (todayDollar > yesterdayDollar) {
			System.out.println("Dolar y�kseldi.");
		}else {
			System.out.println("Dolar ayn�.."); 
		}
		
		String[] credits = {
				"H�zl� kredi", 
				"Mutlu emekli kredisi", 
				"Konut kredisi", 
				"�ift�i kredisi", 
				"Msb kredisi",
				"Meb kredisi"
				};

		for (String item : credits) {
			System.out.println(item);
		}
		
		
		int number1 = 10; 
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		System.out.println(number1);
		
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {10,20,30,40,50};
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
		
		String city1 = "Ankara";
		String city2 = "istanbul";
		city1 = city2;
		city2 = "izmir";
		System.out.println(city1);
		
	} 

}