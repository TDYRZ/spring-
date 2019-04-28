package spring4.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.Assert;
 
public class JuintTest {
	@Autowired
	private TestBean testBean;
	
	
	@Test
	public void test() {
		String expected  = "from production profile";
		String actual=testBean.getContent();
		Assert.assertEquals(expected, actual);
	}

}
