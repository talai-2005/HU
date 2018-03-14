package testTriangleClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import TriangleClass.Triangle;

public class TriangleTest {
	
	int TR_EQUILATERAL = 1;
	int TR_ISOSCELES = 2;
	int TR_ORDYNARY = 4;
	int TR_RECTANGULAR = 8;
	String A = "a<=0";
	String B = "b<=0";
	String C = "c<=0";
	String A1 = "a+b<=c";
	String B1 = "a+c<=b";
	String C1 = "b+c<=a";
	double value;
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	@BeforeGroups // General test - positive
	@Test(priority = 1, dataProvider = "dataProviderTrianleProductionPositive", dataProviderClass = dataProviderClass.class)
	public void testTriangle(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertNotNull(tr);
	}
	
	@BeforeGroups // General test - negative
	@Test(priority = 2, dataProvider = "dataProviderTrianleProductionNegative", dataProviderClass = dataProviderClass.class)
	public void testTriangle1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertNotNull(tr);
	}
	@AfterGroups
	
	/////////////////////////////////////////////////////////////////////////////////////////////
		
	@BeforeGroups // getSquare method test - positive
	@Test(priority = 3, dataProvider = "dataProviderMethodSquarePositive", dataProviderClass = dataProviderClass.class)
	public void getSquareTest(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		double p = (a + b + c) / 2;
		assertEquals(tr.getSquare(), Math.sqrt(p * (p - a) * (p - b) * (p - c)), 0.1);
	}
	
	// getSquare method test - negative
	@Test(priority = 4, dataProvider = "dataProviderMethodSquareNegative", dataProviderClass = dataProviderClass.class)
	public void getSquareTest1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		double p = (a + b + c) / 2;
		assertEquals(tr.getSquare(), Math.sqrt(p * (p - a) * (p - b) * (p - c)), 0.1, "should fall");
	}
	@AfterGroups

	///////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	@BeforeGroups //  checkTriangle method test - positive
	@Test(priority = 5, dataProvider = "dataProviderMethodSquarePositive", dataProviderClass = dataProviderClass.class)
	public void checkTriangleTest(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertTrue(tr.checkTriangle() == true);
	}

	// checkTriangle method test - negative
	@Test(priority = 6, dataProvider = "dataProviderMethodSquareNegative", dataProviderClass = dataProviderClass.class)
	public void checkTriangleTest1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertTrue(tr.checkTriangle() == false);
	}
	@AfterGroups
	
	/////////////////////////////////////////////////////////////////////////////////////////////
		
	// getMessage method test (first if) - positive 
	@Test(priority = 7, dataProvider = "dataProviderGetMessagePositive", dataProviderClass = dataProviderClass.class)
	public void getMessageTestA(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertNotEquals(tr.getMessage(), A);
			}
	
	@Test(priority = 8, dataProvider = "dataProviderGetMessagePositive", dataProviderClass = dataProviderClass.class)
	public void getMessageTestB(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertNotEquals(tr.getMessage(), B);
	}
		
	@Test(priority = 9, dataProvider = "dataProviderGetMessagePositive", dataProviderClass = dataProviderClass.class)
	public void getMessageTestC(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertNotEquals(tr.getMessage(), C);
	} 
	
	/////////////////////////////////////////////////////////////////////////////////////////////
		
	// getMessage method test (first if) - negative
	
	@Test(priority = 10, dataProvider = "dataProviderGetMessageNegativeA", dataProviderClass = dataProviderClass.class)
	public void getMessageTestA1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.getMessage(), A, "[fail]");
			}
	
	@Test(priority = 11, dataProvider = "dataProviderGetMessageNegativeB", dataProviderClass = dataProviderClass.class)
	public void getMessageTestB1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.getMessage(), B, "[fail]");
	}
		
	@Test(priority = 12, dataProvider = "dataProviderGetMessageNegativeC", dataProviderClass = dataProviderClass.class)
	public void getMessageTestC1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.getMessage(), C, "[fail]");
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////
		
		// getMessage method test (second if) - negative
		
		@Test(priority = 13, dataProvider = "dataProviderGetMessageNegativeSecondIfA", dataProviderClass = dataProviderClass.class)
		public void getMessageTestA3(double a, double b, double c) {
			Triangle tr = new Triangle(a, b, c);
			assertEquals(tr.getMessage(), A1, "[fail]");
				}
		
		@Test(priority = 14, dataProvider = "dataProviderGetMessageNegativeSecondIfB", dataProviderClass = dataProviderClass.class)
		public void getMessageTestB3(double a, double b, double c) {
			Triangle tr = new Triangle(a, b, c);
			assertEquals(tr.getMessage(), B1, "[fail]");
		}
			
		@Test(priority = 15, dataProvider = "dataProviderGetMessageNegativeSecondIfC", dataProviderClass = dataProviderClass.class)
		public void getMessageTestC3(double a, double b, double c) {
			Triangle tr = new Triangle(a, b, c);
			assertEquals(tr.getMessage(), C1, "[fail]");
		}
		
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	// detectTriangle method test - positive	
		
	@Test(priority = 16, dataProvider = "dataProviderEQUILATERAL", dataProviderClass = dataProviderClass.class)
	public void detectTriangleTest1(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.detectTriangle(), TR_EQUILATERAL, "равносторонний");
	}

	@Test(priority = 17,dataProvider = "dataProviderORDYNARY", dataProviderClass = dataProviderClass.class)
	public void detectTriangleTest2(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.detectTriangle(), TR_ORDYNARY, "обычный");

	}

	@Test(priority = 18,dataProvider = "dataProviderISOSCELES", dataProviderClass = dataProviderClass.class)
	public void detectTriangleTest3(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.detectTriangle(), TR_ISOSCELES, "равнобедренный");

	} 

	@Test(priority = 19,dataProvider = "dataProviderISOSCELES", dataProviderClass = dataProviderClass.class)
	public void detectTriangleTest4(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.detectTriangle(), TR_RECTANGULAR, "прямоугольный");

	} 
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	//detectTriangle method test - negative
	
	@Test(priority = 20, dataProvider = "dataProviderdetectTriangleNegative", dataProviderClass = dataProviderClass.class)
	public void detectTriangleTest5(double a, double b, double c) {
		Triangle tr = new Triangle(a, b, c);
		assertEquals(tr.detectTriangle(), null);
		
		
	}
	
}