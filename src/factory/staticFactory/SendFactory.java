package factory.staticFactory;

public class SendFactory {
	public static MailSend sendMail(){
		return new MailSend();
	}
	public static SMSSend sendSMS(){
		return new SMSSend();
	}
}
