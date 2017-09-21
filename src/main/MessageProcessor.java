package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageProcessor {
	
	public int messageSize = 0;
	
	//Map to record all sales details
	Map<Products, SalesRecord> salesRecordMap = new HashMap<>();
	
	// List to record all adjustment details
	List<Adjustment> adjustmentList = new ArrayList<>();
	
	public void processor(Message message) {
		if(message != null) {
			messageSize++;
		}
		
		//Don't process the message if messageSize reaches more than 50
		if(messageSize > 50) {
			System.out.println("-------------");
			System.out.println("Application is PAUSED. Message size reached 50, so no further messages would be processed.");
			//return;
		}
	
		//Process a message	until it reaches the size 50		
		if(messageSize <= 50) {
			 
			//Check first if Product's sale already recorded in Map
			if(salesRecordMap.containsKey(message.getSale().getProductType())) {
				
				SalesRecord salesRecord = salesRecordMap.get(message.getSale().getProductType());
				salesRecord.setOccurence(salesRecord.getOccurence() + message.getOccurrence());
				Adjustment adjustment = message.getAdjustment();
				
				//Code to record adjustment details and to update recorded sales accordingly
				if(adjustment != null) {
					
					adjustment.setProductType(message.getSale().getProductType());
					adjustmentList.add(adjustment);
		
					if(adjustment.getOperation().equals(Operation.ADD)){
						salesRecord.setPrice(salesRecord.getPrice() + adjustment.getValue());		
						
					}else
						if(adjustment.getOperation().equals(Operation.SUBSTRACT)){
							salesRecord.setPrice(salesRecord.getPrice() - adjustment.getValue());
						}else
							if(adjustment.getOperation().equals(Operation.MULTIPLY)){
								salesRecord.setPrice(salesRecord.getPrice() * adjustment.getValue());
							}					
				}
				
				salesRecordMap.put(salesRecord.getProductType(), salesRecord);
				
					
			}else {//If product sale is not recorded in Map
					SalesRecord sr = new SalesRecord();
					sr.setProductType(message.getSale().getProductType());
					sr.setOccurence(message.getOccurrence());
					sr.setPrice(message.getSale().getPrice());
					salesRecordMap.put(sr.getProductType(), sr);
			}
				
			//Print all the sales details after every 10th message received
			if(messageSize % 10 == 0) {				
				System.out.println("...........");
				System.out.println("Sales details so far after "+ messageSize + " messages are:::");
				for(SalesRecord sr : salesRecordMap.values()) {
					System.out.println("Total number of Sales of the Product "+ sr.getProductType() + " are " +sr.getOccurence() + 
							" with total value as "+ sr.getPrice() * sr.getOccurence());
				}
			}
		}
		
			//Print all the Adjustment details after 50th message received
			if(messageSize == 50) {
				System.out.println("-------------");
				System.out.println("All Sales adjustments after 50 messages are:::");
				for(Adjustment ad : adjustmentList) {
					System.out.println("Adjustment made for the Product "+ ad.getProductType() + " is to " +ad.getOperation() + 
							"  value "+ad.getValue() + " for all sales recorded for the product");
				}
			}
			
	}

}
