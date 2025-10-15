/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
package baitap;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSachSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    public void xoaSach(String maSach) {
        Sach sachCanXoa = timKiem(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach can xoa!");
        }
    }

    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                System.out.println("Da cap nhat sach co ma: " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat!");
    }

    public Sach timKiem(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equals(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        System.out.println("\n====== DANH SACH SACH ======");
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
        }
        System.out.println("============================\n");
    }
}

