//problem

/*You are given three integer inputs that represent the angles of a triangle.
 You need to complete a method named isValidTriangle(int angle1, int angle2, int angle3), inside a class named TriangleValidator.
 This method should return a boolean value – true if the given angles form a valid triangle, and false if they do not.

       The conditions for a valid triangle are:
         1.Each of the angles must be a positive integer.
         2.The sum of all the three angles must be exactly 180.*/
package com.basics;

public class TriangleValidator {
	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if (angle1 > 0 && angle2 > 0 && angle3 > 0 && angle3 + angle2 + angle1 == 180) {
			return true;
		}
		return false;
	}
}