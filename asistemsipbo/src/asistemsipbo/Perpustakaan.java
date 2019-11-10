/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistemsipbo;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Hellau
 */
public class Perpustakaan {
    public Perpustakaan(){
        
    }
}

class Buku extends Perpustakaan{
    private String judul, pengarang, jenis;
    private int halaman;
    
    public Buku(){
        judul = judul;
        pengarang = pengarang;
        halaman = halaman;
    }
    public Buku(String judul, String pengarang, int halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
    }
    public Buku(String judul, String pengarang, int halaman, String jenis) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.jenis = jenis;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public int getHalaman() {
        return halaman;
    }
    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }
    public void info(){
        System.out.println("Judul Buku\t:"+getJudul());
        System.out.println("Pengarang\t:"+getPengarang());
        System.out.println("Halaman\t:"+getHalaman());
    }
}

class Fiksi extends Buku{
    private String jenis;
    public Fiksi(){
        super();
        this.jenis="Fiksi";
    }
    public Fiksi(String judul, String pengarang, int halaman, String jenis){
        super(judul, pengarang, halaman, jenis);
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

class NonFiksi extends Buku{
    private String jenis;
    public NonFiksi(){
        super();
        this.jenis="Non-Fiksi";
    }
    public NonFiksi(String judul,String pengarang, int halaman, String jenis){
        super(judul, pengarang, halaman, jenis);
        this.jenis="Non-Fiksi";
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }    
}

class run{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Buku[] buku = new Buku[99999];
        Random data = new Random();
        int jmlbukutotal = 0;
        int jmlfiksi = 0;
        int jmlnonfiksi = 0;
        double jmlhal = 0;
        double jmlhalfiksi = 0;
        double jmlhalnonfiksi = 0;
        double sd = 0;
        double sdfiksi = 0;
        double sdnonfiksi = 0;
        
        for(int i = 0; i<buku.length; i++){
            int acak = data.nextInt(2)+1;
            if (acak == 1){
                buku[i] = new Fiksi();
            }
            else
                buku[i] = new NonFiksi();
        }
        buku[0]= new Buku("Buku_1","Pengarang_1",100,"Fiksi");
        jmlbukutotal +=1;
        jmlfiksi +=1;
        jmlhal +=100;
        jmlhalfiksi +=100;
        buku[1]=new Buku("Buku_2","Pengarang_2",50, "Non_Fiksi");
        jmlbukutotal +=1;
        jmlnonfiksi +=1;
        jmlhal +=50;
        jmlhalnonfiksi +=50;
        buku[2]= new Buku("Buku_3","Pengarang_3",50,"Fiksi");
        jmlbukutotal +=1;
        jmlfiksi +=1;
        jmlhal +=50;
        jmlhalfiksi +=50;
        
        int pil = 1;
        while(pil==1){
            System.out.println("================================================================================================\n" +
            " ____    ____    ____    ____    __  __  ____    ______  ______  __  __   ______  ______  __  __\n" +
            "/\\  _`\\ /\\  _`\\ /\\  _`\\ /\\  _`\\ /\\ \\/\\ \\/\\  _`\\ /\\__  _\\/\\  _  \\/\\ \\/\\ \\ /\\  _  \\/\\  _  \\/\\ \\/\\ \\\n" +
            "\\ \\ \\L\\ \\ \\ \\L\\_\\ \\ \\L\\ \\ \\ \\L\\ \\ \\ \\ \\ \\ \\,\\L\\_\\/_/\\ \\/\\ \\ \\L\\ \\ \\ \\/'/'\\ \\ \\L\\ \\ \\ \\L\\ \\ \\ `\\\\ \\\n" +
            " \\ \\ ,__/\\ \\  _\\L\\ \\ ,  /\\ \\ ,__/\\ \\ \\ \\ \\/_\\__ \\  \\ \\ \\ \\ \\  __ \\ \\ , <  \\ \\  __ \\ \\  __ \\ \\ , ` \\\n" +
            "  \\ \\ \\/  \\ \\ \\L\\ \\ \\ \\\\ \\\\ \\ \\/  \\ \\ \\_\\ \\/\\ \\L\\ \\ \\ \\ \\ \\ \\ \\/\\ \\ \\ \\\\`\\ \\ \\ \\/\\ \\ \\ \\/\\ \\ \\ \\`\\ \\\n" +
            "   \\ \\_\\   \\ \\____/\\ \\_\\ \\_\\ \\_\\   \\ \\_____\\ `\\____\\ \\ \\_\\ \\ \\_\\ \\_\\ \\_\\ \\_\\\\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\ \\_\\\n" +
            "    \\/_/    \\/___/  \\/_/\\/ /\\/_/    \\/_____/\\/_____/  \\/_/  \\/_/\\/_/\\/_/\\/_/ \\/_/\\/_/\\/_/\\/_/\\/_/\\/_/\n" +
            "\n" +
            "================================================================================================\n" +
            "\n" +
            "[1]. input buku baru\n" +
            "[2]. modifikisi detail buku\n" +
            "[3]. hapus buku\n" +
            "[0]. EXIT\n" );
            System.out.println("Data Buku : ");
            for (int i = 0; i < jmlbukutotal; i++) {
                System.out.println("[" + (i + 1) + "] " + buku[i].getJudul() + "\t| " + buku[i].getPengarang());
            }
            System.out.println("==========================================================================================");
            System.out.println("[1]. Input Buku Baru");
            System.out.println("[2]. Modifikasi Detail Buku");
            System.out.println("[3]. Hapus Buku");
            System.out.println("[0]. Exit");
            System.out.println("==========================================================================================");
            double ratarata = jmlhal / jmlbukutotal;
            for (int i = 0; i < jmlbukutotal; i++) {
                sd = Math.pow((buku[i].getHalaman() - ratarata), 2);
            }
            double rataratafiksi = jmlhalfiksi / jmlfiksi;
            double rataratanonfiksi = jmlhalnonfiksi / jmlnonfiksi;
            for (int i = 0; i < jmlbukutotal; i++) {
                if (buku[i].getJenis() == "Fiksi") {
                    sdfiksi = Math.pow((buku[i].getHalaman() - rataratafiksi), 2);
                } 
                else {
                    sdnonfiksi = Math.pow((buku[i].getHalaman() - rataratanonfiksi), 2);
                }
            }
            System.out.println("Jumlah Buku di Dalam Perpustakaan: " + jmlbukutotal);
            System.out.println("Rata-Rata Halaman Buku dalam Perpustakaan: " + ratarata);
            System.out.println("Standar Deviasi Halaman Buku dalam Perpustakaan: " + Math.sqrt(sd / jmlbukutotal));
            System.out.println("==========================================================================================");
            System.out.println("Jumlah Buku Fiksi dalam Perpustakaan: " + jmlfiksi);
            System.out.println("Rata-Rata Pages Buku Fiksi dalam Perpustakaan: " + rataratafiksi);
            System.out.println("Standar deviasi Pages Buku Fiksi dalam Perpustakaan: " + Math.sqrt(sdfiksi / jmlfiksi));
            System.out.println("==========================================================================================");
            System.out.println("Jumlah Buku Non Fiksi dalam Perpustakaan : " + jmlnonfiksi);
            System.out.println("Rata-Rata Pages Buku Non Fiksi dalam Perpustakaan: " + rataratanonfiksi);
            System.out.println("Standar deviasi Pages Buku Non Fiksi dalam Perpustakaan: " + Math.sqrt(sdnonfiksi / jmlnonfiksi));
            System.out.println("==========================================================================================");
            System.out.print("PILIHAN : ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("================================================================================================\n" +
                " ____            __                  ____\n" +
                "/\\  _`\\         /\\ \\                /\\  _`\\\n" +
                "\\ \\ \\L\\ \\  __  _\\ \\ \\/'\\   __  __   \\ \\ \\L\\ \\     __    _ __   __  __\n" +
                " \\ \\  _ <'/\\ \\/\\ \\ \\ , <  /\\ \\/\\ \\   \\ \\  _ <'  /'__`\\ /\\`'__\\/\\ \\/\\ \\\n" +
                "  \\ \\ \\L\\ \\ \\ \\_\\ \\ \\ \\\\`\\\\ \\ \\_\\ \\   \\ \\ \\L\\ \\/\\ \\L\\.\\\\ \\ \\/ \\ \\ \\_\\ \\\n" +
                "   \\ \\____/\\ \\____/\\ \\_\\ \\_\\ \\____/    \\ \\____/\\ \\__/.\\_\\ \\_\\  \\ \\____/\n" +
                "    \\/___/  \\/___/  \\/_/\\/_/\\/___/      \\/___/  \\/__/\\/_/\\/_/   \\/___/\n" +
                "\n" +
                "================================================================================================");
                try{
                    jmlbukutotal += 1;
                    System.out.print("Input Judul Buku : \n> ");
                    String judul = input.next();
                    buku[jmlbukutotal - 1].setJudul(judul);
                    System.out.print("Input Pengarang Buku : \n> ");
                    String pengarang = input.next();
                    buku[jmlbukutotal - 1].setPengarang(pengarang);
                    System.out.print("input jumlah Halaman Buku : \n> ");
                    int halaman = input.nextInt();
                    buku[jmlbukutotal - 1].setHalaman(halaman);

                    int coinflip = data.nextInt(2) + 1;
                    if (coinflip == 1) {
                        buku[jmlbukutotal - 1] = new Buku(judul, pengarang, halaman,"Fiksi");
                        jmlfiksi += 1;
                        jmlhalfiksi += halaman;
                        jmlhal += halaman;
                    }
                    if (coinflip == 2) {
                        buku[jmlbukutotal - 1] = new Buku(judul, pengarang, halaman, "Non-Fiksi");
                        jmlnonfiksi += 1;
                        jmlhalnonfiksi += halaman;
                        jmlhal += halaman;
                    }
                }
                catch(Exception e){
                    run.main(args);
                }
            } 
            else if (pilihan == 2) {
                System.out.println("================================================================================================\n" +
                " __  __     ______     ______   __  __     ______        ______     __  __     __  __     __  __\n" +
                "/\\ \\_\\ \\   /\\  __ \\   /\\  == \\ /\\ \\/\\ \\   /\\  ___\\      /\\  == \\   /\\ \\/\\ \\   /\\ \\/ /    /\\ \\/\\ \\\n" +
                "\\ \\  __ \\  \\ \\  __ \\  \\ \\  _-/ \\ \\ \\_\\ \\  \\ \\___  \\     \\ \\  __<   \\ \\ \\_\\ \\  \\ \\  _\"-.  \\ \\ \\_\\ \\\n" +
                " \\ \\_\\ \\_\\  \\ \\_\\ \\_\\  \\ \\_\\    \\ \\_____\\  \\/\\_____\\     \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\\n" +
                "  \\/_/\\/_/   \\/_/\\/_/   \\/_/     \\/_____/   \\/_____/      \\/_____/   \\/_____/   \\/_/\\/_/   \\/_____/\n" +
                "\n" +
                "================================================================================================");
                System.out.println("Pilih Buku Yang Akan Diubah : ");
                for (int i = 0; i < jmlbukutotal; i++) {
                    System.out.println("[" + (i + 1) + "] " + buku[i].getJudul() + "\t| " + buku[i].getPengarang());
                }
                int UbahBuku = input.nextInt();
                System.out.print("Input Judul Buku : \n> ");
                String judul = input.next();
                buku[UbahBuku - 1].setJudul(judul);
                System.out.print("Input Pengarang Buku : \n> ");
                String pengarang = input.next();
                buku[UbahBuku - 1].setPengarang(pengarang);
                System.out.print("input Halaman Buku : \n> ");
                int halaman = input.nextInt();
                
                int halLama = buku[UbahBuku - 1].getHalaman();              
                buku[UbahBuku - 1].setHalaman(halaman);
                jmlhal = jmlhal - halLama + halaman;
                if (buku[UbahBuku - 1].getJenis() == "Fiksi") {
                    jmlhalfiksi = jmlhalfiksi - halLama + buku[UbahBuku-1].getHalaman();
                } 
                else {
                    jmlhalnonfiksi = jmlhalnonfiksi - halLama + buku[UbahBuku-1].getHalaman();
                }
                System.out.println("Pilih Buku Yang Akan Diubah : ");
            } 
            else if (pilihan == 3) {
                    System.out.println("================================================================================================\n" +
                " __  __     ______     ______     __  __        ______     __  __     __  __     __  __\n" +
                "/\\ \\/\\ \\   /\\  == \\   /\\  __ \\   /\\ \\_\\ \\      /\\  == \\   /\\ \\/\\ \\   /\\ \\/ /    /\\ \\/\\ \\\n" +
                "\\ \\ \\_\\ \\  \\ \\  __<   \\ \\  __ \\  \\ \\  __ \\     \\ \\  __<   \\ \\ \\_\\ \\  \\ \\  _\"-.  \\ \\ \\_\\ \\\n" +
                " \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_\\ \\_\\     \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\\n" +
                "  \\/_____/   \\/_____/   \\/_/\\/_/   \\/_/\\/_/      \\/_____/   \\/_____/   \\/_/\\/_/   \\/_____/\n" +
                "\n" +
                "================================================================================================");
                System.out.println("Pilih BOOK yang akan dihapus : ");
                for (int i = 0; i < jmlbukutotal; i++) {
                    System.out.println("[" + (i + 1) + "] " + buku[i].getJudul() + "\t| " + buku[i].getPengarang());
                }
                int hapus = input.nextInt();
                for (int i = hapus; i < jmlbukutotal; i++) {
                    buku[hapus-1]= buku[i];
                }
                jmlhal -= buku[hapus-1].getHalaman();
                if (buku[hapus-1].getJenis() == "Fiksi") {
                    jmlfiksi -= 1;
                    jmlhalfiksi -= buku[hapus-1].getHalaman();
                    jmlbukutotal-=1;
                }
                else {
                    jmlnonfiksi -= 1;
                    jmlhalnonfiksi -= buku[hapus-1].getHalaman();
                    jmlbukutotal-=1;
                }
            }
            else {
                pil = 0;
            }
        }   
    }
}