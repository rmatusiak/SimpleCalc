package com.comarch.training;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init(){
		simpleCalculator = new SimpleCalculator();
	}
	
	@DataProvider
	public static Object[][] testInput() {
		return new Object[][] { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }, { 7, 7 }, { 8, 8 }, { 9, 9 }, { 10, 10 } };
	}
	
	@Test(dataProvider = "testInput")
	public void AddingTest(int x, int y) {
		//Given
		//When
		int z = simpleCalculator.add(x, y);
		//Then
		Assert.assertEquals(z, x + y);	
	}
	
	@Test(dataProvider = "testInput")
	public void MinusTest(int x, int y){
		//given
		//when
		int z = simpleCalculator.minus(x, y);
		//then
		Assert.assertEquals(z,  x- y);
	}
	
	@Test(dataProvider = "testInput")
	public void MultiplyTest(int x, int y){
		//given
		//when
		int z = simpleCalculator.multiply(x, y);
		//then
		Assert.assertEquals(z, x * y);
	}
	
	@Test(dataProvider = "testInput")
	public void DivideTest(int x, int y){
		//given
		//when
		double z = simpleCalculator.divide(x, y);
		//then
		Assert.assertEquals(z, (double)x / y);
	}
	
	@Test()
	public void AddToMemoryTest(){
		//given
		simpleCalculator.setMemory(5);
		//when
		simpleCalculator.addToMemory(5);
		int x = simpleCalculator.getMemory();
		//then
		Assert.assertEquals(x, 10);
	}
}
