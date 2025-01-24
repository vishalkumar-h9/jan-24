
public class Primeno3 {

	public static void main(String[] args) {
		//1...100
		for(int i=1,k=0;i<=50;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0)
					counter++;
			}
			if(counter==2) {
				System.out.print(num+"  ggvv ");
				if(++k==0) {
					System.out.println();
				}
			}
		}
	}
}
				
			
		


