//Compute this Project
//17/03/2018
public class ComputeThis
{
	public static void main(String args[])
	{
	double ang1 = Math.toRadians(187);
	double ang2 = Math.toRadians(122);

	double d1 = 3 * Math.PI * Math.sin(ang1) + Math.abs(Math.cos(ang2)); 
	double d2 = Math.pow(14.72, 3.801) + Math.log(72); 

	System.out.println("d1 = " + d1);
	System.out.println("d2 = " + d2);

	}
}

