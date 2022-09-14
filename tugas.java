/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekperdana;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class TugasRPL {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pil;
        String pil1;
        System.out.println("PILIH JALUR MASUK");
        System.out.println("1. SBMPTN");
        System.out.println("2. SNMPTN");
        System.out.println("3. Mandiri");
        System.out.print("PILIH (Ketik Angka): ");
        pil = in.nextInt();
        System.out.println("===========================");
        if (pil == 1){
            System.out.print("GOLONGAN PENDAPAT A/B/C = ");
            pil1 = in.next();
            System.out.println("---------------------------");
            if (pil1.equalsIgnoreCase("a")){
                System.out.println("DSP = 5 Juta");
                System.out.println("SPP = 500 Ribu");
            }else if (pil1.equalsIgnoreCase("b")){
                System.out.println("DSP = 15 Juta");
                System.out.println("SPP = 1 Juta");
            }else if (pil1.equalsIgnoreCase("c")){
                System.out.println("DSP = 30 Juta");
                System.out.println("SPP = 2 juta");
            }
        }if (pil == 2){
            System.out.print("GOLONGAN PENDAPAT A/B/C = ");
            pil1 = in.next();
            System.out.println("---------------------------");
            if (pil1.equalsIgnoreCase("a")){
                System.out.println("DSP = 7 Juta");
                System.out.println("SPP = 500 Ribu");
            }else if (pil1.equalsIgnoreCase("b")){
                System.out.println("DSP = 17 Juta");
                System.out.println("SPP = 1 Juta");
            }else if (pil1.equalsIgnoreCase("c")){
                System.out.println("DSP = 35 Juta");
                System.out.println("SPP = 2 juta");
            }
        }if (pil == 3){
            System.out.print("GOLONGAN PENDAPAT A/B/C = ");
            pil1 = in.next();
            System.out.println("---------------------------");
            if (pil1.equalsIgnoreCase("a")){
                System.out.println("DSP = 10 Juta");
                System.out.println("SPP = 1 Juta");
            }else if (pil1.equalsIgnoreCase("b")){
                System.out.println("DSP = 25 Juta");
                System.out.println("SPP = 2 Juta");
            }else if (pil1.equalsIgnoreCase("c")){
                System.out.println("DSP = 50 Juta");
                System.out.println("SPP = 3 juta");
            }
        }else {
            System.out.println("Pilihan Salah");
        }
    }
}
