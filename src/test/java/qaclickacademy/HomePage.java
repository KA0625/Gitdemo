package qaclickacademy;

import java.io.IOException;
import qaclickacademy.Base;

import org.testng.annotations.Test;

public class HomePage extends Base{

@Test
public void basePageNavigation() throws IOException 
{
	driver=intializeDriver();
	driver.get("http://www.qaclickacademy.com");
	
	
}


}


