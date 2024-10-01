import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        System.out.print("Enter jari jari : ");
        int r = Inputan.nextInt();
        int phi = 22/7; 
        double keliling = 2 * phi * r;
        
        System.out.println("Keliling lingkaran adalah " + keliling + " cm");
    }
}
