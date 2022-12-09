package yazılımOryantasyonu;
import java.util.Scanner;
public class soru1 {

	public static void main(String[] args) {
		
		// 0-44 zayıf     
		// 45-54 gecer
		// 55-64 orta
		// 65-74 iyi
		// 75-84 cokiyi
		// 85-100 pekiyi
		Scanner scanner=new Scanner(System.in);
		int not ;
	System.out.print("Lütfen almış oldugunuz ders notunu giriniz: ");
	not = scanner.nextInt();
	if (( not <= 44) && (not>0))
		System.out.print("Zayıf");
	else if ((not > 44) && (not<55))
		System.out.print("Gecer");
	else if ((not>54) && (not<65))
		System.out.print("Orta");
	else if ((not>64) && (not<75))
		System.out.print("Iyi");
	else if ((not>74) && (not<85))
		System.out.print("Cokiyi");
	else if ((not>84) && (not<=100))
		System.out.print("Pekiyi");
		
		
		
	}

}
