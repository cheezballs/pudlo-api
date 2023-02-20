package us.mattroberts.pudlo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DummyTest {

    @Test
    public void dummyTest() {
        assertThat(true).isTrue();
    }

}