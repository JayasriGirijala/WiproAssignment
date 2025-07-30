package mockitoproblem;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)//enable mockito
public class CalcApplicationMockitoTester 
{
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks //this class refers or holds your interface
	CalcApplication mathApplication = new CalcApplication();//

	//@Mock annotation is used to create the mock object to be injected
	@Mock//interface name
	CalcService calcService;

	@Test
	public void testAdd()
	{
		/*
		 * The when(...).thenReturn(...) method chain is be used to specify a
		 *  condition and a return value for this condition.
		 */
		   //add the behavior of calc service to add two numbers
	
		//STUBBING BEHAVIOUR
		   Mockito.when(calcService.add(10,20)).thenReturn(30);//interface method
		   Mockito.when(calcService.add(10,10)).thenReturn(20);//interface method
	
		   //test the add functionality
		   assertEquals(mathApplication.add_1(10, 20),30);//internally calling interface method
		   assertEquals(mathApplication.add_1(10, 10),20);

		   //assertEquals(mathApplication.add_1(10, 21),31);//NO STUBBING

	}
}
