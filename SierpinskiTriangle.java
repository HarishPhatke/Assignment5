//Generate the Sierpinski's Triangle fractal.

package com.demo.assignment5;

public class SierpinskiTriangle {

	static char[][] display = new char[50][50];

	public static void main(String[] args) {

		boolean flag = true;
		SierpinskiTriangle sobj = new SierpinskiTriangle();
		sobj.triangle(5, 15, 5, flag);

		flag = false;
		sobj.triangle(25, 15, 5, flag);
		sobj.triangle(15, 15, 5, flag);

		for (int i = 0; i < 50; i++) {

			System.out.println("");

			for (int j = 0; j < 50; j++) {

				System.out.print(display[i][j]);

			}

		}

	}

	public void triangle(int x, int y, int h, boolean flag) {
		if ((x == 40) && (y == 20) && (h == 5)) {
			return;
		}

		for (int row = y; row <= h - 1 + y; row++) {

			for (int column = x; column <= 2 * (row + 1 - y) + x - 2; column++) {

				display[row][column - (row + 1 - y) + 1] = '*';

			}

		}

		for (int i = 0; i < 50; i++) {

			for (int j = 0; j < 50; j++) {

				if (display[i][j] == '\0')

					display[i][j] = ' ';

			}

		}
		if (flag == false) {
			return;
		}
		if (x <= 15) {
			triangle(x + 5, y - 5, 5, true);

		}

		else {
			triangle(x + 5, y + 5, 5, true);
		}

	}
}
