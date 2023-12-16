package vn.devpro.qlht.hienthi;

import java.util.Scanner;

public class QuanLyHienThi {
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void thucThi() {
		
		do {
			System.out.println("\n---------- DANH SACH HIEN THI ----------");
			System.out.println("\t1. Hien thi danh sach theo sinh vien");
			System.out.println("\t2. Hien thi danh sach theo mon hoc");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban: ");
			
			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 1:
				HienThiSinhVien.thucThi();
				break;
			case 2:
				HienThiMonHoc.thucThi();
				break;
			case 0:
				return;
			default: System.out.println("\tLua chon khong hop le");
				break;
			}
		}while(true);
	}
	
}
