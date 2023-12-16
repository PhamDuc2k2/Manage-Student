package vn.devpro.qlht.timkiem;

import java.util.Scanner;

public class QuanLyTimKiem {
	private static Scanner sc = new Scanner(System.in);

	public static void thucThi() {

		do {
			System.out.println("\n---------- TIM KIEM ----------");
			System.out.println("\t1. Tim kiem sinh vien");
			System.out.println("\t2. Tim kiem mon hoc");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban: ");

			int luaChon = Integer.parseInt(sc.nextLine());
			
			switch (luaChon) {
			case 1:
				TimKiemSinhVien.thucThi();
				break;
			case 2:
				TimKiemMonHoc.thucThi();
				break;
			case 0:
				return;
			default: System.out.println("\tLua chon khong hop le");
				break;
			}
		} while (true);

	}

}
