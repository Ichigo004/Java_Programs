package com.cdac.act.classes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDate;

import com.cdac.act.enums.PrinterType;

public class Printer implements Externalizable {

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


	@Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", printerType="
				+ printerType + ", manufacturingDate=" + manufacturingDate + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(serialNo);
		out.writeObject(modelNo);
		out.writeObject(price);
		out.writeObject(printerType);
		out.writeObject(manufacturingDate);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		serialNo = (String) in.readObject();
		modelNo = (String) in.readObject();
		price = (Double) in.readObject();
		printerType = (PrinterType) in.readObject();
		manufacturingDate = (LocalDate) in.readObject();

	}

}
