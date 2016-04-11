package normalFactory;

public class MailSend implements SendFactory {

	@Override
	public void send() {
		System.out.println("我要发送邮件！！");
	}

}
