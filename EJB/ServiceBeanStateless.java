package EJB;

import static javax.ejb.TransactionAttributeType.*;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.interceptor.ExcludeDefaultInterceptors;

/**
 * Bean file that implements the Service business interface. Class uses
 * following EJB 3.0 annotations:
 * - @Stateless - specifies that the EJB is of type stateless session
 * - @TransactionAttribute - specifies that the EJB never runs in a transaction
 * - @ExcludeDefaultInterceptors - specifies any configured default interceptors should not be invoked for this class
 */

@Stateless
@TransactionAttribute(NEVER)
@ExcludeDefaultInterceptors
public class ServiceBeanStateless implements Service 
{
	public void sayHelloFromServiceBean() {
		System.out.println("Hello From Service Bean!");
	}
}