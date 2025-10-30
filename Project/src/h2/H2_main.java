package h2;

public class H2_main {
	public static void main (String []args) {

	int i = 15;
	int j = 2;
	int k = 3;
	int min = 1;
	int max = 1;

	if (i > j && i > k) {
		
	
		max = i;
		
	} else if (j > k) {
		max = j;
	} else {
		max = k;
	}
	if (i < j && i < k) {
		min = i;
	} else if (j < k) {
			min = j;
	}else {
				min = k;
			}
	System.out.println(" Maximun: " + max + " Minimum: " + min);
		}
	}
	
	
	
	

