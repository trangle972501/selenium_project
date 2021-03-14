package com.driver.manager;

import com.driver.DriverType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType driverType) {
        DriverManager driverManager;
        switch (driverType) {
            case CHROME:
                driverManager = new ChromeDriverManager();
        }
    }
}
