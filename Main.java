import java.util.Scanner;
import java.lang.ArithmeticException;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x,y;
        System.out.println("_____OPERATION SYMBOLS_____");
        System.out.println("Addition: + \nSUBTRACTION: -\nMULTIPLICATION: *\nDIVISION: /\nPOWER: ^\nMINIMUM: Min\nMAXIMUM: Max");
        System.out.println("SQUARE ROOT: sqrt\nCUBE ROOT: cbrt\nLOG: log\nINVERSE: Inv\nSINE: Sin\nCOSINE: Cos\nTANGENT: Tan");
        System.out.println("NOTE: Inputs are case sensitive\n\n\n");
        System.out.println("Enter the values:");
        x=input.nextDouble();
        //System.out.println("Enter the operation :");
      String  op = input.next();
        if(op.equals("sqrt")||op.equals("cbrt")||op.equals("log")||op.equals("Sin")||op.equals("Cos")||op.equals("Tan")||op.equals("Inv"))
        {
            calculator ob = new calculator(x,op);
            System.out.println("Ans = "+ob.result);
        }
        else if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")||op.equals("Min")||op.equals("Max")||op.equals("^"))
        {
            //System.out.println("Enter the value:");
            y=input.nextDouble();
            calculator ob = new calculator(x,y,op);
            System.out.println("Ans = "+ob.result);

        }
        else
            System.out.println("\"INVALID OPERATION\"");

    }

}
class calculator {
    private double a, b;
     double result=0;
    private String operator;
    calculator(double x,String ch)
    {
        a=x;
        operator =ch;
        result = oneOperend();
    }
    calculator(double x,double y,String ch)
    {
        a=x;
        b=y;
        operator = ch;
        result = twoOperend();
    }
   private double oneOperend()
    {
        try{
            switch(operator) {
                case "sqrt":
                return Math.sqrt(a);
                case "log":
                 return  Math.log(a);
                case "Sin":
                   return Math.sin(a);
                case "Cos":
                    return Math.cos(a);
                case "Tan":
                    return Math.tan(a);
                case "Inv":
                    return (1/a);
                case "cbrt":
                    return Math.cbrt(a);
                default :
                    System.out.println("INVALID OPERATION");
                    return 0;
            } }
        catch (ArithmeticException e) {
            System.out.println("THERE IS SOME ERROR");
            System.out.println(e);
            System.out.println("CHECK YOUR INPUT");
        }

    return 0;}
    private double twoOperend()
    { try{
        switch(operator) {
            case "+":
            return a + b;
            case "-":
             return  a - b;
            case "*":
               return a * b;
            case "/":
                return a/b;
            case "^":
                return Math.pow(a, b);
            case"Max":
             return Math.max(a,b);
            case"Min":
             return Math.min(a,b);
            default :
                System.out.println("INVALID OPERATION");
                return 0;
        } }
    catch (ArithmeticException e) {
        System.out.println("THERE IS SOME ERROR");
        System.out.println(e);
        System.out.println("CHECK YOUR INPUT");
    }
return 0;
    }

}
