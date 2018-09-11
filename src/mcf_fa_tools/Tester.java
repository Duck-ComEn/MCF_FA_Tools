/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcf_fa_tools;

/**
 *
 * @author Mr.Piyanan
 */
public class Tester {

    public Tester.tType getType() {
        return type;
    }

    public void setType(Tester.tType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getAuthenUsername() {
        return authenUsername;
    }

    public void setAuthenUsername(String authenUsername) {
        this.authenUsername = authenUsername;
    }

    public String getAuthenPassword() {
        return authenPassword;
    }

    public void setAuthenPassword(String authenPassword) {
        this.authenPassword = authenPassword;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public String getCommonRawdataPath() {
        return commonRawdataPath;
    }

    public void setCommonRawdataPath(String commonRawdataPath) {
        this.commonRawdataPath = commonRawdataPath;
    }

    public String getCommonWrapperLogPath() {
        return commonWrapperLogPath;
    }

    public void setCommonWrapperLogPath(String commonWrapperLogPath) {
        this.commonWrapperLogPath = commonWrapperLogPath;
    }

    public int getCellCount() {
        return cellCount;
    }

    public void setCellCount(int cellCount) {
        this.cellCount = cellCount;
    }

    public String[] getStringCellID() {
        return stringCellID;
    }

    public void setStringCellID(String[] stringCellID) {
        this.stringCellID = stringCellID;
    }

    public String getTestManagerPath() {
        return testManagerPath;
    }

    public void setTestManagerPath(String testManagerPath) {
        this.testManagerPath = testManagerPath;
    }

    public String getTestCasePath() {
        return testCasePath;
    }

    public void setTestCasePath(String testCasePath) {
        this.testCasePath = testCasePath;
    }
   
    public enum tType{MANUAL, AUTO_XCALIBRE, AUTO_SATURN,AUTO_NEPTUNE;}
    private Tester.tType type;
    private String name;
    private String ipAddress;
    private String authenUsername;
    private String authenPassword;
    private String rootPath;
    private String testManagerPath;
    private String testCasePath;
    private String commonRawdataPath;
    private String commonWrapperLogPath;
    private int cellCount;
    private String[] stringCellID;
    
}
