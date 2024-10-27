package nguyenHuuDuc_23699411;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	public abstract boolean isDatChuan();
	
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) throws Exception {
		if(maPhong != null)
			this.maPhong = maPhong;
		else 
			throw new Exception("Loi");
	}
	
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) throws Exception {
		if(dayNha != null)
			this.dayNha = dayNha;
		else
			throw new Exception("loi");
	}
	
	
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) throws Exception {
		if(dienTich > 0)
			this.dienTich = dienTich;
		else
			throw new Exception("Loi");
	}
	
	
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws Exception {
		if(soBongDen > 0)
			this.soBongDen = soBongDen;
		else
			throw new Exception("Loi");
	}
	
	String phongHocDatChuan = (isDatChuan())? "Phong Dat Chuan" : "Phong Khong Dat Chuan";
	public boolean duSang() {
		if(getDienTich() / getSoBongDen() <= 10) {
			return true;
		}else {
			return false;
		}
	}

	
	// tao constructor cho doi tuong
	
	public PhongHoc() {
		
	}
	
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	
	@Override
	public String toString() {
		String duSang = (duSang())? "Du Sang" : "Khong Du Sang";
		String s = "";
		s += String.format(" %s | %s | %s | %s | %s | %s |", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(), duSang, phongHocDatChuan);
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	
	
	
}
