import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactAddressTest {
    ContactAddressTest ca = new ContactAddressTest();
    String str1[] = new String[]{"119", "97674223", "1195524421"};
    String str2[] = new String[]{"123", "456", "789"};
    String str3[] = new String[]{"1235", "12", "123", "567", "88"};

    @Test
    public void main() {
        assertEquals(false, ca.str1);
        assertEquals(true, ca.str2);
        assertEquals(false, ca.str3);
    }
}