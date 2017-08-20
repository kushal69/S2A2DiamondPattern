package com;

public class DiamondAlphabetPattern {

	// Pattern generating function
	public void generatePattern(int n){
		char c = 97;
		int i, j, sp;
		
		sp = n / 2;

		for (i = 1; i <= n / 2 + 1; i++) {				//loop to print upper triangle and the middle line
			c = 97;

			for (j = 1; j <= sp; j++) {					//loop to print the required spaces for the line
				System.out.print(" ");
			}

			for (j = sp + 1; j <= (sp + (2 * i - 1)); j++) {	//loop to print the alphabets of the upper triangle
				if (j <= n / 2 + 1) {							//prints alpha in increasing order till middle element
					System.out.print(c);						
					c++;
					if (j == (n / 2 + 1)) {						//subtracts one, incremented in the previous loop when j becomes middle element
						c--;
					}
				} else {										//prints alpha in decreasing order after middle element
					c--;
					System.out.print(c);
				}
			}
			sp--;
			System.out.println();
		}
		sp = 1;

		for (i = n / 2 + 2; i <= n; i++) {						//loop to print lower triangle 
			c = 97;
			for (j = 1; j <= sp; j++) {							//loop to print the required spaces for the line
				System.out.print(" ");
			}

			for (j = sp + 1; j <= ((2 * i - 1) - (3 * sp)); j++) {		//loop to print the alphabets of the lower triangle
				if (j <= n / 2 + 1) {									//prints alpha in increasing order till middle element
					System.out.print(c);
					c++;
					if (j == (n / 2 + 1)) {								//subtracts one, incremented in the previous loop when j becomes middle element
						c--;
					}
				} else {
					c--;
					System.out.print(c);								//prints alpha in decreasing order after middle element
				}
			}
			sp++;
			System.out.println();

		}
	}
	
	// Main Function
	public static void main(String[] args) {
		DiamondAlphabetPattern dap = new DiamondAlphabetPattern();
		
		System.out.println("Pattern 1 ---> ");
		dap.generatePattern(5);
		
		System.out.println("Pattern 2 ---> ");
		dap.generatePattern(7);
	}
}
