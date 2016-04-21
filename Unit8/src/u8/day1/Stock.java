package u8.day1;

public class Stock {
	private String symbol;
	private String name;
	private Double previousClosingPrice;
	private Double currentPrice;

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public Double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(Double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
}