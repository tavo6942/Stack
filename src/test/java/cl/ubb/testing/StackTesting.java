package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.ubb.ejemplo.FizzBuzz;

public class StackTesting {

	@Test
	public void pilaVacia() {
		Stack s= new Stack();
		String result;
		
		result=s.empty();
		
		assertEquals("is empty",result);
		
		
	}

}
