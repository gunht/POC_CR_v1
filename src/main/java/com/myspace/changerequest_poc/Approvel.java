package com.myspace.changerequest_poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Approvel implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Phê duyệt")
	private java.lang.String pheduyet;
	@org.kie.api.definition.type.Label(value = "Ghi chú")
	private java.lang.String ghichu;

	public Approvel() {
	}

	public java.lang.String getPheduyet() {
		return this.pheduyet;
	}

	public void setPheduyet(java.lang.String pheduyet) {
		this.pheduyet = pheduyet;
	}

	public java.lang.String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(java.lang.String ghichu) {
		this.ghichu = ghichu;
	}

	public Approvel(java.lang.String pheduyet, java.lang.String ghichu) {
		this.pheduyet = pheduyet;
		this.ghichu = ghichu;
	}

}