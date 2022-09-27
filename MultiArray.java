package multiArray;
import java.util.*;


public class MultiArray {
		
	Scanner scan = new Scanner(System.in);
	
	private int multiArray[][] = new int[10][10];
	
	
	public void initialArray() {
		for (int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {				
				multiArray[i][j] = 1;			
			}						
		}		
		printArray(multiArray);	
	}
		
	
	
	public void patternRow() {
		for (int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {				
				
				if(i % 2 == 0) {
					multiArray[i][j] = 0;
				}
				else {
					multiArray[i][j] = 1;
				}
			}						
		}		
		printArray(multiArray);	
	}
	
	public void patternCheckered() {
		for (int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {				
				
				if((j + i) % 2 == 0) {
					multiArray[i][j] = 0;
				}
				else {
					multiArray[i][j] = 1;
				}
			}						
		}		
		printArray(multiArray);	
	}
	
	public void userChoice() {
		
		System.out.print("Please enter your choice: ");
		int firstChoice = scan.nextInt();
		
		System.out.print("Please enter your choice: ");
		int secondChoice = scan.nextInt();
		
		System.out.print("Please enter your choice: ");
		int thirdChoice = scan.nextInt();
		
		for (int i = 0; i < multiArray.length; i+=3) {
			for(int j = 0; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = firstChoice;		
			}
			for(int j = 1; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = secondChoice;		
			}
			for(int j = 2; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = thirdChoice;		
			}
		}	
		
		for (int i = 1; i < multiArray.length; i+=3) {
			for(int j = 0; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = secondChoice;		
			}
			for(int j = 1; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = thirdChoice;		
			}
			for(int j = 2; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = firstChoice;		
			}
		}
		
		for (int i = 2; i < multiArray.length; i+=3) {
			for(int j = 0; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = thirdChoice;		
			}
			for(int j = 1; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = firstChoice;		
			}
			for(int j = 2; j < multiArray[i].length; j+=3) {								
				multiArray[i][j] = secondChoice;		
			}
		}
		
		
		printArray(multiArray);	
	}
	
	
	public void sumArray() {
		
		int grandTotal = 0;
		
		for (int i = 0; i < multiArray.length; i++) {
			StringJoiner sj = new StringJoiner(" | ");
			int rowTotal = 0;
			
			
			for(int j = 0; j < multiArray[i].length; j++) {		
				sj.add(String.format("%2d", multiArray[i][j]));			
				rowTotal += multiArray[i][j];
				
			}
			
			grandTotal += rowTotal;
			
			sj.add("Row total: " + String.format("%2d", rowTotal));
			System.out.println(sj.toString());
		
		}
		
		System.out.println("Grand Total: " + grandTotal);
		
	}
	

	public static void main(String[] args) {
			
		
		
		MultiArray array = new MultiArray();	
		
		System.out.println("Initial Array");
		array.initialArray();
		
		System.out.println("Pattern Row");
		
		array.patternRow();
		
		System.out.println("Checkered Row");
		
		array.patternCheckered();
		
		System.out.println("User Choice");
		
		array.userChoice();
		
		System.out.println("Sum Array");
		
		array.sumArray();
		
	}
	
	
	
	private void printArray(int array[][]) {
		
		for (int i = 0; i < multiArray.length; i++) {
			StringJoiner sj = new StringJoiner(" | ");
		
			for(int j = 0; j < multiArray[i].length; j++) {		
				sj.add(String.format("%2d", multiArray[i][j]));
			}
			System.out.println(sj.toString());
		}	
			
		
	}
	
	
	
	
	

}
