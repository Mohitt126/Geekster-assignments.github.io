
public class largestnumber { 
		public static void main(String[] args) {
			//largest number
			int[] num = {9,25,74,68,88,92};
			int max = num[0];
			for(int i=0;i<num.length;i++) {
				if(num[i]>max) {
					max = num[i];
				}
			}System.out.println(max);
		}

	}



