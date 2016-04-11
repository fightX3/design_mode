package normalFactory;

public class SMSSend implements SendFactory {

	@Override
	public void send() {
		System.out.println("我要发送短信！！");
	}

}
