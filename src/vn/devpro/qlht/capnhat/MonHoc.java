package vn.devpro.qlht.capnhat;

import java.util.Scanner;

public class MonHoc {

	private int ma;
	private String ten;
	private double heSo;
	

	private static Scanner sc = new Scanner(System.in);

	public MonHoc() {
		super();
	}

	public MonHoc(int ma, String ten, double heSo) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.heSo = heSo;
	}

	public void xuat() {
		System.out.printf("%6d %-20s %5.2f%n", ma, ten, heSo);
	}

	public void sua() {
		do {
			System.out.println("\n---------- SUA THONG TIN MON HOC ----------");
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
		suaTen();
		suaHeSo();
	}

	private void suaMotTt() {

		do {
			System.out.println("\n---------- SUA MOT THONG TIN SINH VIEN ----------");
			System.out.println("\t1. Sua ten mon hoc");
			System.out.println("\t2. Sua he so mon");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int luaChon = Integer.parseInt(sc.nextLine());

			switch (luaChon) {
			case 1:
				suaTen();
				break;
			case 2:
				suaHeSo();
			default:
				System.out.println("\tLua chon khong hop le");
				break;
			}
		} while (true);

	}

	private void suaTen() {
		System.out.println("\n\tNhap ten mon hoc: ");
		String ten = sc.nextLine();
		if (ten.length() == 0) {
			System.out.println("\t\tTen khong duoc de trong");
			return;
		}
		this.ten = ten.trim();
	}

	private void suaHeSo() {
		System.out.println("\n\tNhap he so mon hoc: ");
		int heSo = Integer.parseInt(sc.nextLine());
		if (heSo <= 0) {
			System.out.println("\tThong tin mon hoc nhap vao khong hop le");
			return;
		}
		this.heSo = heSo;
	}

	public int getMa() {
		return ma;
	}

	public void setCode(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getHeSo() {
		return heSo;
	}

	public void setHeSo(double heSo) {
		this.heSo = heSo;
	}

}
