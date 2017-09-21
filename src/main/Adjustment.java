package main;

public class Adjustment {
	
	Operation operation;
	double value;
	Products productType;
	
	public Adjustment(Operation operation, double value) {
		this.operation = operation;
		this.value =  value;	
	}
	
	public Adjustment(Products productType, Operation operation, double value) {
		this.productType = productType;
		this.operation = operation;
		this.value =  value;	
	}
	
	public Adjustment() {}
	
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}

	public Products getProductType() {
		return productType;
	}

	public void setProductType(Products productType) {
		this.productType = productType;
	}
	

}
