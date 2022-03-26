package programers;

public class SelectionSort {

	
	public static void main(String[] args) {
		
		int[] tab = {1,5,11,2,100};
		
		
		for(int i=0;i<tab.length-1;i++) {
			
			for(int j=i+1;j<tab.length;j++) {
				
				if(tab[i]>tab[j]) {
					
					int temp = tab[i];
					
					tab[i] = tab[j];
					
					tab[j] = temp;
					
				}
				
			}
			
		}
	
		for(int i : tab) {
			System.out.print(i+" ");
			
		}
		
	}
	
}
