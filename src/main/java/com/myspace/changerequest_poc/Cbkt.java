package com.myspace.changerequest_poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Cán bộ kỹ thuật")
public class Cbkt implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Đơn vị nhận yêu cầu")
	private java.lang.String donvi;
	@org.kie.api.definition.type.Label(value = "Tổng số manday thực hiện")
	private java.lang.Integer manday;
	@org.kie.api.definition.type.Label(value = "Ngày nhân yêu cầu")
	private java.util.Date ngaynhan;
	@org.kie.api.definition.type.Label(value = "Phát sinh chi phí/thuê ngoài")
	private java.lang.String phatsinh;

	public Cbkt() {
	}

	public java.lang.String getDonvi() {
		return this.donvi;
	}

	public void setDonvi(java.lang.String donvi) {
		this.donvi = donvi;
	}

	public java.lang.Integer getManday() {
		return this.manday;
	}

	public void setManday(java.lang.Integer manday) {
		this.manday = manday;
	}

	public java.util.Date getNgaynhan() {
		return this.ngaynhan;
	}

	public void setNgaynhan(java.util.Date ngaynhan) {
		this.ngaynhan = ngaynhan;
	}

	public java.lang.String getPhatsinh() {
		return this.phatsinh;
	}

	public void setPhatsinh(java.lang.String phatsinh) {
		this.phatsinh = phatsinh;
	}

	public Cbkt(java.lang.String donvi, java.lang.Integer manday,
			java.util.Date ngaynhan, java.lang.String phatsinh) {
		this.donvi = donvi;
		this.manday = manday;
		this.ngaynhan = ngaynhan;
		this.phatsinh = phatsinh;
	}

}