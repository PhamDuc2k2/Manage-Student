package vn.devpro.qlht.capnhat;

import java.util.Scanner;

public class QuanLyCapNhat {
	
private static Scanner sc = new Scanner(System.in);
	
	public static void thucThi() {
		
		do {
			System.out.println("\n---------- CAP NHAT DU LIEU HE THONG ----------");
			System.out.println("\t1. Cap nhat danh sach sinh vien");
			System.out.println("\t2. Cap nhat danh sach mon hoc");
			System.out.println("\t3. Cap nhat bang diem");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban: ");
			
			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 1:
				DanhSachSinhVien.thucThi();
				break;
			case 2:
				DanhSachMonHoc.thucThi();
				break;
			case 3:
				DanhSachDiem.thucThi();
				break;
			case 0:
				return;
			default:	System.out.println("Lua chon khong hop le");
				break;
			}
			
		}while(true);
		
	}
	
}
