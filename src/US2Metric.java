
public class US2Metric {

	public static void main(String[] args) {
	System.out.println("inches       centimeters        pounds        kilograms");
	System.out.println("------       -----------        ------        ---------");
	for(int i = 1; i < 51; i++) {
		System.out.printf("%d            %.2f            %d            %.2f \n" , i,  (i*2.54), i, (i/2.205));
	}		
}	
}
	


