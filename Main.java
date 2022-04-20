package com.company;

public class Main {
    public static void main(String[] args) {
	member nama1= new member();
    nama1.name = "Jennie";
    nama1.umur = "26";
    member nama2 = new member();
    nama2.name ="Lisa";
    nama2.umur = "25";
    posisimember nama3= new posisimember();
    nama3.name = "Jisoo";
    nama3.umur = "27";
    nama3.posisimember = "visual";
    posisimember nama4= new posisimember();
    nama4.name = "Rose";
    nama4.umur = "25";
    nama4.posisimember = "Main Vocal";
    System.out.println("\nBlackPink");
    nama1.display();
    nama2.display();
    System.out.println("Bagian Posisi");
    nama3.display();
    nama4.display();
    }
}
