package com.exception;

public class Test {

	public static void main(String[] args) {

		String s = "java";

		String s1 = null;
		
		int[] array = {67,1,2,5};
		try {
			System.out.println(array[4]);
			System.out.println(s1.length());
			char ch = s.charAt(4);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
