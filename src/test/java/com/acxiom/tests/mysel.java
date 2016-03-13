package com.acxiom.tests;
import java.io.IOException;
import org.testng.annotations.Test;
import com.acxiom.utils.Setup;

public class mysel extends Setup{
	
@Test
public void hey() throws IOException{
	dr.get("http://www.google.com");
	dr.close();
}
	
	
	
}
