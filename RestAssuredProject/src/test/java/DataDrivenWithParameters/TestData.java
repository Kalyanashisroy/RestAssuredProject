package DataDrivenWithParameters;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="PostforData")
	public Object[][] DataForPost(){
	/*	Object[][] data=new Object[2][3];
		data[0][0]="Will";
		data[0][1]="Smith";
		data[0][2]=2;
		
		data[1][0]="Kane";
		data[1][1]="Williams";
		data[1][2]=1;
		return data;*/
		return new Object[][] {
			{"Michel","Slatter",3},
			{"Frank","Albert",4},
			{"Andrew","Roohi",5},
			{"Maho","Abe",6},
			{"Jane","Folio",7},
			{"Andrew","Marshall",8},
			{"Ross","Taylor",9}
		};
		
		
	}
	@DataProvider(name="DeleteData")
	public Object[] DataForDelete() {
		return new Object[] {
				8
		};
	}

}
