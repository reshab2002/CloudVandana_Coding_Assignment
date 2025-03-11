import java.util.Arrays;
import java.util.Scanner;
class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }

        
        int[] charCount = new int[26]; 
        
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++; 
        }
        
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--; 
            if (charCount[c - 'a'] < 0) {
                return false; 
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String firstString;
		String secondString;
		System.out.println("Enter the first String");
		firstString=sc.nextLine();
		System.out.println("Enter the second String");
		secondString=sc.nextLine();

        boolean result = areAnagrams(firstString, secondString);
        System.out.println("Are the strings anagrams? " + result);
    }
}