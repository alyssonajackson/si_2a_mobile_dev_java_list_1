
public class q_3_13_5 {

	public static void main(String[] args) {
		
		long fat;
		
		for(int i = 1; i <= 40; i++){
			
			fat = i;
			
			for(int j = i - 1; j > 0; j--){
				fat *= j;
			}
			
			System.out.println(Long.valueOf(fat));
		}
		
	}

}
