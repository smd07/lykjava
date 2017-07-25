package tr.org.linux.kamp.car;

public class Car {
	
	
	private int gear;
	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	private int speed;
	private String brand;
	
	
	public Car(String brand,int gear,int speed) {
		
		this.gear=gear;
		this.speed=speed;
		this.brand=brand;
		
	}
	
	
	
	public void SpeedUp(int speed) {
		
		this.speed=this.speed+speed;
		System.out.println("hız arttı");
		
	}
	
	public void SpeedDown(int speed) {
		this.speed=this.speed-speed;
		System.out.println("hız düştü");
		
		
		
	}
	
	public void changeGear(int gear) {
		if (this.gear<gear) {
			SpeedUp(+20);
		}
		if (this.gear>gear) {
			SpeedDown(20);
		}
		this.gear=gear;
		
	}
		public void yaz() {
			System.out.println(brand+"  "+gear+" "+speed);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


