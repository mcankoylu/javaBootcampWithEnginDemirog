package java_oopIntro_1;

public class Car {
	public int carId;
	public String carName;
	public String carColor;
	public double unitPrice;
	
	/*
	  *public Car(int carId,String carName, String carColor, double unitPrice)
	{
		this.carId=carId;
		this.carName=carName;
		this.carColor=carColor;
		this.unitPrice=unitPrice;
		}
		*/	
//Get ve set metodlarý kullandim.
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
