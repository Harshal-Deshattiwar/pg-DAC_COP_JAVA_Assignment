
import java.util.Arrays;
public class Que12 {
	
	static void sortString(String str){
		
		//create new integer array number of length equal to length of string  
		int number[] = new int[str.length()];

//		as b-a=1 and a-a=0
//		so convert all character into :- number 
		for (int j=0; j<str.length(); j++) {
			number[j] = (int)(str.charAt(j) - 'a');
			
		}
		Arrays.sort(number);//sort number array
		
//		Convert sorted number array back to the respective character
//		it is done by adding number to 'a'
		for(int i= 0; i<number.length;i++) {
			System.out.print((char) (number[i] + 'a'));
		}
	}

	public static void main(String[] args) {

		String str = "gibbrish";
		
		
		Que12.sortString(str);
	}

}
