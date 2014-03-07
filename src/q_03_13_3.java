
public class q_03_13_3 {

	public static void main(String[] args) {
		
		int multiplo;
		
		for(int i = 1; i <= 100; i++){
			multiplo = i % 3;
			
			if(multiplo == 0)
				System.out.println(Integer.valueOf(i));
		}
		
	}

}
