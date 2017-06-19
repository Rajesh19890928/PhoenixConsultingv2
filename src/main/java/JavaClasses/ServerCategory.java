/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

/**
 *
 * @author raojha
 */
public class ServerCategory {
    public String Server(String ipaddress)
    {
        if (ipaddress.equals("20.0.0.49"))
        {
            return "Dev Server";
        }
        if (ipaddress.equals("20.0.0.234"))
        {
            return "QA Server";
        }
        if (ipaddress.equals("20.0.0.164"))
        {
            return "Production Server";
        }
    return "Server class not indentified";       
    }
}
