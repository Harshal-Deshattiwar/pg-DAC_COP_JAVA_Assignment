// add apakage
import java.util.Scanner;
public class Que12 {

	public static void main(String[] args) {
//		12. Write a java program to read temperature in centigrade and display a suitable message according to temperature state below :
//			Temp < 0 then Freezing weather
//			Temp 0-10 then Very Cold weather
//			Temp 10-20 then Cold weather
//			Temp 20-30 then Normal in Temp
//			Temp 30-40 then Its Hot
//			Temp >=40 then Its Very Hot
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Temperature in centigrade : ");
		Double temp = sc.nextDouble();
		
		if (temp < 0) System.out.println("Freezing weather");
		else if (temp > 0 && temp < 10) System.out.println("Very Cold weather");
		else if (temp >= 10 && temp < 20) System.out.println("Cold weather");
		else if (temp >= 20 && temp < 30) System.out.println("Normal in Temp");
		else if (temp >= 30 && temp < 40) System.out.println("Its Hot");
		else if (temp >= 40) System.out.println("Its Very Hot");
		else System.out.println("Incoreect input (must be 40 or below  ");
		
		
	}
	
}
