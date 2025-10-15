/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Administrator
 */
package baitap;

public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2023, 10, "Cong nghe thong tin", "Dai hoc");
        SachGiaoTrinh sgk2 = new SachGiaoTrinh("GT02", "Toan cao cap", "Tran Van B", 2022, 5, "Toan hoc", "Dai hoc");
        SachTieuThuyet stt1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 2010, 20, "Thieu nhi", true);
        SachTieuThuyet stt2 = new SachTieuThuyet("TT02", "Tram nam co don", "Gabriel Garcia Marquez", 1967, 3, "Hien thuc huyen ao", false);
        ql.themSach(sgk1);
        ql.themSach(sgk2);
        ql.themSach(stt1);
        ql.themSach(stt2);
        ql.hienThiDanhSach();
        System.out.println("Ket qua tim kiem 'TT01': " + ql.timKiem("TT01"));
        SachTieuThuyet moi = new SachTieuThuyet("TT02", "Tram nam co don (Tai ban)", "Gabriel G. Marquez", 2024, 5, "Hien thuc huyen ao", false);
        ql.capNhatSach("TT02", moi);
        ql.xoaSach("GT02");
        ql.hienThiDanhSach();
    }
}
