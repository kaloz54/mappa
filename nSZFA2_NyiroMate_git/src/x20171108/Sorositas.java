package x20171108;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Nyírő Máté
 */
class Tanulo implements Serializable{
      String nev;
    Integer kor;
}

public class Sorositas {
    private  static void make() throws IOException{
        Tanulo sanyi = new Tanulo();
        sanyi.nev="Rúzsa Sándor";
        sanyi.kor=160;
        
        Tanulo mari=new Tanulo();
        mari.nev="kiss Mária";
        mari.kor=40;
        
        Tanulo bela=new Tanulo();
        mari.nev="Kiss Béla";
        mari.kor=80;
        
        FileOutputStream fos = new FileOutputStream("adat.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(sanyi);
        oos.writeObject(mari);
        oos.writeObject(bela);
        
        oos.close();
        
    }
    private static void load() throws IOException, ClassNotFoundException{
        Tanulo egy = new Tanulo();
        Tanulo ketto = new Tanulo();
        
        FileInputStream fis = new FileInputStream("adat.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        egy=(Tanulo)ois.readObject();
        ketto=(Tanulo)ois.readObject();
    
        ois.close();
        
        System.out.println("adat1: "+egy.nev);
        System.out.println("adat1: "+egy.kor);
         System.out.println("adat1: "+ketto.nev);
        System.out.println("adat1: "+ketto.kor);
    }
    
    private static void load2() throws IOException, ClassNotFoundException{
        try {
            FileInputStream fis = new FileInputStream("adat.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            while(true){
                Tanulo std=(Tanulo) ois.readObject();
                System.out.println(std.nev);
                System.out.println(std.kor);
            }
        } catch (EOFException eof) {
            System.out.println("vége a filejnak");
        }
        catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        make();
        load2();
        
    }
}