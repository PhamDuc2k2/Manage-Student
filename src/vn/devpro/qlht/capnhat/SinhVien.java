package vn.devpro.qlht.capnhat;

import java.util.Scanner;

public class SinhVien {
	private int ma;
	private String hoDem;
	private String ten;
	private String namSinh;
	private String gioiTinh;

	private static Scanner sc = new Scanner(System.in);

	public SinhVien() {
		super();
	}

	public SinhVien(int ma, String hoDem, String ten, String namSinh, String gioiTinh) {
		super();
		this.ma = ma;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

	public void xuat() {
		System.out.printf("%5s %-15s %-10s %8s %10s%n", ma, hoDem, ten, namSinh, gioiTinh);
	}

	public void sua() {

		do {
			System.out.println("\n---------- SUA THONG TIN SINH VIEN ----------");
			System.out.println("\t1. Sua toan bo thong tin");
			System.out.println("\t2. Sua mot thong tin");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban: ");

			int luaChon = Integer.parseInt(sc.nextLine());

			switch (luaChon) {
			case 1:
				suaToanBo();
				break;
			case 2:
				suaMotTt();
				break;
			case 0:
				return;
			default:
				System.out.println("\tLua chon khong hop le");
				break;
			}

		} while (true);

	}

	private void suaToanBo() {
		suaHoDem();
		suaTen();
		suaNamSinh();
		suaGioiTinh();
	}

	private void suaMotTt() {

		do {
			System.out.println("\n---------- SUA MOT THONG TIN SINH VIEN ----------");
			System.out.println("\t1. Sua ho dem");
			System.out.println("\t2. Sua ten");
			System.out.println("\t3. Sua nam sinh");
			System.out.println("\t4. Sua gioi tinh");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int luaChon = Integer.parseInt(sc.nextLine());

			switch (luaChon) {
			case 1:
				suaHoDem();
				break;
			case 2:
				suaTen();
				break;
			case 3:
				suaNamSinh();
				break;
			case 4:
				suaGioiTinh();
				break;
			case 0:
				return;
			default:
				System.out.println("\tLua chon khong hop le");
				break;
			}
		} while (true);
	}

	private void suaHoDem() {
		System.out.print("\n\tNhap ho dem sinh vien: ");
		String hoDem = sc.nextLine();
		if (hoDem.length() == 0) {
			System.out.println("\tHo dem khong duoc de trong");
			return;
		}
		this.hoDem = hoDem.trim();
	}

	private void suaTen() {
		System.out.print("\n\tNhap ten sinh vien: ");
		String ten = sc.nextLine();
		if (ten.length() == 0) {
			System.out.println("\tTen khong duoc de trong");
			return;
		}
		this.ten = ten.trim();
	}

	private void suaNamSinh() {
		System.out.print("\n\tNhap nam sinh sinh vien: ");
		String namSinh = sc.nextLine();
		if (namSinh.length() == 0) {
			System.out.println("\tNam sinh khong duoc de trong");
			return;
		}
		this.namSinh = namSinh.trim();
	}

	private void suaGioiTinh() {
		System.out.print("\n\tNhap gioi tinh: ");
		String gioiTinh = sc.nextLine();
		if (gioiTinh.length() == 0) {
			System.out.println("\tGioi tinh khong duoc de trong");
			return;
		}
		this.gioiTinh = gioiTinh.trim();
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

}
