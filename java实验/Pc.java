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
		System.out.println("Ӳ�̴�С��"+HD.getAmount());
		System.out.println("�¶�"+cpu.gettem());
		System.out.println("����ת��"+cpu.getzhuansu());
	}
}
