package staticFactory;

public class Test {
	public static void main(String[] args) {
		System.out.println("静态工厂模式");
		System.out.println("将多个工厂方法模式的方法置为静态方法。不需要创建实例，直接调用即可！");
		MailSend mail = SendFactory.sendMail();
		mail.send();
		SMSSend sms = SendFactory.sendSMS();
		sms.send();
	}
}
