package Sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	
	@DataProvider
	public Object[][] data(){
		
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="bng";
		obj[0][1]="andhra";
		
		obj[1][0]="bng";
		obj[1][1]="mysore";
		
		obj[2][0]="bng";
		obj[2][1]="Hyd";		
		
		return obj;	
		
	}
	
	@Test(dataProvider="data")
	public void readData(String src,String dst) {
		
		System.out.println("from"+src+ "to"+dst);
		
	}
	

}
