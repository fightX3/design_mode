package normalFactory;

public class Test {
	public static void main(String[] args) {
		System.out.println("普通工厂模式");
		System.out.println("建立一个工厂类，对实现了同一个这个接口的一些类进行实例的创建！");
		SendFactory send = new SendFactory();
		Send mail = send.produce("mail");
		mail.send();
		Send sms = send.produce("sms");
		sms.send();
	}

}
