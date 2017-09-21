package main;

public class Message {

	public Sale sale;
	public int occurrence;
	public Adjustment adjustment;
	
	public Message(Sale sale, int occur) {
		this.sale = sale;
		this.occurrence = occur;
	}
	
	public Message(Sale sale, int occur , Adjustment adjustment) {
		this.sale = sale;
		this.occurrence = occur;
		this.adjustment = adjustment;
	}
	
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public int getOccurrence() {
		return occurrence;
	}
	public void setOccurrence(int occurrence) {
		this.occurrence = occurrence;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(Adjustment adjustment) {
		this.adjustment = adjustment;
	}
		
}
