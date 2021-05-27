package stack;
public class TugasApp {
     public static void main (String [] args){
        tumpukan tumpukan=new tumpukan(6);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        long nilai1=tumpukan.pop();
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        long nilai2=tumpukan.pop();
        System.out.println(" ");
        tumpukan.baca();
        long nilai3=tumpukan.peek();
        System.out.println(" ");
        System.out.println("nilai top ="+nilai3);
    }

}
