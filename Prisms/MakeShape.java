
public class MakeShape {
	public static void main(String[] args) {
		ThreeDShape s1 = new RectangularPrism(5, 6, 10);     // V = 300, SA = 280
		ThreeDShape s2 = new RectangularPrism(5, 3, 10);     // V = 150, SA = 190

		ThreeDShape s3 = new TriangularPrism(6, 8, 10, 20);  // V = 480, SA = 528
		ThreeDShape s4 = new TriangularPrism(8, 8, 8*Math.sqrt(2), 10);  // V = 320, SA = 337.1
		
		ThreeDShape s5 = new Cylinder(5, 10);                // V = 785.4, SA = 471.2
		ThreeDShape s6 = new Cylinder(10, 20);               // V = 6283.2,  SA = 1885.0
		
		ThreeDShape s7 = new Sphere(5);             
		ThreeDShape s8 = new Sphere(10);               
		
		ThreeDShape[] threeDShapes = {s1, s2, s3, s4, s5, s6, s7, s8};
		
		for (int i=0; i<threeDShapes.length; i++)
		{
			System.out.println("The volume of s" + (i+1) +": " + threeDShapes[i].calcVolume());
			System.out.println("The surface area of s" + (i+1) +": " + threeDShapes[i].calcSA());
			System.out.println();
		}
	}

}
