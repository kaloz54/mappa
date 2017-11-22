package x20171115_ZH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Nyírő Máté
 */
public class NyiroMateZH {
    public static void main(String[] args) {
        beolvasFile();
        Scanner sc = new Scanner(System.in);
         System.out.println("Kérem az azonosítoját!");
         String azon = sc.nextLine();
         StringTokenizer st = new StringTokenizer(azon," "); 
          while (st.hasMoreTokens()) {
                
              if (st.nextToken()==azon) {
                  
              }
        }
    }
    private static void beolvasFile() {
         try {
            FileReader reader = new FileReader("valaszok.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
                 while ((line = bufferedReader.readLine()) != null) {
                     System.out.println(line);
                 }
             reader.close();
	} catch (IOException e) {
            e.printStackTrace();

	}
    }
    
    
}
