package nguyenHuuDuc_23699411;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_PhongHoc {

	List<PhongHoc> ls;

	public List_PhongHoc(List<PhongHoc> ls) {
		ls = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhong(PhongHoc p1) {
		if(ls.contains(p1) == true) {
			return false;
		}else {
			return ls.add(p1);
		}
	}
	
	public boolean xoaPhong(String maPhong) {
		
		for(PhongHoc p1 : ls) {
			if(p1.getMaPhong().equalsIgnoreCase(maPhong)) {
				ls.remove(p1);
				return true;
			}
		}
		return false;
	}
	
	public List<PhongHoc> inPhongHoc(){
		return ls;
	}
	
	public List<PhongHoc> dsPhongDatChuan(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		
		for(PhongHoc p1 : ls) 
			if(p1.isDatChuan()) 
				dsDC.add(p1);
			return dsDC;
	}
	
	public void sort() {
		
		Collections.sort(ls, new Comparator<PhongHoc>(){

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if(o1.getMaPhong() != o2.getMaPhong()) {
					return o1.getMaPhong().compareToIgnoreCase(o2.getMaPhong());
				}else {
					return  o2.getMaPhong().compareToIgnoreCase(o1.getMaPhong());
				}
			}	
		});
	}
	
	public boolean soBongDen(String maPhong , int soBong) throws Exception {
		
		for(PhongHoc p1 : ls) {
			if(p1.getMaPhong().equalsIgnoreCase(maPhong)) {
				p1.setSoBongDen(soBong);
				return true;
			}
		}
		return false;
	}
}
