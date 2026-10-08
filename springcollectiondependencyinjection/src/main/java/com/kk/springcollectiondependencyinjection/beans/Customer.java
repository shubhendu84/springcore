package com.kk.springcollectiondependencyinjection.beans;

import java.util.List;
import java.util.Objects;

public class Customer {

	private String name;
	private List<String> customerbankAccount;
	private List<String> address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCustomerbankAccount() {
		return customerbankAccount;
	}

	public void setCustomerbankAccount(List<String> customerbankAccount) {
		this.customerbankAccount = customerbankAccount;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, customerbankAccount, name);
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
		return Objects.equals(address, other.address) && Objects.equals(customerbankAccount, other.customerbankAccount)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerbankAccount=" + customerbankAccount + ", address=" + address + "]";
	}

}
