package vn.devpro.qlht.timkiem;

import java.util.Scanner;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.DanhSachMonHoc;
import vn.devpro.qlht.hienthi.BangDiemMonHoc;

public class TimKiemMonHoc {
	private static Scanner sc = new Scanner(System.in);
	public static void thucThi() {
		System.out.print("\nNhap ma sinh vien can tim: ");
		int ma = Integer.parseInt(sc.nextLine());
		
		int index = DanhSachMonHoc.indexOf(ma);
		if(index == -1) {
			System.out.println("\t\tMon hoc khong ton tai");
			return;
		}
		BangDiemMonHoc bangDiem = new BangDiemMonHoc(DanhSachMonHoc.getList().get(index), 
				DanhSachDiem.dsSvOfMh(ma)) ;
		bangDiem.xuat();
	}
	


}
