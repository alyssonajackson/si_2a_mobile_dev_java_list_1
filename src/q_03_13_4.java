
public class q_03_13_4 {

	public static void main(String[] args) {
		
		int fat;
		
		for(int i = 1; i <= 10; i++){
			
			fat = i;
			
			for(int j = i - 1; j > 0; j--){
				fat *= j;
			}
			
			System.out.println(Integer.valueOf(fat));
		}

	}

}
