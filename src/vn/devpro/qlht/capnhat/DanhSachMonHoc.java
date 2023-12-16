package vn.devpro.qlht.capnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachMonHoc {

	private static Scanner sc = new Scanner(System.in);
	private static int autoNumber = 201;
	private static ArrayList<MonHoc> list = new ArrayList<MonHoc>();
	
	public static ArrayList<MonHoc> getList() {
		return list;
	}

	public static void setList(ArrayList<MonHoc> list) {
		DanhSachMonHoc.list = list;
	}

	public static void init() {
		list.add(new MonHoc(autoNumber++, "Lap trinh Java", 1));
		list.add(new MonHoc(autoNumber++, "Tieng anh CNTT", 5));
		list.add(new MonHoc(autoNumber++, "Lap trinh Python", 3));
		list.add(new MonHoc(autoNumber++, "Ky thuat lap trinh", 4));
		list.add(new MonHoc(autoNumber++, "Ung dung thuat toan", 3));
		list.add(new MonHoc(autoNumber++, "Toan roi rac", 2));
	}

	public static void thucThi() {
		do {
			System.out.println("\n---------- DANH SACH MON HOC ----------");
			System.out.println("\t1. Them mon hoc moi");
			System.out.println("\t2. Sua thong tin mon hoc");
			System.out.println("\t3. Xoa mon hoc");
			System.out.println("\t4. Hien thi thong tin mon hoc");
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
		System.out.print("\nNhap thong tin mon hoc moi: ");

		System.out.println("\tNhap ten mon hoc: ");
		String ten = sc.nextLine();
		if (ten.length() == 0) {
			System.out.println("\t\tTen khong duoc de trong");
			return;
		}

		System.out.println("\tNhap he so mon hoc: ");
		int heSo = Integer.parseInt(sc.nextLine());
		if (heSo <= 0) {
			System.out.println("\t\tDiem khong hop le");
			return;
		}

		list.add(new MonHoc(autoNumber++, ten, heSo));
		System.out.println("\n\tDa them thanh cong");

	}

	private static void sua() {
		System.out.print("\nNhap ma mon hoc can sua thong tin: ");
		int ma = Integer.parseInt(sc.nextLine());
		int index = indexOf(ma);
		if (index == -1) {
			System.out.println("\tMon hoc chua co trong danh sach");
			return;
		}
		list.get(index).sua();
		System.out.println("\n\tDa sua thanh cong");
	}

	private static void xoa() {
		System.out.printf("\nNhap vao ma sinh vien muon xoa: ");
		int maMh = Integer.parseInt(sc.nextLine());
		int index = indexOf(maMh);
		if(index == -1) {
			System.out.println("\nMon hoc khong ton tai trong danh sach");
			return;
		}
		if(DanhSachDiem.indexOfSv(maMh) != -1) {
			System.out.println("\nSinh vien da co trong he thong bang diem");
			return;
		}
		list.remove(index);
		System.out.println("\n\tDa xoa thanh cong");
	}

	private static void hienThi() {
		sapXep();
		System.out.println("\n---------- DANH SÁCH MON HOC ----------");
		System.out.printf("%n%3s %6s %-20s %5s%n", "STT", "Ma mon", "Ten mon", "He so");
		int stt = 1;
		for (MonHoc monHoc : list) {
			System.out.printf("%3d ", stt++);
			monHoc.xuat();
		}

	}
	
	private static void sapXep() {
		Collections.sort(list, new Comparator<MonHoc>() {
			@Override
			public int compare(MonHoc o1, MonHoc o2) {
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

	public static MonHoc monHocOf(int ma) {
		for(int i = 0 ; i < list.size(); i++) {
			if (list.get(i).getMa() == ma)
				return list.get(i);
		}
		return null;
	}
}
