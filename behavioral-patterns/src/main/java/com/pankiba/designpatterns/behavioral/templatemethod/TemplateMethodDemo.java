package com.pankiba.designpatterns.behavioral.templatemethod;

/**
 * Key Points The processData() method is the template method that defines the
 * algorithm's structure.
 * 
 * Some steps are implemented in the base class (readData()).
 * 
 * Some steps are abstract and must be implemented by subclasses
 * (transformData()).
 * 
 * Some steps have default implementations that can be overridden
 * (validateData(), saveData()).
 * 
 * The hook method (hook()) allows subclasses to optionally "hook into" the
 * algorithm at certain points.
 */
public class TemplateMethodDemo {

	public static void main(String[] args) {

		System.out.println("Processing CSV data:");
		DataProcessor csvProcessor = new CSVDataProcessor();
		csvProcessor.processData();

		System.out.println("\nProcessing XML data:");
		DataProcessor xmlProcessor = new XMLDataProcessor();
		xmlProcessor.processData();
	}
}