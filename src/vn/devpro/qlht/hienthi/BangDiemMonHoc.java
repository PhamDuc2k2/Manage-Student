package vn.devpro.qlht.hienthi;

import java.util.ArrayList;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.MonHoc;
import vn.devpro.qlht.capnhat.SinhVien;

public class BangDiemMonHoc {
	private MonHoc monHoc;
	private ArrayList<SinhVien> list;

	public BangDiemMonHoc() {
		super();
	}

	public BangDiemMonHoc(MonHoc monHoc, ArrayList<SinhVien> list) {
		super();
		this.monHoc = monHoc;
		this.list = list;
	}

	public void xuat() {
		System.out.println("\nMa mon hoc: " + monHoc.getMa());
		System.out.println("Ten mon hoc: " + monHoc.getTen());
		System.out.printf("%n%3s %5s %-20s %5s%n", "STT", "Ma SV", "Ho va ten", "Diem");
		int stt = 1;
		for (SinhVien sinhVien : list) {
			System.out.printf("%3d ", stt++);
			System.out.printf("%5d %-20s %5.2f%n", sinhVien.getMa(), sinhVien.getHoDem() + " " + sinhVien.getTen(),
					DanhSachDiem.getList().get(DanhSachDiem.indexOf(sinhVien.getMa(),monHoc.getMa())).getDiemSo());
		}
		System.out.printf("Diem trung binh mon: %15.2f%n%n", DanhSachDiem.diemTb(monHoc.getMa()));
	}
}
