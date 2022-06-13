package com.Task21PlusMinusDivide;

public class Operation {
	final double plus = 1;
	final double minus = 2;
	final double divide = 3;
	final double multiple =4;
	public double calculate(int i, double a, double b) {
		if(i == plus) {
			return(a + b);
		}
		else if(i == minus) {
			return(a - b);
		}
		else if(i == divide) {
			return(a/b);
		}
		else if (i == multiple) {
			return(a*b);
		}
		return 0;
	}
}

