package factory.normalFactory;

public class SendFactory {
	public Send produce(String type) {  

        if ("mail".equals(type)) {  

            return new MailSend();  

        } else if ("sms".equals(type)) {  

            return new SMSSend();  

        } else {  

            System.out.println("请输入正确的类型!");  

            return null;  

        }  

    }  
}
