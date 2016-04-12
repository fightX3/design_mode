package factory.multiFactory;

public class Test {
	public static void main(String[] args) {
		System.out.println("多个工厂模式");
		System.out.println("提供多个工厂方法，分别创建对象，对普通工厂方法的改进！");
		SendFactory send = new SendFactory();
		MailSend mail = send.sendMail();
		mail.send();
		SMSSend sms = send.sendSMS();
		sms.send();
	}
}
