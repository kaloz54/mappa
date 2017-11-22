
package x20171004;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nyírő Máté
 */
public class NyiroMate_fileKiir {

    public static void main(String[] args) {
          int osszeg = 0;
          String evSzam = "";
          
          try {
            FileReader reader = new FileReader("NyiroMate.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (line.length() > 11 || line.length() < 11) {
                } else {

                int elso = Character.getNumericValue(line.charAt(0));

                for (int i = 1; i < 3; i++) {
                    evSzam += Character.getNumericValue(line.charAt(i));
                }
                int evOsszeg = Integer.parseInt(evSzam);
                 if (evOsszeg < 97 && elso < 3 || evOsszeg < 97 && elso > 4) {
                for (int i = 0; i < line.length(); i++) {
                    osszeg += (i + 1) * Character.getNumericValue(line.charAt(i));}
                 }else {
                      for (int i = 0; i < line.length(); i++) {
                        osszeg += (10 - i) * Character.getNumericValue(line.charAt(i));
                            }     
                    }

                if (osszeg % 11 == Character.getNumericValue(line.charAt(10))) {
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
                reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
