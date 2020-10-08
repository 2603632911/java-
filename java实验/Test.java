package pc;

public class Test {
	public static void main(String arge[]) {
		CPU cpu=new CPU();
		cpu.setSpeed(2000);
		HardDisk HD=new HardDisk();
		HD.setAmount(200);
		cpu.settem(70.0);
		CPU tem=new CPU();
		tem.settem(99.9);
		tem.setSpeed(2200);
		tem.setzhuansu(500);
		
		Pc pc=new Pc();
		pc.setCPU(tem);
		pc.setHardDisk(HD);
		pc.show();
	}
	
	
	
	

}
