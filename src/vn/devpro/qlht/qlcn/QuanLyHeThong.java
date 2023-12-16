package vn.devpro.qlht.qlcn;

import java.util.Scanner;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.DanhSachMonHoc;
import vn.devpro.qlht.capnhat.DanhSachSinhVien;
import vn.devpro.qlht.capnhat.QuanLyCapNhat;
import vn.devpro.qlht.hienthi.QuanLyHienThi;
import vn.devpro.qlht.timkiem.QuanLyTimKiem;

public class QuanLyHeThong {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		DanhSachSinhVien.init();
		DanhSachMonHoc.init();
		DanhSachDiem.init();
		
		do {
			System.out.println("\n========== CHUONG TRINH QUAN LY HE THONG ==========");
			System.out.println("Cac chuc nang he thong:");
			System.out.println("\t1. Cap nhat du lieu he thong");
			System.out.println("\t2. Hien thi du lieu he thong");
			System.out.println("\t3. Tim kiem du lieu he thong");
			System.out.println("\t0. Thoat chuong trinh");
			System.out.print("Lua chon cua ban: ");
			
			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 1:
				QuanLyCapNhat.thucThi();
				break;
			case 2:
				QuanLyHienThi.thucThi();
				break;
			case 3:
				QuanLyTimKiem.thucThi();
				break;
			case 0:
				System.out.println("\nThoat chuong trinh thanh cong!");
				System.exit(0);
				break;
			default:	System.out.println("Lua chon khong hop le");
				break;
			}
			
		}while(true);

	}
}
