class Calculator{
    public float add(float num1 , float num2){
        return (num1+num2);
    }
    public float subtract(float num1, float num2){
        return(num1-num2);
    
    }
    public float multiply(float num1 , float num2){
        return (num1*num2);
    }
    public float divide(float num1 , float num2){
        return(num1/num2);
    }
}
class Test{
    public static void main(String args[])
    {
        ExtendedCalculator calculator = new ExtendedCalculator();
        System.out.println("Addition:"+calculator.add(5,3));
        System.out.println("Subtraction:"+calculator.subtract(5,3));
         System.out.println("Product:"+calculator.multiply(5,3));
         System.out.println("division:"+calculator.divide(5,3));

          System.out.println("Square:"+calculator.square(4));
           System.out.println("Cube:"+calculator.cube(3));       
    }
}
