package week1.day1;

public class SumofDigistsinaNumber {
	
	public static void main(String[] args) {
		
		int num = 8975;
		int n = num;
		int sum = 0;
        
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println("Sum of digits in "+num+" is "+sum);
	}

}
