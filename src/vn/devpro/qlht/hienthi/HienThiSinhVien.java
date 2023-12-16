package vn.devpro.qlht.hienthi;

import java.util.ArrayList;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.DanhSachSinhVien;

public class HienThiSinhVien {
	private static ArrayList<BangDiemSinhVien> list = new ArrayList<BangDiemSinhVien>();

	public static void thucThi() {

		ArrayList<Integer> dsMaSv = DanhSachDiem.dsMaSv();
		for (Integer i : dsMaSv)
			list.add(new BangDiemSinhVien(DanhSachSinhVien.sinhVienOf(i), DanhSachDiem.dsMhOfSv(i)));
		System.out.println("\n---------- BANG DIEM SINH VIEN -----------");
		for (BangDiemSinhVien x : list) {
			x.xuat();
		}
	}

}
