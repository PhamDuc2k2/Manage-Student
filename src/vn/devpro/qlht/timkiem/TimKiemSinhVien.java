package vn.devpro.qlht.timkiem;

import java.util.Scanner;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.DanhSachSinhVien;
import vn.devpro.qlht.hienthi.BangDiemSinhVien;

public class TimKiemSinhVien {
	private static Scanner sc = new Scanner(System.in);
	public static void thucThi() {
		System.out.print("\nNhap ma sinh vien can tim: ");
		int ma = Integer.parseInt(sc.nextLine());
		
		int index = DanhSachSinhVien.indexOf(ma);
		if(index == -1) {
			System.out.println("\t\tSinh vien khong ton tai");
			return;
		}
		BangDiemSinhVien bangDiem = new BangDiemSinhVien(DanhSachSinhVien.getList().get(index),DanhSachDiem.dsMhOfSv(ma)) ;
		bangDiem.xuat();
		
	}

}
