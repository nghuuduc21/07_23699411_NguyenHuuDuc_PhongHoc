package nguyenHuuDuc_23699411;

public class PhongMT extends PhongHoc {

	@Override
	public boolean isDatChuan() {
		return (duSang());
	}
	
	public double getSoMayTinh() {
		return getDienTich() / 1.5;
	}

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format(" %.0f", getSoMayTinh());
	}
	
		
	
}
