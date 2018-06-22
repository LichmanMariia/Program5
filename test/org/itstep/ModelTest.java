package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	@Test
	public void testInputWordByScaner1() {
		
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScaner1(word);
		assertEquals("Mariia", result);
		
	}

	@Test
	public void testInputWordByScaner11() {
		
		Model model = new Model();
		String word = "Svetlana";
		String result = model.inputWordByScaner1(word);
		assertNull(result);
		
	}
	
	@Test
	public void testInputWordByScaner2() {
		
		Model model = new Model();
		float number = 5;
		float result = model.inputWordByScaner2(number);
		assertEquals(5 , result, 0);
		
	}

	@Test
	public void testInputWordByScaner21() {
		
		Model model = new Model();
		float number = 4;
		float result = model.inputWordByScaner2(number);
		assertEquals(0 , result, 0);
		
	}
	
	@Test
	public void testInputWordByScaner22() {
		
		Model model = new Model();
		float number = 6;
		float result = model.inputWordByScaner2(number);
		assertEquals(0 , result, 0);
		
	}
	
	@Test
	public void testWriteSentence() {
		
		Model model = new Model();
		String word = "Mariia";
		float number = 5;
		String result = model.writeSentence(word, number);
		assertEquals("Mariia " + 5.0, result);
		
	}

}
