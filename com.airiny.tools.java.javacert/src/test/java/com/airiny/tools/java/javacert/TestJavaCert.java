/**
 * 
 */
package com.airiny.tools.java.javacert;

import org.junit.Before;
import org.junit.Test;

import com.aw.ad.util.InstallCert;


/**
 * @author A55C
 *
 */
public class TestJavaCert {
	
	
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.aw.ad.util.InstallCert#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMain() throws Exception {
		String[] args = new String[]{"your.site"}; // You need to put your own self-signed cerificated site here
		InstallCert.main(args);
		
	}

}
