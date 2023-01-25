
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gesa Rizky N
 */
public class ohm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Kuat Arus (Ampere) :");
        double i = sc.nextDouble();
        System.out.println("Masukan Nilai Hambatan (Ohm) :");
        double r = sc.nextDouble();
        double v = i * r;
        System.out.println("Maka Nilai Tegangan Listrik (Voilt) = "+v);
    }
}
