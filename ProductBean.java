package com.springOne;

public class ProductBean {
	private int pcode;
	private String pdesc;
	private int pamt;
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public int getPamt() {
		return pamt;
	}
	public void setPamt(int pamt) {
		this.pamt = pamt;
	}
	public void displayBean()
	{
		System.out.println("Product code:"+pcode);
		System.out.println("Product name:"+pdesc);
		System.out.println("Product amount:"+pamt);
	}

}
