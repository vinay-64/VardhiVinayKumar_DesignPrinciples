package Services;

public class CalculatorServiceImplementation implements CalculatorService {
	
	public int addNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		
		int sumOfTwoNumbers = num1 + num2 ;
		
		return sumOfTwoNumbers;
	}
	
	public int subtractNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		
		int differenceOfTwoNumbers = num1 - num2 ;
		
		return differenceOfTwoNumbers;
	}

	public int multiplyNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		
		int productOfTwoNumbers = num1 * num2 ;
		
		return productOfTwoNumbers;
	}

	public double divideNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		
		try
		{
			double divisionOfTwoNumbers = ( double ) num1 / num2 ;
			return divisionOfTwoNumbers;
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
		}
		return 0;
		
	}

}