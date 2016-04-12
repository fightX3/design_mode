package abstractFactory;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SMSSender();
	}

}
