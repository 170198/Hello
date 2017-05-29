import java.util.Scanner;

class Hello {
	
	public static void main(String[] args) {
		System.out.println(litresToGallons(6));
	}
	
	static double litresToGallons(double litres) {
		litres *= 0.268;
		return litres;
	}
}



private static void correspondence() {
	String polynomial = "";
	String trignometric;
	String logarithmic;
	String expontential;
	boolean poly = false;
	boolean trig = false;
	boolean loga = false;
	boolean expo = false;
	Scanner input= new Scanner(System.in); 
	System.out.println("This is an integral calculator. \nPlease follow the instructions and enter what is asked for, as entering anything else will not recieve an answer.");
	System.out.println("Are you entering a polynomial? If yes type yes. If no type no");
	polynomial = input.nextLine();
	
	if(polynomial.equalsIgnoreCase("yes"))
		poly = polynomial.equalsIgnoreCase("yes");
	if(!(polynomial.equalsIgnoreCase("yes") || polynomial.equalsIgnoreCase("no"))) {			
		System.out.println("Neither yes or no has been entered please restart");
		return;
	}
	
	
	if (polynomial.equalsIgnoreCase("no")) {
		System.out.println("Are you entering a trignometric function? If yes type yes. If no type no");
		trignometric = input.nextLine();
	
		if(trignometric.equalsIgnoreCase("yes"))
			trig = trignometric.equalsIgnoreCase("yes");
		if(!(trignometric.equalsIgnoreCase("yes") || trignometric.equalsIgnoreCase("no"))) {
			System.out.println("Neither yes or no has been entered please restart");
			return;
		}
	
		if (trignometric.equalsIgnoreCase("no")) {
			System.out.println("Are you entering a logarithmic function? (including natural logarithm) If yes type yes. If no type no");
			logarithmic = input.nextLine();


			if(logarithmic.equalsIgnoreCase("yes"))
				loga=logarithmic.equalsIgnoreCase("yes");
			if(!(logarithmic.equalsIgnoreCase("yes") || logarithmic.equalsIgnoreCase("no"))){					
				System.out.println("Neither yes or no has been entered please restart");
				return;
			}
		
			if (logarithmic.equalsIgnoreCase("no")) {
				System.out.println("Are you entering a exponential function? (including natural logarithm) If yes type yes. If no type no");
				expontential = input.nextLine();
				if(expontential.equalsIgnoreCase("yes"))
					expo=expontential.equalsIgnoreCase("yes");
				if(!(expontential.equalsIgnoreCase("yes") || expontential.equalsIgnoreCase("no"))) {
					System.out.println("Neither yes or no has been entered please restart");
					return;
				}
			}
		}
}

 





System.out.println("\nPlease enter your integral with the variable x. IE: integral of f(x)dx");
System.out.println("If you are entering it as an polynomial please enter it like this example. 2x^2+3x-2");
System.out.println("Please enter your equation: ");
String integral = input.nextLine();

System.out.println("Are you looking for the definite integral? If yes type yes. If no type no");
String defindef = input.next();
if (defindef.equalsIgnoreCase("no")){
	if(trig){
		System.out.println(trig(integral) + " + C");
	}
	else if (poly){
		System.out.println(polynomial(integral) + " + C");
	}
	else if (loga){
		System.out.println(log(integral) + " + C");
	}
	else if (expo){
		System.out.println(exponetial(integral) + " + C");
	}
}
else{

System.out.println("Please enter the upper limit: ");
double upperlim = input.nextInt();

System.out.println("Please enter the lower limit: ");
double lowerlim = input.nextInt();
if(lowerlim!=upperlim){
	defintegralcalc(integral, upperlim, lowerlim);
	if(trig){
		System.out.println("The indefinite integral is: " + trig(integral) + " + C");
		System.out.println("The definite integral is: " + defintegralcalc(trig(integral), upperlim, lowerlim));
	}
	else if (poly){
		System.out.println("The indefinite integral is: " + polynomial(integral) + " + C");
		System.out.println("The definite integral is: " + defintegralcalc(polynomial(integral), upperlim, lowerlim));
	}
	else if (loga){
		System.out.println("The indefinite integral is: " + log(integral) + " + C");
		System.out.println("The definite integral is: " + defintegralcalc(log(integral), upperlim, lowerlim));
	}
	else if (expo){
		System.out.println("The indefinite integral is: " + exponetial(integral) + " + C");
		System.out.println("The definite integral is: " + defintegralcalc(exponetial(integral), upperlim, lowerlim));
	}
	
	
	
}
else{
	System.out.println("You've entered the same value for the upper and lower limit. Therefore the value of the definit integral is 0");
}


}
}