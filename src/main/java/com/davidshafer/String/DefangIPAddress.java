package com.davidshafer.String;

public class DefangIPAddress {
    /*
    Given a valid IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".
    1.1.1.1 -> 1[.]1[.]1[.]1
     */

    public String defangIpAddress(String address) {
        return address.replaceAll("\\.", "\\[\\.\\]");
    }
    //Notes:
    //The .replaceAll() function searches through the string, the first parameter will be replaced by the second parameter
    //Special characters are escaped with double backslashes: \\


}
