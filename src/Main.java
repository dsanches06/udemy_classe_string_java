
public class Main {

	public static void main(String[] args) {
		/**
		 * FUNÇOES DE STRING
		 * 
		 * toLowerCase(); => formatar o texto para letra minuscula
		 * 
		 * toUpperCase(); => formatar o texto para letra maiuscula
		 * 
		 * trim(); => remover espaço do texto
		 * 
		 * substring(inicio) e substring(inicio, fim) => para recortar palavra
		 * 
		 * Replace(char, char) e Replace(string, string) => para substituir a palavra ou caractere
		 * 
		 * IndexOf e LastIndexOf => para buscar posição do caractere no texto
		 * 
		 * Split(""); => recorta as string por separador e guarda num vector
		 */

		String original = "abcde FGHIJ ABC abc DEFG     ";
		System.out.println("Original: -"+original+"-");

		String str1 = original.toLowerCase();
		String str2 = original.toUpperCase();
		String str3 = original.trim();
		String str4 = original.substring(2);
		String str5 = original.substring(2, 9);
		String str6 = original.replace("a" ,"x");
		String str7 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("toLowerCase: -"+str1+"-");
		System.out.println("toUpperCase: -" + str2 + "-");
		System.out.println("trim: -" + str3 + "-");
		System.out.println("substring(2): -" + str4 + "-");
		System.out.println("substring(2, 9): -" + str5 + "-");
		System.out.println("replace(a , x): -" + str6 + "-");
		System.out.println("replace(abc, xy): -" + str7+ "-");
		System.out.println("indexOf(bc): - " + i+ " -");
		System.out.println("lastIndexOf(bc): - " + j+ " -");
		
		
		String s = "potato apple lemon";
		
		String [ ] vect = s.split(" ");
		for (int k = 0; k < vect.length; k++) {
			System.out.println(vect[k]);
		}
		
		String str = "radar";
		String rev = "";
		int length = str.length();
		
		for (int k = length - 1; k >= 0; k--) {
			rev += str.charAt(k);
		}
		
		if (str.equals(rev)) {
			System.out.println(str+" é uma palavra palindrome");
		} else {
			System.out.println(str+" não é uma palavra palindrome");
		}
		
	}

}
