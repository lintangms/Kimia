/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kimia;

/**
 *
 * @author User
 */
public class Kimia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        kimia();
        System.out.println(kimia1());
        System.out.println(kimia2());
        System.out.println(kimia3());
        System.out.println(kimia4());
    }
    public static void kimia(){
        System.out.println("pengertian kimia adalah: ");
        System.out.println("Kimia adalah cabang dari ilmu fisik yang mempelajari tentang susunan, struktur, sifat, dan perubahan materi.");
    }
    public static String kimia1(){
        System.out.println("==================");
        System.out.println("pengertian alkena adalah: ");
        String alkena = "Senyawa Alkena merupakan golongan hidrokarbon alifatik yang tersusun dari unsur atom karbon (C) dan juga atom hidrogen (H) yang terikat";
        return alkena;
        
        
    }
    public static String kimia2(){
        System.out.println("==================");
        System.out.println("Pengertian polimer adalah: ");
        String polimer = "polimer adalah molekul raksasa (makromolekul) yang tersusun dari satuan-satuan kimia ";
        return polimer;
    }
    public static String kimia3(){
        System.out.println("==================");
        System.out.println("Pengertian asam basa adalah: ");
        String asam_basa = "asam adalah zat yang menghasilkan ion hidrogen (H+) dalam larutan sedangkan basa adalah zat yang menghasilkan ion hidroksida (OH-) dalam larutan";
        return asam_basa;
}
    public static String kimia4(){
        System.out.println("==================");
        System.out.println("Pengertian korosi adalah");
        String korosi = "korosi secara umum adalah rusaknya benda-benda logam yang disebabkan oleh pengaruh lingkungan";
        return korosi;
}
}