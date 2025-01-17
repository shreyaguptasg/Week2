import java.util.*;
//creating a class  PalindromeChecker
class  PalindromeChecker{
	 //defining attributes such as text
	String text;
	
	//creating constructor of the class  PalindromeChecker

	 PalindromeChecker(String text){
		this.text = text;
	}
	
	//method to check if text is palindrome or not 
	public boolean isPalindrome(){
		int left =0;
		int right = text.length()-1;
		while(left<right){
			if(text.charAt(left)== text.charAt(right)){
				left++;
				right--;
			}
			else{
				return false;
			}
		}
		return true;
	}
	//method to display teh result;
	public void displayResult(boolean ans){
		if(ans){
		System.out.println("The given text " + text + " is a plaindromic text");
		}
		else{
			System.out.println("The given text " + text + " is not a plaindromic text");
		}
	}
	
	public static void main(String [] args){
		//creating an object of the class  PalindromeChecker and displaying the results.

		PalindromeChecker text = new  PalindromeChecker("abccba");
		boolean ans = text.isPalindrome();
		text.displayResult(ans);
		
	}
}