package vn.devpro.qlht.capnhat;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachDiem {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Diem> list = new ArrayList<Diem>();

	public static ArrayList<Diem> getList() {
		return list;
	}

	public static void setList(ArrayList<Diem> list) {
		DanhSachDiem.list = list;
	}

	public static void init() {
		list.add(new Diem(DanhSachSinhVien.getList().get(0).getMa(), DanhSachMonHoc.getList().get(0).getMa(), 10));
		list.add(new Diem(DanhSachSinhVien.getList().get(3).getMa(), DanhSachMonHoc.getList().get(1).getMa(), 9.5));
		list.add(new Diem(DanhSachSinhVien.getList().get(1).getMa(), DanhSachMonHoc.getList().get(1).getMa(), 5));
		list.add(new Diem(DanhSachSinhVien.getList().get(1).getMa(), DanhSachMonHoc.getList().get(2).getMa(), 8.25));
		list.add(new Diem(DanhSachSinhVien.getList().get(2).getMa(), DanhSachMonHoc.getList().get(2).getMa(), 6.75));
		list.add(new Diem(DanhSachSinhVien.getList().get(0).getMa(), DanhSachMonHoc.getList().get(5).getMa(), 9));
		list.add(new Diem(DanhSachSinhVien.getList().get(3).getMa(), DanhSachMonHoc.getList().get(5).getMa(), 4));
		list.add(new Diem(DanhSachSinhVien.getList().get(3).getMa(), DanhSachMonHoc.getList().get(4).getMa(), 5.25));
		list.add(new Diem(DanhSachSinhVien.getList().get(4).getMa(), DanhSachMonHoc.getList().get(4).getMa(), 9.75));
		list.add(new Diem(DanhSachSinhVien.getList().get(4).getMa(), DanhSachMonHoc.getList().get(1).getMa(), 3.25));
	}

	public static void thucThi() {
		do {
			System.out.println("\n---------- DANH SACH DIEM ----------");
			System.out.println("\t1. Them thong tin diem moi");
			System.out.println("\t2. Sua thong tin diem");
			System.out.println("\t3. Xoa thong tin diem");
			System.out.println("\t4. Hien thi thong tin bang diem");
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

	private static void hienThi() {
		System.out.println("\n---------- BANG DIEM ----------");
		for (Diem diem : list)
			System.out.println(diem);
	}

	private static void them() {
		System.out.println("\nNhap thong tin diem moi: ");

		System.out.print("\tNhap ma sinh vien: ");
		int maSv = Integer.parseInt(sc.nextLine());
		int indexSv = DanhSachSinhVien.indexOf(maSv);
		if (indexSv == -1) {
			System.out.println("\t\tSinh vien chua co trong danh sach");
			return;
		}

		System.out.print("\tNhap ma mon hoc: ");
		int maMh = Integer.parseInt(sc.nextLine());
		int indexMh = DanhSachMonHoc.indexOf(maMh);
		if (indexMh == -1) {
			System.out.println("\t\tMon hoc chua co trong danh sach");
			return;
		}

		int index = indexOf(maSv, maMh);
		if (index != -1) {
			System.out.println("\t\tSinh vien da co diem mon hoc nay");
			return;
		}

		System.out.print("\tNhap diem: ");
		double diemSo = Double.parseDouble(sc.nextLine());
		if (diemSo < 0 || diemSo > 10) {
			System.out.println("\t\tDiem so nhap vao khong hop le");
			return;
		}
		list.add(new Diem(maSv, maMh, diemSo));
		System.out.println("\n\tDa them thanh cong!");

	}

	private static void sua() {
		System.out.print("\nNhap ma sinh vien can sua: ");
		int maSv = Integer.parseInt(sc.nextLine());
		int indexSv = DanhSachSinhVien.indexOf(maSv);
		if (indexSv == -1) {
			System.out.println("\t\tSinh vien chua co trong danh sach");
			return;
		}

		System.out.print("\nNhap ma mon hoc cua sinh can sua: ");
		int maMh = Integer.parseInt(sc.nextLine());
		int indexMh = DanhSachMonHoc.indexOf(maMh);
		if (indexMh == -1) {
			System.out.println("\t\tMon hoc chua co trong danh sach");
			return;
		}

		int index = indexOf(maSv, maMh);
		if (index == -1) {
			System.out.println("\t\tDu lieu chua co trong danh sach diem");
			return;
		}

		list.get(index).sua();
		System.out.println("\n\tDa sua thanh cong!");
	}

	private static void xoa() {
		System.out.print("\nNhap ma sinh vien: ");
		int maSv = Integer.parseInt(sc.nextLine());
		int indexSv = DanhSachSinhVien.indexOf(maSv);
		if (indexSv == -1) {
			System.out.println("\t\tSinh vien chua co trong danh sach");
			return;
		}

		System.out.print("\nNhap ma mon hoc: ");
		int maMh = Integer.parseInt(sc.nextLine());
		int indexMh = DanhSachMonHoc.indexOf(maMh);
		if (indexMh == -1) {
			System.out.println("\t\tMon hoc chua co trong danh sach");
			return;
		}

		int index = indexOf(maSv, maMh);
		if (index == -1) {
			System.out.println("\t\tDu lieu chua co trong danh sach diem");
			return;
		}
		list.remove(index);
		System.out.println("\n\tDa xoa thanh cong!");

	}

	public static int indexOf(int maSv, int maMh) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaMh() == maMh && list.get(i).getMaSv() == maSv)
				return i;
		}
		return -1;
	}

	public static int indexOfSv(int maSv) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getMaSv() == maSv)
				return i;
		return -1;
	}

	public static int indexOfMh(int maMh) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getMaMh() == maMh)
				return i;
		return -1;
	}

	public static double diemTk(int maSv) {
		double tong = 0;
		double tongHs = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaSv() == maSv) {
				tong += list.get(i).getDiemSo()
						* DanhSachMonHoc.getList().get(DanhSachMonHoc.indexOf(list.get(i).getMaMh())).getHeSo();
				tongHs += DanhSachMonHoc.getList().get(DanhSachMonHoc.indexOf(list.get(i).getMaMh())).getHeSo();

			}
		}
		return tong / tongHs;
	}

	public static double diemTb(int maMh) {
		double tong = 0;
		int soSv = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaMh() == maMh) {
				tong += list.get(i).getDiemSo();
				soSv++;
			}
		}
		return tong / soSv;
	}

