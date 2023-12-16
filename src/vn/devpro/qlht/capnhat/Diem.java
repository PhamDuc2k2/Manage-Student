package vn.devpro.qlht.capnhat;

import java.util.Scanner;

public class Diem {
	private int maSv;
	private int maMh;
	private double diemSo;

	private static Scanner sc = new Scanner(System.in);

	public Diem() {
		super();
	}

	public Diem(int maSv, int maMh, double diemSo) {
		super();
		this.maSv = maSv;
		this.maMh = maMh;
		this.diemSo = diemSo;
	}

	public void sua() {
		System.out.print("\nNhap diem moi: ");
		double diemSo = Double.parseDouble(sc.nextLine());
		if (diemSo < 0 || diemSo > 10) {
			System.out.println("\tDiem so nhap vao khong hop le");
			return;
		}
		this.diemSo = diemSo;
	}

	public int getMaSv() {
		return maSv;
	}

	public void setMaS(int maSv) {
		this.maSv = maSv;
	}

	public int getMaMh() {
		return maMh;
	}

	public void setMaMh(int maMh) {
		this.maMh = maMh;
	}

	public double getDiemSo() {
		return diemSo;
	}

	public void setDiemSo(double diemSo) {
		this.diemSo = diemSo;
	}

	@Override
	public String toString() {
		return "Diem [maSv=" + maSv + ", maMh=" + maMh + ", diemSo=" + diemSo + "]";
	}

}
