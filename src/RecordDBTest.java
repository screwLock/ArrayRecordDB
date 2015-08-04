import static org.junit.Assert.*;

import org.junit.Test;


public class RecordDBTest {
	Record testRecord = new Record("John", "123", 50000);
	RecordDB testDB = new RecordDB(200);
	@Test
	public void testInsert() {
		assertTrue("Record not inserted", testDB.insert(testRecord));
	}

	@Test
	public void testDeleteString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchDouble() {
		fail("Not yet implemented");
	}

}
