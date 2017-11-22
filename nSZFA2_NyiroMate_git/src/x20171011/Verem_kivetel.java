package x20171011;

public class Verem_kivetel {
public static class Verem_Exception extends Exception{
    public Verem_Exception(String hibaüzenet){
        super(hibaüzenet);
    }

}
 public static class Verem{
    private final static int MERET=3;
    private int[]verem=new int[MERET];
    private int mutato=0;
    
    public void betesz(int i) throws Verem_Exception{
        if (mutato<MERET) {
            verem[mutato]=i;
            mutato++;
        }else{
            throw new Verem_Exception("Verem megtelt!");
        }
    }
    public int kivesz() throws Verem_Exception{
        if (mutato==0) {
            throw new Verem_Exception("A verem üres!");
        }else{
            mutato--;
            int i = verem[mutato];
            System.out.println("A szám("+i+") a veremből kivéve!");
            return i;
        }
       
    }
 }
 public static int msec=2000;
 public static void Var(int n){
    try {
        Thread.sleep(n);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    
}
    public static void main(String[] args) {
        Verem v = new Verem();
        try {
             v.betesz(21);
             v.betesz(52);
             v.betesz(77);
             v.betesz(99);
        } catch (Verem_Exception ve) {
            Var(msec);
            System.out.println(ve);
        }
        try {
            v.kivesz();
            v.kivesz();
            v.kivesz();
            v.kivesz();
        } catch (Verem_Exception ve) {
            Var(msec);
            System.out.println(ve);
        }
       
        
    }
    
}
