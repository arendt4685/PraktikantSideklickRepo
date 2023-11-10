public class Numbers_float {
public static void main(String[] args) {
	final float value = 999.99F;
	float result;
	
	for (int i = 1; i < 10; i++) {
		//result = (value / 100.0F) *(i*10.0F);
		result = (value / 10.0F) *i;
		 System.out.println(i*10+" Prozent von " + value + " sind "+result);
        }
    }	
}
