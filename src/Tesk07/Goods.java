package Tesk07;

public class Goods {
	private String goodsSeller;
	private String goodsName;
	private int goodsPrice;
	
	enum Seller{
		AM("Amazon") , AL("Alibaba"), JI("JingDong") , PI("PinXiXi");
		
		private String seller;
		
		public String getSeller() {
			return seller;
		}

		Seller(String goodS) {
			this.seller = goodS;
		}
	}
	
	public Goods(String goodsSeller, String goodsName, int goodsPrice) {
		super();
		this.goodsSeller = goodsSeller;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goodsName == null) ? 0 : goodsName.hashCode());
		result = prime * result + goodsPrice;
		result = prime * result + ((goodsSeller == null) ? 0 : goodsSeller.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (goodsName == null) {
			if (other.goodsName != null)
				return false;
		} else if (!goodsName.equals(other.goodsName))
			return false;
		if (goodsPrice != other.goodsPrice)
			return false;
		if (goodsSeller == null) {
			if (other.goodsSeller != null)
				return false;
		} else if (!goodsSeller.equals(other.goodsSeller))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goods [goodsSeller=" + goodsSeller + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
	
	

}
