package spiral_patterns;

/*	1	2	3	4	5	6
	20	21	22	23	24	7
	19	32	33	34	25	8
	18	31	36	35	26	9
	17	30	29	28	27	10
	16	15	14	13	12	11
	
	O/P: 1 2 3 4 5 6 7 8 9 10 11 12 ....... 36
*/
//This logic supports any dimensional array like single row, single column, square and rectangular Matrixes

public class MxNmattrix {

	public static void main(String[] args) {

		int[][] twoDimenMatrix = { { 1, 2, 3, 4, 5, 6 }, { 20, 21, 22, 23, 24, 7 }, { 19, 32, 33, 34, 25, 8 },
				{ 18, 31, 36, 35, 26, 9 }, { 17, 30, 29, 28, 27, 10 }, { 16, 15, 14, 13, 12, 11 } };

//		int[][] twoDimenMatrix = { { 1, 2, 3, 4, 5, 6 }, { 14, 15, 16, 17, 18, 7 }, { 13, 12, 11, 10, 9, 8 } };

//		int[][] twoDimenMatrix = { { 1, 2, 3, 4, 5, 6 }};

//		int[][] twoDimenMatrix = { { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 } };

//		int[][] twoDimenMatrix = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };

		int left = 0;
		int right = twoDimenMatrix[0].length - 1;
		int top = 0;
		int bottom = twoDimenMatrix.length - 1;

		int counter = 0;

		while (left <= right && top <= bottom) {

			System.out.println("inner loop time: " + ++counter);

			// left -> right (Top row)
			for (int i = left; i <= right; i++) {
				System.out.print(twoDimenMatrix[left][i] + " ");
			}

			// right -> bottom (right side 1st column)
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.print(twoDimenMatrix[i][right] + " ");
			}

			// right -> left (bottom side 1st row)
			if (top <= bottom) {
				right--;
				for (int i = right; i >= left; i--) {
					System.out.print(twoDimenMatrix[bottom][i] + " ");
				}
			}

			// bottom -> top (right side 1st column)
			if (right >= left) {
				bottom--;
				for (int i = bottom; i >= top; i--) {
					System.out.print(twoDimenMatrix[i][left] + " ");
				}
			}

			// moving one step towards inner spiral
			left++;

			System.out.println();
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
