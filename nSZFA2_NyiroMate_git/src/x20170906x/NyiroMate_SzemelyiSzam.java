package x20170906x;

// @author Nyírő Máté

import java.util.Scanner;

 
public class NyiroMate_SzemelyiSzam {
    
   public static void main(String[] args) {
        int osszeg = 0;
        String evSzam = "";
        Scanner szemSzam = new Scanner(System.in);
        System.out.println("Kérem adja meg a személyi számát: ");
        
        String szemszam = szemSzam.nextLine();
        if (szemszam.length() > 11 || szemszam.length() < 11) {
            System.out.println("Érvénytelen személyi szám");
        } else {

            int elso = Character.getNumericValue(szemszam.charAt(0));

            for (int i = 1; i < 3; i++) {
                evSzam += Character.getNumericValue(szemszam.charAt(i));
            }
            int evOsszeg = Integer.parseInt(evSzam);
             if (evOsszeg < 97 && elso < 3 || evOsszeg < 97 && elso > 4) {
            for (int i = 0; i < szemszam.length(); i++) {
                osszeg += (i + 1) * Character.getNumericValue(szemszam.charAt(i));}
             }else {
                  for (int i = 0; i < szemszam.length(); i++) {
                    osszeg += (10 - i) * Character.getNumericValue(szemszam.charAt(i));
                        }     
                }
            
            if (osszeg % 11 == Character.getNumericValue(szemszam.charAt(10))) {
                System.out.println("Érvényes személyi szám.");
            } else {
                System.out.println("Érvénytelen személyi szám.");
            }
            if (elso % 2 == 0) {
                System.out.println("Nő");
            } else {
                System.out.println("Férfi");
            }
        }
    }
    
}
