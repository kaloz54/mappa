package x20171025;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Nyírő Máté
 */
public class vissza {

    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("vissza.txt");
            BufferedReader br = new BufferedReader(in);
            String line = br.readLine();
            while (line!=null) {
            System.out.println(line);
            
            String s1=line;
            String s2=new StringBuffer(s1).reverse().toString();
            System.out.println(s2);
            
            line = br.readLine();
    }
           
    in.close();
        } catch (Exception e) {
        }
         
    }
    
}
