/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Dell Vostro 3400
 */
public class NhanVien {

    public static int dem=0;
    private int maNV;
    {
        dem++;
        maNV=dem;
    }
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayVaoLam;
    protected BoPhan boPhan;

    public NhanVien(String hoten, String gioiTinh, String queQuan, String ngaySinh, String ngayVaoLam, BoPhan bophan) throws ParseException {
        this.hoTen = hoten;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = CauHinh.f.parse(ngaySinh);
        this.ngayVaoLam = CauHinh.f.parse(ngayVaoLam);
        this.boPhan = bophan;
    }
    public NhanVien() {
    }

    @Override
    public String toString() {
        return String.format("id: %d\nHo ten: %s\nQue quan: %s\nGioi tinh: %s\nNgay sinh: %s\nNgay vao lam: %s\n%d - %s\n", 
                this.getMaNV(), this.hoTen, this.queQuan,this.gioiTinh, 
                CauHinh.f.format(this.ngaySinh),CauHinh.f.format(this.ngayVaoLam), 
                this.boPhan.maBP, this.boPhan.tenBP);
    }
    public void nhapNV() throws ParseException{
        System.out.print("Ho ten: ");
        this.hoTen=CauHinh.sc.nextLine();
        System.out.print("Que quan: ");
        this.queQuan=CauHinh.sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh= CauHinh.sc.nextLine();
        System.out.print("Ngay sinh(dd/MM/yyyy): ");
        this.ngaySinh= CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("Ngay vao lam(dd/MM/yyyy): ");
        this.ngayVaoLam= CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("Bo phan: ");
        String a= CauHinh.sc.nextLine();
        System.out.print("Nhap cap(Tu quan li tro len nhap: 1, khong phai: 0): ");
        int capCao = Integer.parseInt(CauHinh.sc.nextLine());
        BoPhan b= new BoPhan(a, capCao);
        this.boPhan=b;
       
    }
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the que
     */
    /**
     * @return the boPhan
     */
    public BoPhan getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(BoPhan boPhan) {
        this.boPhan = boPhan;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVaoLam
     */
    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
}
