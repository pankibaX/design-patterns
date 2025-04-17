package com.pankiba.designpatterns.behavioral.templatemethod;

public class CSVDataProcessor extends DataProcessor {
	
	@Override
	protected void transformData() {
		System.out.println("Transforming CSV data...");
	}

	@Override
	protected void validateData() {
		System.out.println("Validating CSV data with specific rules...");
	}
}