/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

/**
 *
 * @author Dell Vostro 3400
 */
public class Menu {

    protected String ten;
    protected double gia;
    protected String tinhTrang;
    protected String thoiDiem;

    public Menu(String ten, double gia, String tinhTrang, String thoiDiem) {
        this.ten = ten;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
        this.thoiDiem = thoiDiem;
    }
    public Menu() {
        
    }

    public void hienThi() {
        System.out.println("");
        System.out.printf("Ten: %s\nGia:%.1f\nTinh trang: %s\nThoi diem ban: %s\n", this.ten, this.gia, this.tinhTrang, this.thoiDiem);
    }

    public void nhapMenu() {
        System.out.print("Ten: ");
        this.ten = CauHinh.sc.nextLine();
        System.out.print("Gia: ");
        this.gia = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Tinh trang(con hay het): ");
        this.tinhTrang = CauHinh.sc.nextLine();
        System.out.print("Thoi diem ban(sang/trua/toi): ");
        this.thoiDiem = CauHinh.sc.nextLine();
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
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the thoiDiem
     */
    public String getThoiDiem() {
        return thoiDiem;
    }

    /**
     * @param thoiDiem the thoiDiem to set
     */
    public void setThoiDiem(String thoiDiem) {
        this.thoiDiem = thoiDiem;
    }
}
