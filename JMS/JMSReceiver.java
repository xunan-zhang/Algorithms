package JMS;

import javax.jms.*;  
import javax.naming.InitialContext;  
  
public class JMSReceiver 
{  
    public static void main(String[] args) 
    {  
        try{  
            //1) Create and start connection  
            InitialContext ctx=new InitialContext();  
            QueueConnectionFactory f=(QueueConnectionFactory)ctx.lookup("myQueueConnectionFactory"); //"myQueueConnectionFactory" is pool name, created by MQ manager console
            QueueConnection con=f.createQueueConnection();  
            con.start();  
    
            //2) create Queue session  
            QueueSession ses=con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);  
            
            //3) get the Queue object  
            Queue queue=(Queue)ctx.lookup("myQueue");  
            
            //4)create QueueReceiver  
            QueueReceiver receiver=ses.createReceiver(queue);  
              
            //5) create listener object  
            JMSListener listener=new JMSListener();  
              
            //6) register the listener object with receiver  
            receiver.setMessageListener(listener);  
              
            System.out.println("Receiver1 is ready, waiting for messages...");  
            System.out.println("press Ctrl+c to shutdown...");  
            while(true){                  
                Thread.sleep(1000);  
            }
            
        }catch(Exception e){System.out.println(e);}  
    }  
  
}  