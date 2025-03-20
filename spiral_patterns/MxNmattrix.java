package spiral_patterns;

/*	1	2	3	4	5	6
	20	21	22	23	24	7
	19	32	33	34	25	8
	18	31	36	35	26	9
	17	30	29	28	27	10
	16	15	14	13	12	11
*/

public class MxNmattrix {

	public static void main(String[] args) {

		int[][] twoDimenMatrix = { { 1, 2, 3, 4, 5, 6 }, { 20, 21, 22, 23, 24, 7 }, { 19, 32, 33, 34, 25, 8 },
				{ 18, 31, 36, 35, 26, 9 }, { 17, 30, 29, 28, 27, 10 }, { 16, 15, 14, 13, 12, 11 } };

		int top = 0, left = 0, right = 0, bottom = 0;
		right = bottom = twoDimenMatrix.length - 1;
		
		

		// left -> right (Top row)
		for (int i = left; i <= right; i++) {
			System.out.print(twoDimenMatrix[left][i]+" ");
		}
		
		//right -> bottom (right side 1st column)
		top++;
		for(int i = top; i <= right; i++) {
			System.out.print(twoDimenMatrix[i][right]+" ");
		}
		
		System.out.println();
		
		//right -> left (bottom side 1st row)
		right--;
		for(int i = right; i >= left; i--) {
			System.out.print(twoDimenMatrix[bottom][i]+" ");
		}
		
		
		//bottom -> top (right side 1st column)
		bottom--;
		for(int i = bottom; i >= top; i--) {
			System.out.print(twoDimenMatrix[i][left]+" ");
		}
		
		

		/*
		 * for (int i = 0; i < twoDimenMatrix.length; i++) { for (int j = 0; j <
		 * twoDimenMatrix.length; j++) { // System.out.print("("+i+","+j+") ");
		 * System.out.print(twoDimenMatrix[i][j] + " "); } System.out.println(); }
		 * 
		 * System.out.println(twoDimenMatrix.length);
		 */

	}

}
