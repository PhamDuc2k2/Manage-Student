package vn.devpro.qlht.capnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
	private static Scanner sc = new Scanner(System.in);
	private static int autoNumber = 101;

	private static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

	public static ArrayList<SinhVien> getList() {
		return list;
	}

	public static void setList(ArrayList<SinhVien> list) {
		DanhSachSinhVien.list = list;
	}

	public static void init() {
		list.add(new SinhVien(autoNumber++, "Pham Van", "Duc", "2002", "Nam"));
		list.add(new SinhVien(autoNumber++, "Do Khanh", "Vinh", "2001", "Nam"));
		list.add(new SinhVien(autoNumber++, "Hoang Thu", "Trang", "2000", "Nu"));
		list.add(new SinhVien(autoNumber++, "Hoang Duc", "Hung", "2002", "Nam"));
		list.add(new SinhVien(autoNumber++, "Hoang Huu", "Duy", "2002", "Nam"));
	}

	public static void thucThi() {
		do {
			System.out.println("\n---------- DANH SACH SINH VIEN ----------");
			System.out.println("\t1. Them sinh vien moi");
			System.out.println("\t2. Sua thong tin sinh vien");
			System.out.println("\t3. Xoa sinh vien");
			System.out.println("\t4. Hien thi thong tin sinh vien");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");

			int luaChon = Integer.parseInt(sc.nextLine());

			switch (luaChon) {
			case 1:
				them();
				break;
			case 2:
				sua();
				break;
			case 3:
				xoa();
				break;
			case 4:
				hienThi();
				break;
			case 0:
				return;
			default:
				System.out.println("\tLua chon khong hop le");
				break;
			}
		} while (true);

	}

	private static void them() {
		System.out.println("\nNhap thong tin sinh vien moi: ");

		System.out.print("\tNhap ho dem sinh vien: ");
		String hoDem = sc.nextLine();
		if (hoDem.length() == 0) {
			System.out.println("\t\tHo dem khong duoc de trong");
			return;
		}

		System.out.print("\tNhap ten sinh vien: ");
		String ten = sc.nextLine();
		if (ten.length() == 0) {
			System.out.println("\t\tTen khong duoc de trong");
			return;
		}

		System.out.print("\tNhap nam sinh sinh vien: ");
		String namSinh = sc.nextLine();
		if (namSinh.length() == 0) {
			System.out.println("\t\tNam sinh khong duoc de trong");
			return;
		}

		System.out.print("\tNhap gioi tinh: ");
		String gioiTinh = sc.nextLine();
		if (gioiTinh.length() == 0) {
			System.out.println("\t\tGioi tinh khong duoc de trong");
			return;
		}

		list.add(new SinhVien(autoNumber++, hoDem, ten, namSinh, gioiTinh));
		System.out.println("\n\tDa them thanh cong");
	}

	private static void sua() {
		System.out.print("\nNhap ma sinh vien can sua thong tin: ");
		int ma = Integer.parseInt(sc.nextLine());
		int index = indexOf(ma);
		if (index == -1) {
			System.out.println("\tSinh vien chua co trong danh sach");
			return;
		}
		list.get(index).sua();
		System.out.println("\n\tDa sua thanh cong");
	}

	private static void xoa() {
		System.out.printf("\nNhap vao ma sinh vien muon xoa: ");
		int maSv = Integer.parseInt(sc.nextLine());
		int index = indexOf(maSv);
		if (index == -1) {
			System.out.println("\nSinh vien khong ton tai trong danh sach");
			return;
		}
		if (DanhSachDiem.indexOfSv(maSv) != -1) {
			System.out.println("\nSinh vien da co trong he thong bang diem");
			return;
		}
		list.remove(index);
		System.out.println("\n\tDa xoa thanh cong");
	}

	private static void hienThi() {
		sapXep();
		System.out.println("\n---------- DANH SÁCH SINH VIÊN ----------");
		System.out.printf("%n%3s %5s %-15s %-10s %8s %10s%n", "STT", "Ma SV", "Ho dem", "Ten", "Nam sinh", "Gioi tinh");
		int stt = 1;
		for (SinhVien sinhVien : list) {
			System.out.printf("%3d ", stt++);
			sinhVien.xuat();
		}
	}
	
	private static void sapXep() {
		Collections.sort(list, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getTen().trim().compareToIgnoreCase(o2.getTen().trim());
			}
		});
	}

	public static int indexOf(int ma) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getMa() == ma)
				return i;
		return -1;
	}
	
	public static SinhVien sinhVienOf(int ma) {
		for(SinhVien sinhVien: list) {
			if (sinhVien.getMa() == ma)
				return sinhVien;
		}
		return null;
	}

}
