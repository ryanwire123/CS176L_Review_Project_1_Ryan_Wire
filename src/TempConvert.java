
public class TempConvert {

	public static void main(String[] args) {
		System.out.println("Farenheit          Celcius");
		System.out.println("---------          -------");
		for(int tempF = 0; tempF < 213; tempF++) {
			if(tempF % 2 ==0 ) {
			System.out.printf("  %d               %.2f \n", tempF, ((tempF - 32)/1.8) );
			}
		}
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Celcius          Farenheit");
		System.out.println("-------          ---------");
		for(int tempC = 0; tempC < 213; tempC++) {
			if(tempC % 2 ==0 ) {
			System.out.printf("  %d               %.2f \n", tempC, (tempC * 1.8 + 32 ));
			}
		}
			
		
		
	}

}
