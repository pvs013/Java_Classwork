public class YardCalculatorTester
{
    public static void main(String[] args)
    {
        final double LENGTH = 60.1;
        final double WIDTH = 35.5;
        
       YardCalculator calculator = new YardCalculator(LENGTH, WIDTH);
       
       System.out.println(calculator.perimeter());
       System.out.println("Expected: 58.277");
       
       System.out.println(calculator.area());
       System.out.println("Expected: 198.2132");
       
       System.out.println(calculator.diagonal());
       System.out.println("Expected: 21.27");
        
    }
}