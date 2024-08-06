package com.thaovu.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLiBan {

    //======================================= THUOC TINH
    private List<Ban> dsBan = new ArrayList<>();

    //======================================= PHUONG THUC
    //---------------------------- Phuong thuc khoi tao KHONG THAM SO
    public QuanLiBan() {
    }

    public Ban soSanhMaBan(int maBan) throws Exception
        {
       if (this.dsBan.stream().filter(e -> e.getMaBan() == maBan && e.isIsEmty() == true).findFirst().get() != null) {
            return this.dsBan.stream().filter(e -> e.getMaBan() == maBan && e.isIsEmty() == true).findFirst().get();
       } else {
         Ban a = this.dsBan.stream().filter(e -> e.getMaBan() == 1).findFirst().get();
            // a.setMaBan(0);
            a.hienThiBan();
            return a;
        }
    }

    //---------------------------- THEM theo cach DOC tu FILE
    public void them() throws FileNotFoundException {
        File f = new File("src/main/resources/text");
        Scanner cs = new Scanner(f);
        while (cs.hasNext()) {
            Ban b = new Ban();
            b.setSucChua(cs.nextInt());
            this.dsBan.add(b);
        }
        System.out.println("Them ban thanh cong");
    }

    //---------------------------- THEM ban tu ban da khai bao
    public void them(Ban... b) {
        this.dsBan.addAll(Arrays.asList(b));
    }

    //---------------------------- THEM MOT THAM SO (so luong ban can them) theo cach nhap SUC CHUA cua ban tu BAN PHIM
    public void them(int n) {
        for (int i = 0; i < n; i++) {

            System.out.printf("Nhap ban thu %d\n", i + 1);
            Ban b = new Ban();
            b.them();
            this.dsBan.add(b);
        }
        System.out.println("Them ban thanh cong");
    }

    //---------------------------- HIEN THI DS ban
    public void hienThiDsBanTrong() {
        if (this.dsBan != null) {
            this.dsBan.forEach(b -> b.hienThiBan());
        } else {
            System.out.println("Khong co ban de hien thi");
        }

    }

    //---------------------------- SAP XEP ban theo suc chua tu NHO den LON
    public void sapXep() {
        this.dsBan.sort((p, q) -> {
            return (p.getSucChua() > q.getSucChua() ? 1 : (p.getSucChua() < q.getSucChua() ? -1 : 0x0));
        });
    }

    //---------------------------- XOA ban theo SUC CHUA
    public void xoaTheoSucChua(int schua) {
        this.dsBan.removeIf(a -> a.getSucChua() == schua);
        System.out.println("Xoa ban thanh cong!!!");
    }

    //---------------------------- XOA ban theo MA BAN
    public void xoaTheoMaBan(int maBan) {
        this.dsBan.removeIf(a -> a.getMaBan() == maBan);
        System.out.println("Xoa ban thanh cong!!!");
    }

    // //---------------------------- XOA HET
    public void xoaHet() {
        this.dsBan = null;
        System.out.println("Xoa ban thanh cong!!!");
    }

    //---------------------------- TRA CUU ban theo MA BAN
    public Ban traCuuTheoMaBan(int maBan) {
        if (this.dsBan != null) {
            return this.dsBan.stream().filter(p -> p.getMaBan() == maBan).findFirst().get();
        }
        return null;
    }

    public List<Ban> traCuuTheoSucChua(int sucChua) {
        if (this.dsBan != null) {
            return this.dsBan.stream().filter(p -> p.getSucChua() == sucChua).collect(Collectors.toList());
        }
        return null;
    }

    //---------------------------- SUA suc chua theo MA BAN
    public void sua(int maBan, int sucChua) {
        Ban b = this.traCuuTheoMaBan(maBan);
        b.setSucChua(sucChua);
        System.out.println("Sua thanh cong!!!");
    }

    public List<Ban> getDsBan() {
        return dsBan;
    }

    public void setDsBan(List<Ban> dsBan) {
        this.dsBan = dsBan;
    }

}
