package com.kk.springprimitiveDI.beans;

import java.util.Date;
import java.util.Objects;

public class Customer {

	private String name;
	// private Date dob;
	private String kyc;
	private long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public Date getDob() { return dob; }
	 * 
	 * public void setDob(Date dob) { this.dob = dob; }
	 */

	public String getKyc() {
		return kyc;
	}

	public void setKyc(String kyc) {
		this.kyc = kyc;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kyc, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(kyc, other.kyc) && Objects.equals(name, other.name) && phone == other.phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", kyc=" + kyc + ", phone=" + phone + "]";
	}

}
