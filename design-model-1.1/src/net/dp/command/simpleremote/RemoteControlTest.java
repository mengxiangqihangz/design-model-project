package net.dp.command.simpleremote;


/**
 * 其核心在于控制类 SimpleRemoteControl
 * 对于它，注入不同的对象，执行buttonWasPressed 的得到的结果不同，这个早就写过，对于spring，注入不同的dao层，跑出不同的结果。
 * @author liangpro
 *
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
