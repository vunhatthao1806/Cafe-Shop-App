/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DatBan {

    private int dem = 0;
    private int idBan;
    private String ten;
    private int soLuong;
    private Ban b;
//    private Menu m;
    protected List<MonAnDuocDat> monAnDuocDat = new ArrayList<>();
    private LocalDate ngayDat = LocalDate.now();//2022/12/11
    
    public DatBan() {
    }

    public DatBan(NhanVien nhanVien, int ban, int soLuong) {
        this.idBan = ban;
        this.soLuong = soLuong;
    }

    public DatBan(int ban, int soLuong) {
        this.idBan = ban;
        this.soLuong = soLuong;
    }

    public void datBan(QuanLiBan qlBan, QuanLiMenu qlMenu) throws Exception {
        String them;
        do {
            System.out.print("\nNhap ma ban muon dat(VD:001): ");
            this.idBan = Integer.parseInt(CauHinh.sc.nextLine());
            // System.out.println("\nThong tin ma ban ban dat");

            if (qlBan.soSanhMaBan(this.idBan).getMaBan() != 0) {
                this.b = qlBan.soSanhMaBan(this.idBan);
                this.b.hienThiBan();
            } else {

                System.out.println("Ban da nhap sai ma ban hoac nhap ma ban da duoc dat vui long nhap lai");
            }
            if (getB() != null) {
                getB().daDat();
            }
            System.out.println("");
            do {
                System.out.printf("==============================Nhap mon thu %d\n", ++dem);
                System.out.print("Nhap ten mon an(Thuc uong): ");
                this.setTen(CauHinh.sc.nextLine());
                Menu m = qlMenu.timKiemTheoTen(this.getTen());
                System.out.println("Thong tin mon ban da dat");
                m.hienThi();

                System.out.print("Nhap so luong: ");
                this.soLuong = Integer.parseInt(CauHinh.sc.nextLine());
                MonAnDuocDat datm = new MonAnDuocDat(m, this.soLuong);
                this.getMonAnDuocDat().add(datm);
                System.out.print("Ban muon nhap tiep khong (co/khong): ");
                them = CauHinh.sc.nextLine();
            } while (!"khong".equals(them));
        } while (this.getB() == null);

    }

    public void hienThi() {
        System.out.println("Thuc an ban da dat");
        this.b.hienThiBan();
        System.out.println("Thuc an ban da dat");
        this.getMonAnDuocDat().forEach(e -> e.hienThiDatMon());
        System.out.println("Ngay dat: " + CauHinh.formatter.format(ngayDat));
    }

    public int layThang() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String todayString = ngayDat.format(formatter);
        String[] a = todayString.split("/");
        return Integer.parseInt(a[1]);

    }

    /**
     * @return the nhanVien
     */
//    public NhanVien getNhanVien() {
//        return nhanVien;
//    }
    /**
     * @param nhanVien the nhanVien to set
     */
//    public void setNhanVien(NhanVien nhanVien) {
//        this.nhanVien = nhanVien;
//    }
    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the idBan
     */
    public int getIdBan() {
        return idBan;
    }

    /**
     * @param idBan the idBan to set
     */
    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the b
     */
    public Ban getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Ban b) {
        this.b = b;
    }

    /**
     * @return the monAnDuocDat
     */
    public List<MonAnDuocDat> getMonAnDuocDat() {
        return monAnDuocDat;
    }

    /**
     * @param monAnDuocDat the monAnDuocDat to set
     */
    public void setMonAnDuocDat(List<MonAnDuocDat> monAnDuocDat) {
        this.monAnDuocDat = monAnDuocDat;
    }

    /**
     * @return the ngayDat
     */
    public LocalDate getNgayDat() {
        return ngayDat;
    }

    /**
     * @param ngayDat the ngayDat to set
     */
    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }

}
