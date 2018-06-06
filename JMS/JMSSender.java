package JMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.naming.*;
import javax.jms.*;

public class JMSSender 
{
	public static void main(String[] args) 
	{
		try { 
			// 1) Create and start connection
			InitialContext ctx = new InitialContext();
			QueueConnectionFactory f = (QueueConnectionFactory) ctx.lookup("myQueueConnectionFactory"); //"myQueueConnectionFactory" is pool name, created by MQ manager console
			QueueConnection con = f.createQueueConnection();
			con.start();
			
			// 2) create queue session
			QueueSession ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			
			// 3) get the Queue object
			Queue queue = (Queue) ctx.lookup("myQueue");
			
			// 4)create QueueSender object
			QueueSender sender = ses.createSender(queue);
			
			// 5) create TextMessage object
			TextMessage msg = ses.createTextMessage();

			// 6) write message
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("Enter Msg, end to terminate:");
				String s = buf.readLine();
				if (s.equals("end"))
					break;
				msg.setText(s);
				
				// 7) send message
				sender.send(msg);
				System.out.println("Message successfully sent.");
			}
			// 8) connection close
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}