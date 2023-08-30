package com.manageportfolio.stocks;

public class StockDetails {

	private String stockID;
	private String stockTicker;
	private String stockName;
	private int numOfShares;
	private double quarterlyDividend;
	
	public StockDetails() {

	}
	
	public StockDetails(String stockID, String stockTicker, String stockName, int numOfShares,
			double quarterlyDividend) {
		super();
		this.stockID = stockID;
		this.stockTicker = stockTicker;
		this.stockName = stockName;
		this.numOfShares = numOfShares;
		this.quarterlyDividend = quarterlyDividend;
	}
	
	public String getStockID() {
		return stockID;
	}

	public void setStockID(String stockID) {
		this.stockID = stockID;
	}

	public String getStockTicker() {
		return stockTicker;
	}

	public void setStockTicker(String stockTicker) {
		this.stockTicker = stockTicker;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}

	public double getQuarterlyDividend() {
		return quarterlyDividend;
	}

	public void setQuarterlyDividend(double quarterlyDividend) {
		this.quarterlyDividend = quarterlyDividend;
	}


}
