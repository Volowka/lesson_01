package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		byte b = 1;
		short sh = 2;
		int in = 7;
		long l = 53;

		float f = 1.2f;
		double d = 1.55d;

		char ch = 'Z';

		boolean bo = true;

		System.out.print("Minimum value for byte is " + Byte.MIN_VALUE);
		System.out.println(" and maximum  is " + Byte.MAX_VALUE);

		System.out.print("Minimum value for short is " + Short.MIN_VALUE);
		System.out.println(" and maximum  is " + Short.MAX_VALUE);

		System.out.print("Minimum value for int is " + Integer.MIN_VALUE);
		System.out.println(" and maximum  is " + Integer.MAX_VALUE);

		System.out.print("Minimum value for long is " + Long.MIN_VALUE);
		System.out.println(" and maximum  is " + Long.MAX_VALUE);

		System.out.print("Minimum value for float is " + Float.MIN_VALUE);
		System.out.println(" and maximum  is " + Float.MAX_VALUE);

		System.out.print("Minimum value for double is " + Double.MIN_VALUE);
		System.out.println(" and maximum  is " + Double.MAX_VALUE);

		int[] array1 = { 2, 15, 1, 32, 78, 44, 12, 54, 67, 8 };
		int k = array1.length;

		int maxarray1 = array1[0];
		int minarray1 = array1[0];

		for (int i = 0; i < k; i++) {

			System.out.print(" " + array1[i]);
			if (maxarray1 < array1[i]) {
				maxarray1 = array1[i];
			}

			if (minarray1 > array1[i]) {
				minarray1 = array1[i];
			}
		}
		System.out.println(" ");
		System.out.println("maxarray1 = " + maxarray1);
		System.out.println("minarray1 = " + minarray1);
	}
}
