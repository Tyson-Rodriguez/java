class DecBin{
	public static void main (String a[]){
		
		int n;
		String bin; String hex;
		for (n = 0; n <= 255; n ++){			    
			     bin = Integer.toBinaryString(n);
			     hex = Integer.toHexString(n);
			     System.out.println(n+" "+hex+" "+bin);
			     // concatination
			     //java DecBin > DecBinOut.txt
			 }
			     
	}		
}

/*
 * System.out.print(bin);
			     System.out.print(" ");
			     System.out.print(hex);
			     System.out.println();
 *
 */
`
