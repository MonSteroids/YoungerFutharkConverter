public class YoungFutharkConvert{
	public static String convertToYoungerFuthark(String input) {
		if (input == null || input.isEmpty()) {
			return "No input provided!";
		}
		return input.toLowerCase()
            		.replace("a", "ᛅ")  // Ár
            		.replace("á", "ᛅ")  // Same as 'a'
            		.replace("b", "ᛒ")  // Bjarkan
            		.replace("c", "ᚴ")  // Kaun (no direct 'c', mapped to 'k' sound)
            		.replace("d", "ᛏ")  // Týr
            		.replace("ð", "ᚦ")  // Thurs
            		.replace("e", "ᛅ")  // Ár, can also be Íss
            		.replace("é", "ᛅ")  // Same as 'e'
            		.replace("f", "ᚠ")  // Fé
            		.replace("g", "ᚴ")  // Kaun
            		.replace("h", "ᚼ")  // Hagall
            		.replace("i", "ᛁ")  // Íss
            		.replace("í", "ᛁ")  // Same as 'i'
            		.replace("j", "ᛁ")  // Íss (used for 'j' in modern contexts)
            		.replace("k", "ᚴ")  // Kaun
            		.replace("l", "ᛚ")  // Lögr
            		.replace("m", "ᛘ")  // Maðr
            		.replace("n", "ᚾ")  // Nauðr
            		.replace("o", "ᚢ")  // Úr
            		.replace("ó", "ᚢ")  // Same as 'o'
            		.replace("p", "ᛒ")  // Bjarkan (p/b sounds are similar)
            		.replace("q", "ᚴ")  // Kaun (k/q sounds are interchangeable)
            		.replace("r", "ᚱ")  // Reið
            		.replace("s", "ᛋ")  // Sól
            		.replace("t", "ᛏ")  // Týr
            		.replace("u", "ᚢ")  // Úr
            		.replace("ú", "ᚢ")  // Same as 'u'
            		.replace("v", "ᚠ")  // Fé (f/v sounds are similar)
            		.replace("w", "ᚢ")  // Úr (w is close to 'u')
            		.replace("x", "ᛋ")  // Sól (mapped to 's' sound)
            		.replace("y", "ᛅ")  // Ár
            		.replace("ý", "ᛅ")  // Same as 'y'
            		.replace("z", "ᛋ")  // Sól (mapped to 's' sound)
            		.replace("þ", "ᚦ")  // Thurs
        	    	.replace("æ", "ᛅ")  // Ár (similar to 'a')
	            	.replace("ö", "ᚢ"); // Úr (similar to 'o')
		
	}

	public static void main(String[] Args) {
		new Gui();
          }

}
