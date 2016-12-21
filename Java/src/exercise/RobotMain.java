package exercise;

public class RobotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		Robot r2 = new Robot();
		//System.out.println(r.getClass());
		System.out.println("Stats of r");
		System.out.println(r.getTotalDistance());
		System.out.println(r.getTotalTime());
		System.out.println("-------------------");
		r.walk(10, Robot.KM);
		System.out.println("Stats of r");
		System.out.println(r.getTotalDistance());
		System.out.println(r.getTotalTime());
		System.out.println("-------------------");
		r.walk(10, Robot.KM);
		System.out.println("Stats of r");
		System.out.println(r.getTotalDistance());
		System.out.println(r.getTotalTime());
		System.out.println("-------------------");
		r.walk(10, Robot.MILE);
		System.out.println(r.getTotalDistance());
		System.out.println(r.getTotalTime());
		System.out.println("-------------------");
		r2.run(20, Robot.KM);
		System.out.println("Stats of r2");
		System.out.println(r2.getTotalDistance());
		System.out.println(r2.getTotalTime());
		System.out.println("-------------------");
	}

}
