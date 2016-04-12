package factory.normalFactory;

public class MailSend implements Send {

	@Override
	public void send() {
		System.out.println("我要发送邮件！！");
	}

}
