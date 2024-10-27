package nguyenHuuDuc_23699411;

public class PhongLT extends PhongHoc {

	@Override
	public boolean isDatChuan() {
		return (duSang() && isMayChieu());
	}
	
	private boolean mayChieu;

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	
	@Override
	public String toString() {
		String mayChieu = (isMayChieu())? "Co May Chieu" : "Khong May Chieu";
		return super.toString() + String.format(" %s",mayChieu );
	}
	

}
