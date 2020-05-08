package entities;

public class importedProduct extends Product {

	private Double customsFee;
	
	public importedProduct() {
		super();
	}
	
	public importedProduct(String name, Double price, Double customFee) {
		super( name, price);
		this.customsFee = customFee;
	}
	
	public Double getCustomFee() {
		return customsFee;
	}
	
	public void setCustomFee(Double customFee) {
		this.customsFee = customFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}
