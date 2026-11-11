class Example4{
 public static void main(String[] args) 
{ 
float n = 10; 
float m = 0; 
try { 
if(m == 0)
    throw new ArithmeticException("Division by zero is not allowed!");
float res = n / m; System.out.println("Result: " + res); 
    }
catch (ArithmeticException e) {
System.out.println( "Error: Division by zero is not allowed!"); 
} 
}
 }
