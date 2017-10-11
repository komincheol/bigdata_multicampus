package basic.exam17;
import static basic.exam17.PowerState.OFF;
import static basic.exam17.PowerState.ON;
import static basic.exam17.PowerState.SUSPEND;;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setState(OFF);
		com.setState(ON);
		com.setState(SUSPEND);
	}
}
