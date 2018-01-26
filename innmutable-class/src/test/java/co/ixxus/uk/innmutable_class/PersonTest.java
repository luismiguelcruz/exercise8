package co.ixxus.uk.innmutable_class;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class PersonTest extends TestCase {
    private Person person;

    @Override
    @Before
    public void setUp() throws Exception {
        person = new Person("Luis", "Miguel", "Cruz", "Sir", "07543983984", "", "male",
                new ArrayList(){{
                    add("Address1");
                    add("Address1");
                }}) {
        };
    }

    @Test
    public void checkPersonIsCreated() {
        assertTrue(person != null);
    }

    @Test
    public void checkMultipleAddressesIsImmutable() {
        checkPersonIsCreated();
        assertThat(person.getMultipleAddresses()).isNotNull();
        assertThat(person.getMultipleAddresses().size()).isEqualTo(2);
        person.getMultipleAddresses().add("e");
        assertThat(person.getMultipleAddresses().size()).isEqualTo(2);
    }
}
