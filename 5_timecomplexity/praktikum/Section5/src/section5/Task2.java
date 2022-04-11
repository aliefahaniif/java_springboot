/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section5;

/**
 *
 * @author Aliefa Haniif
 */
public class Task2 {
     public static void main(String[] args)
    {
        System.out.println(pow(2, 3));  // 8
        System.out.println(pow(2, 0));  // 8
        System.out.println(pow(5, 3));  // 125
        System.out.println(pow(10, 2)); // 100
        System.out.println(pow(2, 5)); // 32
        System.out.println(pow(7, 3));  // 343
  
    }

	static float pow(float x, int y)
	{
		float temp;
		if( y == 0)
			return 1;
		temp = pow(x, y/2);
		
		if (y%2 == 0)
			return temp*temp;
		else
		{
			if(y > 0)
				return x * temp * temp;
			else
				return (temp * temp) / x;
		}
	}
}


    


