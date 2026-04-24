package utils;

import org.testng.annotations.DataProvider;

public class loginData {
    @DataProvider(name="LoginData")
    public Object[][] getData()
    {
        return new Object[][]
        {
                {"tomsmith","SuperSecretPassword!","You logged into a secure area!"},
                {"tomsmith","SuperSecret","Your password is invalid!"},
                {"","SuperSecret","Your username is invalid!"}
        };
    }
}
