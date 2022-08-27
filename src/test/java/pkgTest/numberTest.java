package pkgTest;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pkg.*;
;public class numberTest {
	@Parameters({"num1", "num2", "numberFromParams"})
	@Test
	public void  testCalculator(int num1, int num2, int numberFromParams) {
		int num3 = TestMain.calculateSum(num1, num2);
		System.out.println(num1 + ", " + num2);
		assertEquals(num3, numberFromParams);
	}
}