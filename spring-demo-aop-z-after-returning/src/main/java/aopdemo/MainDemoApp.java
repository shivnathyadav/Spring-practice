package aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aopdemo.dao.AccountDAO;
import aopdemo.dao.MembershipDAO;

import java.util.ArrayList;
import java.util.List;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccounts =theAccountDAO.findAccounts();
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
				
		// call the business method
		Account myAccount = new Account();
		myAccount.setName("Madhuri");
		myAccount.setLevel("Platinum");


		// After throwing
		List<Account> accountList = null;
		try {
			theAccounts = theAccountDAO.findAccounts();

		}
		catch (Exception exc){
			System.out.println("\n\n Main  program ... caught exception   "+ exc);
		}

		System.out.println(theAccounts);

		
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		// call the accountdao getter/setter methods
		theAccountDAO.setName("Shiva");
		theAccountDAO.setServiceCode("Gold");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		// call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();
		
		// close the context
		context.close();
	}

}










