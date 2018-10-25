package org.dingue.ticketing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.dingue.ticketing.pojo.DiAB;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DiTest {

    @Autowired
    private DiAB diAB;

    @Test
    public void testDi() {
        assertThat(diAB.pushAB(), is("AB"));
    }


}
