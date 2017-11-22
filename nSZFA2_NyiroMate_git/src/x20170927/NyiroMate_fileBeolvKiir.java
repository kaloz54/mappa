package x20170927;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Nyírő Máté
 */
public class NyiroMate_fileBeolvKiir {

    public static void main(String[] args) {
        try {
         Random rnd = new Random();        
        int szemSzam[] = new int[11];
       // for (int i = 0; i < 5; i++) {
        int osszeg = 0;
        szemSzam[0] = rnd.nextInt(7)+1;
        szemSzam[1] = rnd.nextInt(9);
        szemSzam[2] = rnd.nextInt(9);
        szemSzam[3] = rnd.nextInt(1);
        szemSzam[4] = rnd.nextInt(9);
        szemSzam[5] = rnd.nextInt(2);
        szemSzam[6] = rnd.nextInt(2);
        szemSzam[7] = rnd.nextInt(9);
        szemSzam[8] = rnd.nextInt(9);
        szemSzam[9] = rnd.nextInt(9);
        

        for (int j = 0; j < szemSzam.length; j++) {
            osszeg += szemSzam[j] * (j+1);
        }
            if (osszeg%11<10) {
              szemSzam[10] = osszeg % 11;
            }else{
                System.out.println("Nem jo");
            }
       
        
            for (int k = 0; k < szemSzam.length; k++) {
                System.out.print(szemSzam[k]);
            }
            System.out.println("");
       // }
            FileWriter fn = new FileWriter("NyiroMate.txt", true);
            for (int i = 0; i < szemSzam.length; i++) {
               fn.write(""+szemSzam[i]);
            }
                fn.write("\r\n");
            fn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      }  
    }
