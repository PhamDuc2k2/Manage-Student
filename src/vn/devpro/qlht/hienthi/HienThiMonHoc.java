package vn.devpro.qlht.hienthi;

import java.util.ArrayList;

import vn.devpro.qlht.capnhat.DanhSachDiem;
import vn.devpro.qlht.capnhat.DanhSachMonHoc;

public class HienThiMonHoc {
	private static ArrayList<BangDiemMonHoc> list = new ArrayList<BangDiemMonHoc>();

	public static void thucThi() {
		ArrayList<Integer> dsMaMh = DanhSachDiem.dsMaMh();
		for (int i = 0; i < dsMaMh.size(); i++)
			list.add(new BangDiemMonHoc(DanhSachMonHoc.monHocOf(dsMaMh.get(i)),
					DanhSachDiem.dsSvOfMh(dsMaMh.get(i))));
		
		System.out.println("\n---------- BANG DIEM MON HOC -----------");
		for (BangDiemMonHoc x : list) {
			x.xuat();
		}
	}

}
