package testTriangleClass;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TriangleClass.Triangle;

public class dataProviderClass {
	/////////////////////////////////////////////////////////////////////////////////////////////
	@BeforeGroups //
	@DataProvider(name = "dataProviderTrianleProductionPositive")
	public static Object[][] dataProviderMethod() {
		return new Object[][] { { 1.0, 2.0, 2.0 } };
	}
	
	@DataProvider(name = "dataProviderTrianleProductionNegative")
	public static Object[][] dataProviderMethod1() {
		return new Object[][] { { -1.0, -2.0, -2.0 } };
	}
	@AfterGroups
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	@BeforeGroups
	@DataProvider(name = "dataProviderMethodSquarePositive")
	public static Object[][] dataProviderPositive() {
		return new Object[][] { { 1.0, 2.0, 2.0 }, {2.0, 1.0, 2.0}, {2.0, 2.0, 1.0}};
	}
	@DataProvider(name = "dataProviderMethodSquareNegative")
	public static Object[][] dataProviderNegative() {
		return new Object[][] { { 0.0, 2.0, 2.0 }, { 1.0, 0.0, 2.0 }, { 1.0, 2.0, 0.0 }, { -1.0, 1.0, 1.0 },
		{ 1.0, -1.0, 1.0}, { 1.0, 1.0, -1.0}};
		}
	@AfterGroups
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@DataProvider(name = "dataProviderGetMessagePositive")
	public static Object[][] dataProviderGetMessageA() {
		return new Object[][] { { 1.0, 2.0, 2.0 }, { 2.0, 1.0, 1.0 },{ 2.0, 2.0, 0.0 } };
}
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	
	 @DataProvider(name = "dataProviderGetMessageNegativeA")
	 	public static Object[][] dataProviderGetMessageA1() {
		return new Object[][] { { 0.0, 1.0, 1.0 } };
}
	
	@DataProvider(name = "dataProviderGetMessageNegativeB")
	public static Object[][] dataProviderGetMessageB() {
		return new Object[][] { { 1.0, 0.0, 1.0 }};
		}
	@DataProvider(name = "dataProviderGetMessageNegativeC")
	public static Object[][] dataProviderGetMessageC() {
		return new Object[][] { { 1.0, 1.0, 0.0 }};
		}
	
/////////////////////////////////////////////////////////////////////////////////////////////	
	
	 @DataProvider(name = "dataProviderGetMessageNegativeSecondIfA")
	 	public static Object[][] dataProviderGetMessageA2() {
		return new Object[][] { { 1, 2, 3 }, { 1, 2, 4 } };
}
	
	@DataProvider(name = "dataProviderGetMessageNegativeSecondIfB")
	public static Object[][] dataProviderGetMessageB3() {
		return new Object[][] {{ 1.0, 3.0, 2.0 }, { 1.0, 4.0, 2.0 }};
		}
	@DataProvider(name = "dataProviderGetMessageNegativeSecondIfC")
	public static Object[][] dataProviderGetMessageC3() {
		return new Object[][] {{ 3.0, 1.0, 2.0 }, {4.0, 1.0, 2.0 } };
		}
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	@DataProvider(name = "dataProviderEQUILATERAL")
	public static Object[][] dataProviderMethod2() {
		return new Object[][] { { 1.0, 1.0, 1.0} };
	}

	@DataProvider(name = "dataProviderORDYNARY")
	public static Object[][] dataProviderMethod3() {
		return new Object[][] { { 1.0, 2.0, 3.0 } };
	}

	@DataProvider(name = "dataProviderISOSCELES")
	public static Object[][] dataProviderMethod4() {
		return new Object[][] { { 4.0, 4.0, 5.0 } };
	}

	@DataProvider(name = "dataProviderRECTANGULAR")
	public static Object[][] dataProviderMethod5() {
		return new Object[][] { { 4.0, 3.0, 5.0 } };
	}
	/////////////////////////////////////////////////////////////////////////////////////////////	
	
	@DataProvider(name = "dataProviderdetectTriangleNegative")
	public static Object[][] dataProviderMethod6() {
		return new Object[][] { { 0.0, 2.0, 2.0 }, { 2.0, 0.0, 2.0 }, { 2.0, 2.0, 0.0 }, { -1.0, -2.0, -2.0 }  };
	}
	
}
