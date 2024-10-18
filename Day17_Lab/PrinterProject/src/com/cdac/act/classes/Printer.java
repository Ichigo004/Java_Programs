package com.cdac.act.classes;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.cdac.act.enums.PrinterType;

public class Printer implements Serializable {

	private static final long serialVersionUID =-3343568466418384658L;

	private String serialNo;
	private String modelNo;
	private Double price;
	private PrinterType printerType;
	private LocalDate manufacturingDate;




	public Printer(String serialNo, String modelNo, Double price, PrinterType printerType,
			LocalDate manufacturingDate) {
		super();
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.printerType = printerType;
		this.manufacturingDate = manufacturingDate;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public PrinterType getPrinterType() {
		return printerType;
	}

	public void setPrinterType(PrinterType printerType) {
		this.printerType = printerType;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", printerType="
				+ printerType + ", manufacturingDate=" + manufacturingDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturingDate, modelNo, price, printerType, serialNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Printer other = (Printer) obj;
		return Objects.equals(manufacturingDate, other.manufacturingDate) && Objects.equals(modelNo, other.modelNo)
				&& Objects.equals(price, other.price) && printerType == other.printerType
				&& Objects.equals(serialNo, other.serialNo);
	}





}
