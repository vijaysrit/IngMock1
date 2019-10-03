package com.ing.catalog.dto;


public class PurchesDetailsDto {

	private Integer productId;
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String email;
	private Long mobileNo;
	private String passportNo;
	private String address;
	

	private Integer pinCode;
	private String passportDocument;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public String getPassportDocument() {
		return passportDocument;
	}
	public void setPassportDocument(String passportDocument) {
		this.passportDocument = passportDocument;
	}
	public PurchesDetailsDto(Integer productId, Integer customerId, String firstName, String lastName, String email,
			Long mobileNo, String passportNo, String address, Integer pinCode, String passportDocument) {
		super();
		this.productId = productId;
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.passportNo = passportNo;
		this.address = address;
		this.pinCode = pinCode;
		this.passportDocument = passportDocument;
	}
	
	public PurchesDetailsDto() {
		
	}
	@Override
	public String toString() {
		return "PurchesDetailsDto [productId=" + productId + ", customerId=" + customerId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", mobileNo=" + mobileNo + ", passportNo="
				+ passportNo + ", address=" + address + ", pinCode=" + pinCode + ", passportDocument="
				+ passportDocument + "]";
	}
	
	
}
