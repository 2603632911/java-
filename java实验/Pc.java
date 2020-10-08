package pc;

public class Pc {
	CPU cpu;
	HardDisk HD;

	void setCPU(CPU cpu) {
		this.cpu=cpu;

	}
	HardDisk setHardDisk(HardDisk HD) {
		this.HD=HD;
		return HD;
	
	
	
	}
	
	void show() {
		System.out.println("cpu:"+cpu.getSpeed());
		System.out.println("硬盘大小："+HD.getAmount());
		System.out.println("温度"+cpu.gettem());
		System.out.println("风扇转速"+cpu.getzhuansu());
	}
}
