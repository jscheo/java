package ex07;

import java.util.Date;
import java.util.Objects;

public class SaleVO extends ProductVO{//상속받는다.
	private int scode;
	private int pcode;
	private int qnt;
	private int sprice;
	private Date sdate;
	
	public int getScode() {
		return scode;
	}
	public void setScode(int scode) {
		this.scode = scode;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public int getSprice() {
		return sprice;
	}
	public void setSprice(int sprice) {
		this.sprice = sprice;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pcode, qnt, scode, sdate, sprice);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleVO other = (SaleVO) obj;
		return pcode == other.pcode && qnt == other.qnt && scode == other.scode && Objects.equals(sdate, other.sdate)
				&& sprice == other.sprice;
	}
	
}