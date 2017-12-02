package com.ara.beans;

public class MemberCard {
	private String cardNo;
	private String type;

	public MemberCard(String cardNo, String type) {
		super();
		this.cardNo = cardNo;
		this.type = type;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
