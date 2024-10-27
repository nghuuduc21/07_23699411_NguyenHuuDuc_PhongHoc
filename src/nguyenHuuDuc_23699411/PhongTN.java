package nguyenHuuDuc_23699411;

public class PhongTN extends PhongHoc {

	@Override
	public boolean isDatChuan() {
		return (duSang() && isBonRua());
	}
	
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) throws Exception {
		if(chuyenNganh != null)
			this.chuyenNganh = chuyenNganh;
		else
			throw new Exception("Loi");
	}
	
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) throws Exception {
		if(sucChua > 0)
			this.sucChua = sucChua;
		else
			throw new Exception("Loi");
	}
	
	public boolean isBonRua() {
		return bonRua;
	}
	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	
	
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	
	@Override
	public String toString() {
		String bonRua = (isBonRua())? "Co Bon Rua": "Khong Co Bon Rua";
		String s2 = "";
		s2 += String.format(" %s | %s | %s |", getChuyenNganh(), getSucChua(), bonRua);
		return super.toString();
	}
	
	
}
