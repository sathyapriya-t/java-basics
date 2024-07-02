//problem
/*You have been given a class TriangleValidator with an incomplete method isRightAngled(int side1, int side2, int side3).
 This method should take three integer values that represent the lengths of the sides of a triangle.
  Your task is to complete the method so it can accurately determine if the triangle with the given sides is a right-angled triangle.
  The method should return true if the triangle is right-angled and false otherwise.

        In a right-angled triangle, the square of the length of the hypotenuse (the side opposite the right angle) is equal to the sum of the squares of the lengths of the other two sides. This is known as the Pythagorean theorem.
        If any side has a non-positive length, it's not considered a valid triangle.

      Instructions:
        Start with the TriangleValidator class. Inside this class, you'll find the method isRightAngled(int side1, int side2, int side3).
        Your first task is to validate the lengths of the sides. If any side length is less than or equal to zero, return false.
        Next, apply the Pythagorean theorem to determine if the triangle is right-angled. Remember to check all combinations of sides.
        If the theorem holds true for any combination of sides, return true. This indicates that the triangle is right-angled.
        If the theorem doesn't hold true for any combination of sides, return false. This indicates that the triangle is not right-angled.*/
package com.basics;

public class RightAngledTriangleValidator {
	public boolean isRightAngled(int side1, int side2, int side3) {

		if (side3 <= 0 || side2 <= 0 || side1 <= 0) {
			return false;
		}
		boolean isRightAngle = side1 + side2 == side3 * side3 || side2 + side3 == side1 * side1
				|| side3 + side1 == side2 * side2;
		return isRightAngle;
	}
}