package com.pankiba.designpatterns.behavioral.templatemethod;

public abstract class DataProcessor {
	
	// This is the template method - it defines the algorithm's structure
	public final void processData() {
		readData();
		validateData();
		transformData();
		saveData();
		if (hook()) {
			postProcess();
		}
	}

	// Concrete steps that are common to all implementations
	private void readData() {
		System.out.println("Reading data from default source...");
	}

	// Abstract steps that must be implemented by subclasses
	protected abstract void transformData();

	// Steps with default implementation that can be overridden
	protected void validateData() {
		System.out.println("Validating data using default validation...");
	}

	protected void saveData() {
		System.out.println("Saving data to default destination...");
	}

	// Hook method - optional step that can be overridden
	protected boolean hook() {
		return false;
	}

	protected void postProcess() {
		// Default does nothing
	}
}