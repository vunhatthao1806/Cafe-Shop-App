/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

/**
 *
 * @author Dell Vostro 3400
 */
public class ThucAn extends Menu {

    private String chay;

    public ThucAn(String ten, double gia, String tinhTrang, String thoiDiem, String chay) {
        super(ten, gia, tinhTrang, thoiDiem);
        this.chay = chay;
    }

    @Override
    public void nhapMenu() {
        super.nhapMenu();
        System.out.print("Chay/Man: ");
        this.setChay(CauHinh.sc.nextLine());
    }

    public ThucAn() {
        super(null, 0, null, null);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Chay hay man: %s\n", this.getChay());
    }

    /**
     * @return the chay
     */
    public String getChay() {
        return chay;
    }

    /**
     * @param chay the chay to set
     */
    public void setChay(String chay) {
        this.chay = chay;
    }

    

}
