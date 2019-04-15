package finalProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FinalCodeTest {

	@Test
	public void testAddMatrix() {
		//test the case 
		double [][] a = {
			{1.0,1.0,1.0},
			{2.0,2.0,2.0},
			{3.0,3.0,3.0}
		};
		double [][] b = {
			{1.0,1.0,1.0},
			{2.0,2.0,2.0},
			{3.0,3.0,3.0}
		}; 
		double [][] result = {
			{2.0,2.0,2.0},
			{4.0,4.0,4.0},
			{6.0,6.0,6.0}
		};
		double [][] added = FinalCode.addMatrix(a,b);
		
		assertEquals(result, FinalCode.addMatrix(a, b));
		if (result == FinalCode.addMatrix(added)) {
			System.out.println("addMatrix function is correct.");
		}
		else {
			System.out.println("addMatrix Function is a failure.");
		}
	}


}
