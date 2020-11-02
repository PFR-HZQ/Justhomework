import java.util.Scanner;

public class test {
    public static void main( String[] args ) {
        level2 tes =new level2();
        Scanner in = new Scanner( System.in );
        int a= in.nextInt( );
        String operate = in.next();
        int b= in.nextInt();


        System.out.println( tes.calculate( a,operate,b ));
    }
}
