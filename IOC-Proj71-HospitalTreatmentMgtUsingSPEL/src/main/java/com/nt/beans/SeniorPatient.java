package com.nt.beans;

import java.util.Date;

public class SeniorPatient {
	private String pid;
	private String pname;
	private Date billDate;
	private Float cardiologyTrtmntCharges;
	private Float neurologyTrtmntCharges;
	private Float angiplastyTrtmntCharges;
	private Float totalAmount;
	
	public SeniorPatient() {
		System.out.println("SeniorPatient.SeniorPatient()");
	}
	
	
	public String getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public Date getBillDate() {
		return billDate;
	}
	public Float getCardiologyTrtmntCharges() {
		return cardiologyTrtmntCharges;
	}
	public Float getNeurologyTrtmntCharges() {
		return neurologyTrtmntCharges;
	}
	public Float getAngiplastyTrtmntCharges() {
		return angiplastyTrtmntCharges;
	}
	public Float getTotalAmount() {
		return totalAmount;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public void setCardiologyTrtmntCharges(Float cardiologyTrtmntCharges) {
		this.cardiologyTrtmntCharges = cardiologyTrtmntCharges;
	}
	public void setNeurologyTrtmntCharges(Float neurologyTrtmntCharges) {
		this.neurologyTrtmntCharges = neurologyTrtmntCharges;
	}
	public void setAngiplastyTrtmntCharges(Float angiplastyTrtmntCharges) {
		this.angiplastyTrtmntCharges = angiplastyTrtmntCharges;
	}
	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "SeniorPatient [pid=" + pid + ", pname=" + pname + ", billDate=" + billDate
				+ ", cardiologyTrtmntCharges=" + cardiologyTrtmntCharges + ", neurologyTrtmntCharges="
				+ neurologyTrtmntCharges + ", angiplastyTrtmntCharges=" + angiplastyTrtmntCharges + ", totalAmount="
				+ totalAmount + "]";
	}

}
