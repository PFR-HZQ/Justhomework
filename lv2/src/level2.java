public class level2 implements Calculate {
    @Override
    public double calculate( double a, String operate, double b ) {

        double c = 0;
        switch (operate) {
            case "*":c=a*b;break;
                
            case "/":
                if (b == 0) {
                    System.out.println( "error!" );
                    break;
                } else c=a / b;
                break;
            case "+":
                c=a + b;
                break;
            case "-":
                c=a - b;
                break;
            default:
                System.out.println( "operate error!" );
                break;
        }
    return  c;
    }
}