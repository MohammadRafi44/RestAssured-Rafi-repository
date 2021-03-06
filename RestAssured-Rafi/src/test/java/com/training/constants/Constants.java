package com.training.constants;

public class Constants {

    // Executable constants
    public static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

    // File path constants
    public static final String JSONFILEPATH = System.getProperty("user.dir") + "/src/test/resources/config/config.json";
    public static final String EXTENTREPORTPATH = System.getProperty("user.dir") + "/ExtentReports/index.html";
    public static final String EXTENTCONFIGFILEPATH = System.getProperty("user.dir") + "/src/test/resources/config/extent-config.xml";
    public static final String SCREENSHOTPATH = System.getProperty("user.dir") + "/Screenshots";
    public static final String TESTDATAPATH = System.getProperty("user.dir") + "/resources/testexcel/ControlFile.xlsx";
//    public static final String TESTDATAPATH = "C:/Users/mohammad.shaikh/git/RestAssured-Rafi repository/RestAssured-Rafi/resources/testexcel.xlsx";
   
    //Other constants
    public static final int IMPLICITWAIT = 20;
    public static final int EXPLICITWAIT = 20;
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    public static final String IE = "ie";
    public static final String TESTDATASHEETNAME = "Sheet1";
    
    //DB constants
    public static final String DBCONSTRING = "jdbc:mysql://localhost:3306/business";
    public static final String DBUID = "root";
    public static final String DBPWD = "123456";


}
