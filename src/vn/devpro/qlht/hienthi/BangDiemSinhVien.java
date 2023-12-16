package vn.devpro.qlht.hienthi;

import java.util.ArrayList;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.MonHoc;
import vn.devpro.qlht.capnhat.SinhVien;

public class BangDiemSinhVien {
	private SinhVien sinhVien;
	private ArrayList<MonHoc> list;

	public BangDiemSinhVien() {
		super();
	}

	public BangDiemSinhVien(SinhVien sinhVien, ArrayList<MonHoc> list) {
		super();
		this.sinhVien = sinhVien;
		this.list = list;
	}

	public void xuat() {
		System.out.printf("%nMa sinh vien: %7d%n", sinhVien.getMa());
		System.out.println("Ho ten sinh vien: " + sinhVien.getHoDem() + " " + sinhVien.getTen());
		System.out.printf("%n%3s %6s %-20s %-8s %-5s%n", "STT", "Ma mon", "Ten mon", "He so", "Diem");
		int stt = 1;
		for (MonHoc monHoc : list) {
			System.out.printf("%3d ", stt++);
			System.out.printf("%6d %-20s %-8.2f ", monHoc.getMa(), monHoc.getTen(), monHoc.getHeSo());
			System.out.printf("%-5.2f%n",
					DanhSachDiem.getList().get(DanhSachDiem.indexOf(sinhVien.getMa(), monHoc.getMa())).getDiemSo());
		}
		System.out.printf("Tong diem: %25.2f%n%n", DanhSachDiem.diemTk(sinhVien.getMa()));
	}

}
