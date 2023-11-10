public class Numbers_double {
public static void main(String[] args) {
	final double value = 999.99;
	double result;
	
	for (int i = 1; i < 10; i++) {
		//result = (value / 100.0F) *(i*10.0F);
		result = (value / 10.0) *i;
		 System.out.println(i*10+" Prozent von " + value + " sind "+result);
        }
    }	
}
