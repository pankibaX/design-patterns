package com.pankiba.designpatterns.behavioral.templatemethod;

public class XMLDataProcessor extends DataProcessor {
	
    @Override
    protected void transformData() {
        System.out.println("Transforming XML data...");
    }
    
    @Override
    protected void saveData() {
        System.out.println("Saving data to XML database...");
    }
    
    @Override
    protected boolean hook() {
        return true; // Enable post-processing
    }
    
    @Override
    protected void postProcess() {
        System.out.println("Running XML-specific post-processing...");
    }
}