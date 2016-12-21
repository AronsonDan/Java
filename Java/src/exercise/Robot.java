package exercise;

public class Robot {
	
	// Class members
	private static double grandTotalDistance;
	private static double grandTotalTime;
	
	// Object members
	private double totalDistance;
	private double totalTime;
	
	// Distance Constant
	public final static String KM = "km";
	public final static String MILE = "mile";

	
	public double getTotalDistance() {
		return this.totalDistance;
	}

	public static double getGrandTotalDistance() {
		return grandTotalDistance;
	}
	
	public double getTotalTime() {
		return this.totalTime;
	}

	public static double getGrandTotalTime() {
		return grandTotalTime;
	}
	
	public void walk(int distance, String mu) {
		if (mu == Robot.MILE) {
			this.totalDistance = (this.totalDistance + distance * 1.6);
			grandTotalDistance = grandTotalDistance + (distance * 1.6);
			this.totalTime = (this.totalTime + distance * 1.6  * 5);
			grandTotalTime = grandTotalTime +  distance * 1.6  * 5;
		} else if (mu == Robot.KM){
			this.totalDistance = this.totalDistance + distance;
			grandTotalDistance = grandTotalDistance + distance;
			this.totalTime = (this.totalTime + distance * 5);
			grandTotalTime = grandTotalTime +  distance * 5;
		}
}
	public void run(int distance, String mu) {
	if (mu == Robot.MILE) {
		this.totalDistance = (this.totalDistance + distance * 1.6);
		grandTotalDistance = grandTotalDistance + (distance * 1.6);
		this.totalTime = (this.totalTime + distance * 1.6  * 1);
		grandTotalTime = grandTotalTime +  distance * 1.6  * 1;
	} else if (mu == Robot.KM){
		this.totalDistance = this.totalDistance + distance;
		grandTotalDistance = grandTotalDistance + distance;
		this.totalTime = (this.totalTime + distance * 1);
		grandTotalTime = grandTotalTime +  distance * 1;
	}
	}
}
