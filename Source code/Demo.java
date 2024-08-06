/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.thaovu.demo;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author Dell Vostro 3400
 */
public class Demo {

    public static int chon = 0;
    public static int option = 0;
    public static boolean flagtong = true;
    public static int option1 = 0;
    public static boolean flag = true;
    public static boolean flag1 = true;

    public static void main(String[] args) throws ParseException, FileNotFoundException, Exception {
        BoPhan f = new BoPhan("Dau Bep", 0);
        BoPhan g = new BoPhan("Phuc Vu", 1);
        NhanVien e1 = new NhanVien("Nguyen Van A", "Nam", "Can Tho", "2/12/1999", "1/1/2020", f);
        NhanVien e2 = new NhanVien("Nguyen Van B", "Nam", "Can Tho", "1/12/1999", "1/1/2020", f);
        NhanVien e3 = new NhanVien("Nguyen Thi C", "Nu", "Can Tho", "2/1/1999", "1/1/2020", g);
        Menu a = new ThucAn("Mi", 10000, "Con", "Sang", "chay");
        Menu b = new ThucAn("Com suon", 25000, "Con", "Trua", "chay");
        Menu c = new ThucAn("Bun", 30000, "Het", "Toi", "Man");
        Menu d = new ThucUong("Coca", 10000, "Con", "Trua", "Da");
        Menu h = new ThucUong("Pepsi", 10000, "Con", "Trua", "Da");
        Menu e = new ThucAn("Com ga", 25000, "Con", "Trua", "chay");
        Ban b1 = new Ban(4);
        Ban b2 = new Ban(6);
        Ban b3 = new Ban(4);
        Ban b4 = new Ban(8);
        QuanLiBan dsBan = new QuanLiBan();
        QuanLiMenu dsMenu = new QuanLiMenu();
        QuanLiNhanVien dsNV = new QuanLiNhanVien();
        QuanLiDoanhThu dsDB = new QuanLiDoanhThu();
        dsMenu.themdsMenu(a, b, c, d, e, h);
        dsNV.themNV(e1, e2, e3);
        dsBan.them(b1, b2, b3, b4);

        do {
            do {
                System.out.println("Ban la Nhan vien hay Khach hang?");
                System.out.println("1.Nhan vien\n2.Khach hang");
                System.out.println("3.Ket thuc");
                System.out.print("Nhap lua chon: ");
                chon = Integer.parseInt(CauHinh.sc.nextLine());
                switch (chon) {
                    case 1 -> {
                        do {
                            System.out.println("===MENU===");
                            System.out.println("1.Xem danh sach nhan vien");
                            System.out.println("2.Tra cuu thong tin nhan vien");
                            System.out.println("3.Them nhan vien");
                            System.out.println("4.Cap nhat thong tin nhan vien");
                            System.out.println("5.Xoa thong tin nhan vien");
                            System.out.println("6.Xuat danh sach nhan vien co sinh nhat trong thang hien tai");
                            System.out.println("7.Them thong tin ban");
                            System.out.println("8.Cap nhat thong tin ban");
                            System.out.println("9.Xoa thong tin ban");
                            System.out.println("10.Tim kiem ban theo suc chua");
                            System.out.println("11.Them thuc an/thuc uong");
                            System.out.println("12.Xoa thuc an/thuc uong");
                            System.out.println("13.Thanh toan hoa don");
                            System.out.println("14.Thong ke doanh thu");
                            System.out.println("15.Ket thuc");
                            System.out.print("Nhap lua chon: ");
                            option = Integer.parseInt(CauHinh.sc.nextLine());
                            switch (option) {
                                case 1 ->
                                    dsNV.hienThiDsNhanVien();
                                case 2 -> {
                                    do {

                                        System.out.println("===MENU 1===");
                                        System.out.println("1.Tra cuu theo ten");
                                        System.out.println("2.Tra cuu theo gioi tinh");
                                        System.out.println("3.Tra cuu theo que quan");
                                        System.out.println("4.Tra cuu theo ngay sinh");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap ten can tra cuu: ");
                                                String ten = CauHinh.sc.nextLine();
                                                List<NhanVien> kq = dsNV.traCuuTheoTen(ten);
                                                kq.forEach(p -> System.out.println(p));
                                                if (kq.isEmpty()) {
                                                    System.out.println("Ten da nhap khong ton tai");
                                                }
                                            }
                                            case 2 -> {
                                                System.out.print("Nhap gioi tinh can tra cuu: ");
                                                String gt = CauHinh.sc.nextLine();
                                                List<NhanVien> kq = dsNV.traCuuTheoGioiTinh(gt);
                                                kq.forEach(p -> System.out.println(p));
                                                if (kq.isEmpty()) {
                                                    System.out.println("Gioi tinh da nhap khong ton tai");
                                                }
                                            }
                                            case 3 -> {
                                                System.out.print("Nhap que quan can tra cuu: ");
                                                String qq = CauHinh.sc.nextLine();
                                                List<NhanVien> kq = dsNV.traCuuTheoQueQuan(qq);
                                                kq.forEach(p -> System.out.println(p));
                                                if (kq.isEmpty()) {
                                                    System.out.println("Que quan da nhap khong ton tai");
                                                }
                                            }
                                            case 4 -> {
                                                System.out.print("Nhap ngay sinh can tra cuu: ");
                                                String ns = CauHinh.sc.nextLine();
                                                List<NhanVien> kq = dsNV.tracuuTheoNgaySinh(ns);
                                                kq.forEach(p -> System.out.println(p));
                                                if (kq.isEmpty()) {
                                                    System.out.println("Ngay sinh da nhap khong ton tai");
                                                }
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 3 -> {
                                    System.out.print("Nhap so nhan vien muon them: ");
                                    int sl = Integer.parseInt(CauHinh.sc.nextLine());
                                    dsNV.themNV(sl);
                                }
                                case 4 -> {
                                    dsNV.capNhat();
                                }
                                case 5 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("===MENU 2===");
                                        System.out.println("1.Xoa theo ma nhan vien");
                                        System.out.println("2.Xoa theo ten nhan vien");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());

                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap ma nhan vien can xoa: ");
                                                int id = Integer.parseInt(CauHinh.sc.nextLine());
                                                dsNV.xoaDsNhanVien(id);
                                            }
                                            case 2 -> {
                                                System.out.print("Nhap ten nhan vien can xoa: ");
                                                String ten = CauHinh.sc.nextLine();
                                                dsNV.xoaDsNhanVien(ten);
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 6 -> {
                                    List<NhanVien> kq= dsNV.toChucSinhNhat();
                                    if(kq!=null)
                                    dsNV.toChucSinhNhat().forEach(p -> System.out.println(p));
                                }
                                case 7 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("1.Them thong tin ban nhap tu ban phim");
                                        System.out.println("2.Doc file de them thong tin ban");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap so luong ban muon them: ");
                                                int sl = Integer.parseInt(CauHinh.sc.nextLine());
                                                dsBan.them(sl);
                                            }
                                            case 2 ->
                                                dsBan.them();
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 8 -> {
                                    System.out.print("Nhap ma ban can sua: ");
                                    int mb = Integer.parseInt(CauHinh.sc.nextLine());
                                    System.out.print("Nhap suc chua can sua: ");
                                    int sc = Integer.parseInt(CauHinh.sc.nextLine());
                                    dsBan.sua(mb, sc);
                                }
                                case 9 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("1.Xoa theo ma ban");
                                        System.out.println("2.Xoa theo suc chua");
                                        System.out.println("3.Xoa tat ca ban");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap ma ban muon xoa: ");
                                                int mb1 = Integer.parseInt(CauHinh.sc.nextLine());
                                                dsBan.xoaTheoMaBan(mb1);
                                            }
                                            case 2 -> {
                                                System.out.print("Nhap suc chua muon xoa: ");
                                                int sc1 = Integer.parseInt(CauHinh.sc.nextLine());
                                                dsBan.xoaTheoSucChua(sc1);
                                            }
                                            case 3 -> {
                                                dsBan.xoaHet();
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 10 -> {
                                    System.out.print("Nhap suc chua can tra cuu: ");
                                    int sc2 = Integer.parseInt(CauHinh.sc.nextLine());
                                    List<Ban> kq = dsBan.traCuuTheoSucChua(sc2);
                                    kq.forEach(t -> t.hienThiBan());
                                    if (kq.isEmpty()) {
                                        System.out.println("Suc chua khong ton tai!!!");
                                    }
                                }
                                case 11 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("Ban muon them thuc an hay thuc uong?");
                                        System.out.printf("1.Thuc an\n2.Thuc uong\n");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap so luong thuc an muon them: ");
                                                int sl = Integer.parseInt(CauHinh.sc.nextLine());
                                                dsMenu.themdsMenuThucAn(sl);
                                            }
                                            case 2 -> {
                                                
                                                System.out.print("Nhap so luong thuc uong muon them: ");
                                                int sl1 = Integer.parseInt(CauHinh.sc.nextLine());
                                                dsMenu.themdsMenuThucUong(sl1);
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);

                                }
                                case 12 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("1.Xoa theo ten");
                                        System.out.println("2.Xoa theo gia");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap ten thuc an/thuc uong muon xoa: ");
                                                String t = CauHinh.sc.nextLine();
                                                dsMenu.xoaDsMenu(t);
                                            }
                                            case 2 -> {
                                                System.out.print("Nhap gia thuc an/thuc uong muon xoa: ");
                                                double gia = Double.parseDouble(CauHinh.sc.nextLine());
                                                dsMenu.xoaDsMenu(gia);
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 13 -> {
                                    System.out.print("Nhap ma ban muon thanh toan: ");
                                    int mb = Integer.parseInt(CauHinh.sc.nextLine());
                                    DatBan t = dsDB.soSanhMaBan(mb);
                                    HoaDon ttHoaDon = new HoaDon();
                                    System.out.println("Tong tien ban phai tren ban "+mb+": " + ttHoaDon.tinhTien(t));
                                }
                                case 14 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("1.Thong ke doanh thu theo thang");
                                        System.out.println("2.Thong ke doanh thu theo khoang thoi gian chi dinh");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                dsDB.hienThi();
                                                System.out.print("Nhap thang muon tinh doanh thu: ");
                                                int t = Integer.parseInt(CauHinh.sc.nextLine());
                                                double tien = dsDB.tongDoanhThu(t, dsNV);
                                                if (tien != 0) {
                                                    System.out.println("Doanh thu thang " + t + ": " + tien);
                                                }
                                            }
                                            case 2 -> {
                                                System.out.print("Nhap ngay bat dau: ");
                                                String start = CauHinh.sc.nextLine();
                                                System.out.print("Nhap ngay ket thuc: ");
                                                String end = CauHinh.sc.nextLine();
                                                double tien = dsDB.tongDoanhThu(start, end, dsNV);
                                                if (tien != 0) {
                                                    System.out.println("Doanh thu tu ngay " + start + " den ngay " + end + ": " + tien);
                                                }
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);

                                }

                                case 15 -> {
                                    System.out.println("Cam on da su dung!!!");
                                    flag = false;
                                }

                            }
                        } while (flag);

                    }
                    case 2 -> {
                        flag = true;
                        do {
                            System.out.println("===MENU===");
                            System.out.println("1.Tim kiem thuc an/thuc uong");
                            System.out.println("2.Sap xep danh sach thuc an/thuc uong");
                            System.out.println("3.Xem danh sach menu");
                            System.out.println("4.Dat ban");                          
                            System.out.println("5.Ket thuc");
                            System.out.print("Nhap lua chon: ");
                            option = Integer.parseInt(CauHinh.sc.nextLine());
                            switch (option) {
                                case 1 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.printf("1.Tim kiem theo ten\n2.Tim kiem theo khoang gia\n");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                System.out.print("Nhap ten mon an can tim: ");
                                                String t = CauHinh.sc.nextLine();
                                                List<Menu> kq = dsMenu.timKiem(t);
                                                kq.forEach(p -> p.hienThi());
                                            }
                                            case 2 -> {
                                                System.out.print("Tu gia: ");
                                                double begin = Double.parseDouble(CauHinh.sc.nextLine());
                                                System.out.print("Den gia: ");
                                                double end = Double.parseDouble(CauHinh.sc.nextLine());
                                                List<Menu> kq = dsMenu.timKiem(begin, end);
                                                kq.forEach(p -> p.hienThi());
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 2 -> {
                                    option1 = 0;
                                    flag1 = true;
                                    do {
                                        System.out.println("1.Giam theo gia");
                                        System.out.println("2.Giam theo gia tuy chon");
                                        System.out.print("Nhap lua chon: ");
                                        option1 = Integer.parseInt(CauHinh.sc.nextLine());
                                        switch (option1) {
                                            case 1 -> {
                                                dsMenu.sapXep();
                                                dsMenu.hienThiDsMenu();
                                            }
                                            case 2 -> {
                                                dsMenu.sapXepTuyChon();
                                            }
                                            default ->
                                                flag1 = false;
                                        }
                                    } while (flag1);
                                }
                                case 3 -> {
                                    System.out.println("==Danh sach thuc don==");
                                    dsMenu.hienThiDsMenu();
                                }
                                //Chua xong
                                case 4 -> {
                                    System.out.println("==Danh sach ban trong==");
                                    dsBan.hienThiDsBanTrong();

                                    DatBan d1 = new DatBan();
                                    dsDB.them(d1);
                                    d1.datBan(dsBan, dsMenu);
                                }

                                case 5 -> {
                                    System.out.println("Cam on da su dung!!!");
                                    flag = false;
                                }

                            }
                        } while (flag);
                    }
                    case 3 -> {
                        flagtong = false;
                        System.out.println("Cam on da su dung!!!");
                    }
                }

            } while (flagtong);
            if (chon != 1 && chon != 2 && chon != 3) {
                System.out.println("Nhap khong hop le vui long nhap lai 1/2!!!");
            }
        } while (chon != 1 && chon != 2 && chon != 3);
    }

}
