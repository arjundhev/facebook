package org.sign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	WebDriver driver;
	public void getdriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\FacebookSignUp\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
			}
				else if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\FacebookSignUp\\driver\\chromedriver.exe");
					driver=new FirefoxDriver();
				}
				else if (browserName.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\FacebookSignUp\\driver\\chromedriver.exe");
					driver=new EdgeDriver();
				}
					else {
						System.out.println("Invalid browser");		
					}
				
			} catch (Exception e) {
				System.out.println(e);	
		}
		    
	}
	public void launchUrl(String Url) {
		try {
			driver.get(Url);
			
		} catch (Exception e) {
			
		}
		
	}
	public void typeText(WebElement element,String data) {
		try {
			element.sendKeys(data);
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
	}
	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	private WebElement findById(String data,String id) {
		WebElement findElement=null;
		try {
			if (data.equalsIgnoreCase("id")) {
				driver.findElement(By.id(id));
			}
			else if (data.equalsIgnoreCase("xpath")) {
				driver.findElement(By.xpath(id));
				
			}else if (data.equalsIgnoreCase("classname")) {
				driver.findElement(By.name(id));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return findElement;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
