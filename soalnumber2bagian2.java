import java.util.Scanner;

public class soalnumber2bagian2 {

  
    static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);

        System.out.println("Volume tabung adalah: " + volume);

        input.close();
    }
}


