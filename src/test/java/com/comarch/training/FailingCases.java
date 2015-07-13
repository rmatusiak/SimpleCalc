package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FailingCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@DataProvider
	public static Object[][] testInput() {
		return new Object[][] { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }, { 7, 7 }, { 8, 8 }, { 9, 9 }, { 10, 10 } };
	}

	@Test(groups = { "addingTest" }, dataProvider = "testInput", dependsOnMethods = {"MinusTest"})
	public void AddingTest(int x, int y) {
		// Given
		// When
		int z = simpleCalculator.add(x, y);
		// Then
		Assert.assertEquals(z, x + y);
	}

	@Test(groups = { "multiplyTest" }, dataProvider = "testInput", dependsOnMethods = {"MinusTest"})
	public void MultiplyTest(int x, int y) {
		// given
		// when
		int z = simpleCalculator.multiply(x, y);
		// then
		Assert.assertEquals(z, x * y);
	}

	@Test(groups = { "minusTest" }, dataProvider = "testInput")
	public void MinusTest(int x, int y) {
		// given
		// when
		int z = simpleCalculator.minus(x, y);
		// then
		Assert.assertEquals(z, x - y + 1);
	}
}
