package com.careerit.cj.cbook;

public class Contact {

	private int cid;
	private String name;
	private String mobile;

	public Contact(String name, String mobile) {
		if (cid == 0) {
			this.cid = IdGenerator.newId();
		}
		this.name = name;
		this.mobile = mobile;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [cid=").append(cid).append(", name=").append(name).append(", mobile=").append(mobile)
				.append("]");
		return builder.toString();
	}

}
