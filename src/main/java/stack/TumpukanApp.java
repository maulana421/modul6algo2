package stack;
public class TumpukanApp {
    public static void main (String [] args){
        tumpukan tumpukan=new tumpukan(10);
        tumpukan.push(45);
        tumpukan.baca();
        tumpukan.push(67);
        tumpukan.baca();
        long nilai1 = tumpukan.pop();
        System.out.println("nilai1 = "+nilai1);
        System.out.println(" ");
        tumpukan.push(83);
        tumpukan.baca();
        tumpukan.push(27);
        tumpukan.baca();
        long nilai2 = tumpukan.pop();
        System.out.print("nilai2 = "+nilai2);
        
    } 
}
