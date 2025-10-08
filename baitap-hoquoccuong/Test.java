package baitap;

public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2023, 10);
        sach1.hienThiThongTin();

        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu và giải thuật");
        sach2.setTacGia("Trần Văn B");
        sach2.setNamXuatBan(2022);
        sach2.setSoLuong(5);
        sach2.hienThiThongTin();
    }
}
