package java_oopIntro_1;



public class Main {

	public static void main(String[] args) {
		/* Ozellik nesneleri olarak Araba ve Musteri kullandým
		 * Constructor
		 * Array
		 * Method
		 * kullanarak bir calisma yaptim. 
		*/
		Car car1=new Car();
		car1.setCarId(1);
		car1.setCarName("Audi a5");
		car1.setCarColor("White");
		car1.setUnitPrice(49500);
		
		Car car2=new Car();
		car2.setCarId(2);
		car2.setCarName("Mercedes-Benz s650");
		car2.setCarColor("Black");
		car2.setUnitPrice(85000);
		
		Car car3=new Car();
		car3.setCarId(3);
		car3.setCarName("BMW 740");
		car3.setCarColor("Gray");
		car3.setUnitPrice(62500);
		
		
		
		Customer customer1 = new Customer(1,"Ali Koç","alikoc@hotmail.com");

		Customer customer2 =new Customer(2,"Metin Sipahioglu","m.sipahi@gmail.com");
	
		Customer customer3=new Customer(3,"Aziz Yildirim","yildirim.aziz@hotmail.com");
	
		Customer[] customers= {customer1,customer2,customer3};
		for (Customer customer : customers) {
			System.out.println("Müþteri Adý:"+customer.customerName +"----->"+"Ýletiþim: "+customer.customerEmail);
		}
		System.out.println(" ");
		System.out.println("Müþteri Adý:"+" "+ customer1.customerName + ">>-->>-->>"+ "Müþteri Aracý:"+car1.getCarName());
		System.out.println("Müþteri Adý:"+" "+ customer2.customerName + ">>-->>-->>"+ "Müþteri Aracý:"+car2.getCarName());
		System.out.println("Müþteri Adý:"+" "+ customer3.customerName + ">>-->>-->>"+ "Müþteri Aracý:"+car3.getCarName());

		
		
	}

}
