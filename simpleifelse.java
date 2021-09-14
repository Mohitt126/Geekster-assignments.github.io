
public class simpleifelse {
		public static void main(String[] args) {
			//largest number
			int[] num = {5,45,32,68,94,32};
			int max = num[0];
			for(int i=0;i<num.length;i++) {
				if(num[i]>max) {
					max = num[i];
				}
			}System.out.println(max);
		}

	}