// Phương thức trả về danh sách các sinh viên của môn học theo mã môn học
	public static ArrayList<SinhVien> dsSvOfMh(int ma) {
		ArrayList<SinhVien> listSv = new ArrayList<SinhVien>();
		for (Diem x : list) {
			if (x.getMaMh() == ma)
				listSv.add(DanhSachSinhVien.sinhVienOf(x.getMaSv()));
		}
		return listSv;
	}

	// Phuwong thức trả về 1 mảng các mã sinh viên tồn tại trong bảng điểm không lặp
	// lại
	public static ArrayList<Integer> dsMaSv() {
		ArrayList<Integer> listMaSv = new ArrayList<Integer>();
		for (int i = 0; i < DanhSachSinhVien.getList().size(); i++) {
			listMaSv.add(DanhSachSinhVien.getList().get(i).getMa());
		}

		int t = 0;
		for (int i = 0; i < listMaSv.size(); i++) {
			for (int j = 0; j < list.size(); j++)
				if (listMaSv.get(i) == list.get(j).getMaSv())
					t++;
			if (t == 0) {
				listMaSv.remove(i);
				i--;
			}
			t = 0;
		}
		return listMaSv;
	}

	// Phương thức trả về danh sách các môn của sinh viên theo mã sinh viên
	public static ArrayList<MonHoc> dsMhOfSv(int ma) {
		ArrayList<MonHoc> listMh = new ArrayList<MonHoc>();
		for (Diem x : list) {
			if (x.getMaSv() == ma)
				listMh.add(DanhSachMonHoc.monHocOf(x.getMaMh()));
		}
		return listMh;
	}

	// Phuwong thức trả về 1 mảng các mã môn học tồn tại trong bảng điểm không lặp
	// lại
	public static ArrayList<Integer> dsMaMh() {
		ArrayList<Integer> listMaMh = new ArrayList<Integer>();
		for (int i = 0; i < DanhSachMonHoc.getList().size(); i++) {
			listMaMh.add(DanhSachMonHoc.getList().get(i).getMa());
		}

		int t = 0;
		for (int i = 0; i < listMaMh.size(); i++) {
			for (int j = 0; j < list.size(); j++)
				if (listMaMh.get(i) == list.get(j).getMaMh())
					t++;
			if (t == 0) {
				listMaMh.remove(i);
				i--;
			}
			t = 0;
		}
		return listMaMh;
	}

}
