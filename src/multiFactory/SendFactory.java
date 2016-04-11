package multiFactory;

public class SendFactory {
	public MailSend sendMail(){
		return new MailSend();
	}
	public SMSSend sendSMS(){
		return new SMSSend();
	}
}
