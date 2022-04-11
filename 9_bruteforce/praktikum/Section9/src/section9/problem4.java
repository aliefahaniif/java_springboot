/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section9;

/**
 *
 * @author user
 */
public class problem4 {
    public static void main(String args[])
	{
		problem4 ob = new problem4();
		int input[] = { 1, 1, 3, 5, 5, 6, 7};
		int n = input.length;
		int x = 3;
                
		int result = ob.binarySearch(input, x);
                
		if (result == -1) //bila melebihi index
			System.out.println("Tidak ditemukan");
		else
			System.out.println("X ditemukan pada index ke- " + result);
	}
    
	int binarySearch(int input[], int x)
	{
		int l = 0, r = input.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
                        
			if (input[m] == x) // Cek x di tenga
				return m;
			if (input[m] < x) // x lebih besar (kiri)
				l = m + 1;
                        else // x lebih kecil (kanan)
				r = m - 1;
		}

		return -1;
	}

}
