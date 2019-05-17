package ntesec.juli;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ntesec.juli.utils.FileUtil;

/**
 * Unit test for simple App.
 */
public class FileUtilTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public FileUtilTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(FileUtilTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void testRead() {
		String str = FileUtil.readFile("resources/test.imc");
		assertEquals("test", str.trim());
	}

	public void testWrite() {
		String str = FileUtil.readFile("resources/test.imc");
		FileUtil.writeFile(str.trim() + "_1", "resources/test_1.imc");
		String str2 = FileUtil.readFile("resources/test_1.imc");
		assertEquals("test_1", str2.trim());
	}
}
