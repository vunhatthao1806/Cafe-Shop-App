/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QuanLiDoanhThu {

    private List<DatBan> dsDatBan = new ArrayList<>();

    public QuanLiDoanhThu() {
    }

    public void them(DatBan... a) {
        this.getDsDatBan().addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.getDsDatBan().forEach(e -> e.hienThi());

    }

    public double tongDoanhThu(int thang, QuanLiNhanVien qlNhanVien) {
        double sum = 0;
        NhanVien nhanVien;
        System.out.print("Nhap ma nhan vien: ");
        int ma = Integer.parseInt(CauHinh.sc.nextLine());
        nhanVien = qlNhanVien.soSanhMaNV(ma);
        if (nhanVien.boPhan.getCapCao() == 1) {
            HoaDon hoaDon = new HoaDon();

            for (DatBan x : getDsDatBan()) {
                if (x.layThang() == thang) {
                    //System.out.println(hoaDon.tinhTien(x));
                    sum += hoaDon.tinhTien(x);

                }

            }

        } else {
            System.out.println("Ban khong co quyen nay!!!");
        }
        return sum;
    }

    public double tongDoanhThu(String batDau, String ketThuc, QuanLiNhanVien qlNhanVien) {
        double sum = 0;
        NhanVien nhanVien;
        System.out.print("Nhap ma nhan vien: ");
        int ma = Integer.parseInt(CauHinh.sc.nextLine());
        nhanVien = qlNhanVien.soSanhMaNV(ma);
        if (nhanVien.boPhan.getCapCao() == 1) {
            DateTimeFormatter ngayDau = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dateTimeStart = LocalDate.parse(batDau, ngayDau);
            DateTimeFormatter ngayCuoi = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dateTimeEnd = LocalDate.parse(ketThuc, ngayCuoi);
            for (DatBan x : dsDatBan) {
                int x1 = x.getNgayDat().compareTo(dateTimeStart);
                int x2 = x.getNgayDat().compareTo(dateTimeEnd);
                if (x1 >= 0 && x2 <= 0) {
                    HoaDon hoaDon = new HoaDon();
                    sum += hoaDon.tinhTien(x);
                }
            }
        } else {
            System.out.println("Ban khong co quyen nay!!!");
        }

        return sum;

    }

    public DatBan soSanhMaBan(int mb) {
        return this.getDsDatBan().stream().filter(t -> t.getIdBan() == mb).findFirst().get();
    }

    /**
     * @return the dsDatBan
     */
    public List<DatBan> getDsDatBan() {
        return dsDatBan;
    }

    /**
     * @param dsDatBan the dsDatBan to set
     */
    public void setDsDatBan(List<DatBan> dsDatBan) {
        this.dsDatBan = dsDatBan;
    }

    /**
     * @return the hoaDon
     */
}
