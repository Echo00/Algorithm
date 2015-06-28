public class Palindrom {
	
	/**
	 * This method should whether or not a given Sting is a Palindrom or not
	 * For example the input 'Hannah' should return true
	 * The input 'A' or 'a' should return true
	 * 'Black' should return false 
	 * @param input
	 * @return
	 */
	public static boolean isPalindrom(String input){
		
		int j = input.length() - 1;
		for(int i = 0; i <= j; i++){
			String first = Character.toString(input.charAt(i));
			String second = Character.toString(input.charAt(j));
			if (!(first.toLowerCase()).equals(second.toLowerCase())){
				return false;
			}
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(Palindrom.isPalindrom(yourTestString));

	}

}
