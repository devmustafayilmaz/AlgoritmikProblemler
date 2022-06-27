
public class Soru1 {

	public static void main(String[] args) {
		int toplam =0;
		// 10'dan 40'a kadar olan sayılardan 3 veya 5'e bölünebilen  sayıların toplamını ekrana yazdırınız.
		for(int sayi=10;sayi<=40;sayi ++) {
			
			
			if( sayi%3==0 || sayi %5==0) {
				
				toplam = toplam + sayi; 
				
			}
		}System.out.println("Toplam : " + toplam);

	}

}
