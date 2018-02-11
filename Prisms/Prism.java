/* Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */


public class Prism  {
	private int height;
	public Prism(int height) {
		this.height = height;
	}
	
	public static int calcAreaOfBase(int length, int width) {
		return length * width;
	}
	public static double calcPerimeter(int length, int width) {
		return (length * 2) + (width * 2);
	}
	public static double calcVolume(int length, int width, int height) {
		return calcAreaOfBase(length, width) * height;
	} 
	public static double calcSA(int length, int width, int height) {
		return calcPerimeter(length,width) *height;
	}
}
	