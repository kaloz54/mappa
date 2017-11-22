package x20171018;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nyírő Máté
 */
public class Gyok {

    public static void main(String[] args) {
     DecimalFormat df = new DecimalFormat("#.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a számot!");

        try {
            double szám = sc.nextDouble();
            double négyzetgyök = Math.sqrt(szám);
            if (Double.isNaN(négyzetgyök)) // nem definiált művelet
                throw new Exception();
            System.out.println(df.format(szám) + " négyzetgyöke " + df.format(négyzetgyök));
        } catch (InputMismatchException ime) {
            System.err.println("Csak számból lehet négyzetgyököt vonni!");
        } catch (Exception e) {
            System.err.println("Negatív számból nem lehet négyzetgyököt vonni!");
        }
    }
    
}
