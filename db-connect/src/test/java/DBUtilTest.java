import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by pankajmisra on 11/5/16.
 */

public class DBUtilTest {


    @Before
    public void  setup(){

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testGetDBConnection() throws SQLException, ClassNotFoundException {
        DBUtil util = new DBUtil();
        Assert.assertNotNull(util.getDBConnection());
    }

}
