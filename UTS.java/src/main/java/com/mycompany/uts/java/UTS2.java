/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts.java;
import java.util.Scanner;
/**
 *
 * @author MUSFARA ZAHRA NADIEN
 */
public class UTS2 {
      public static void main(String[] args) {
    int i;
    int j;
    int jml_baris;

    System.out.print("TAMPILAN PROGRAM UTS SOAL NO 2 \n");
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Baris : ");
    jml_baris = input.nextInt();
    
    for (i=1; i<=jml_baris; i++)
    {
        for (j=1; j<=i; j++)
        {
            System.out.print(" ");
        }
            for (j=5; j>=i; j--)
            {
                System.out.print("#");
                System.out.print(" ");
            }
        System.out.println();
    }
    
    for (i=1; i<=jml_baris; i++)
    {
        for (j=5; j>=i; j--)
        {
            System.out.print(" ");
        }
            for (j=1; j<=i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
                System.out.println();
    }

    }
}