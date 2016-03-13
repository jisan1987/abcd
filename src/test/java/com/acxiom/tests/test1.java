package com.acxiom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
WebDriver dr = new FirefoxDriver();

@Parameters({"url"})
@Test
public void test1_1(String url){
System.out.println("Test1_1");
	dr.get(url);
	dr.close();
	
}
@Test
public void test1_2(){
System.out.println("Test1_2");
}
@Test
public void test1_3(){
System.out.println("Test1_3");
	
}
}
