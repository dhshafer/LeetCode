package com.davidshafer.StringTests;

import com.davidshafer.String.DefangIPAddress;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefangIPAddressTests {

    @Test
    public void IP_Address_Is_Defanged() {
        DefangIPAddress exercise = new DefangIPAddress();

        assertEquals("1[.]1[.]1[.]1", exercise.defangIpAddress("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", exercise.defangIpAddress("255.100.50.0"));
    }
}
