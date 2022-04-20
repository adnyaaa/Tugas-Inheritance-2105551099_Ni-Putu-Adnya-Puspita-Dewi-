package com.company;

public class posisimember extends member{
    String posisimember;
    @Override
    void display() {

        System.out.println("Nama Member   : " +this.name);
        System.out.println("Umur Member   : " +this.umur);
        System.out.println("Posisi Member : " +this.posisimember );
    }
}
