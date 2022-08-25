
public class MainIII {

	public static void main(String[] args) {
		
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int coge = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product:");
		System.out.printf("%s which price is $%.2f%n",product1 ,price1 );
		System.out.printf("%s which price is $%.2f%n",product2 ,price2 );
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %s ",age ,coge ,gender);
		System.out.println("");
		System.out.println("");
		System.out.printf("Measue which eight decimal places:%.8f%n",measure);
		System.out.printf("Rouded(three decimal places)%.3f%n",measure);
	}	
	

}
