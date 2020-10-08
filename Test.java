package Computer;
import Computer.*;
public class Test {
    {
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		PC pc=new PC();
	    cpu.setSpeed(2200);
	    disk.setAmount(200);
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
        }
}
