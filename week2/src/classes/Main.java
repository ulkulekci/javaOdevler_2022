package classes;

public class Main {
    //Değer ve referans tipleri anlamak
	public static void main(String[] args) {
		//referans type class'lar
		CustomerManager customerManager = new CustomerManager(); //customerManager türünde nesne üretti

		customerManager.Remove();
		customerManager.Add();
		customerManager.Update();
		
		
		//value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2= sayi1;
		sayi1 = 30;
		
		System.out.println("sayi2");
		
		int[] sayilar1 = new int[]{1,2,3};
		int[] sayilar2 = new int[]{4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
	}

}
