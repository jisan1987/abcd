package com.acxiom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
WebDriver dr = new FirefoxDriver();

@Parameters({"url"})
@Test
public void test2_1(String url){
System.out.println("test2_1");
	dr.get(url);
	dr.close();
	
}

@Test
public void test2_2(){
System.out.println("test2_2");
}
@Test
public void test2_3(){
System.out.println("test2_3");
	
}
}
