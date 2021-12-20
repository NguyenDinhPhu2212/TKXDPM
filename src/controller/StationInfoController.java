package controller;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StationInfoController extends BaseController {
	/**
     * Just for logging purpose
     */
    private static final Logger LOGGER = utils.Utils.getLogger(
    		StationInfoController.class.getName());
    /**
     * Method validate number
     * @param phoneNumber to validate
     * @return true/false
     */
    public boolean validateNumber(String phoneNumber) {
    	//check phoneNumber starts with 0
    	if(phoneNumber.startsWith("0")) return false;
    	// check phoneNumber contains only number
    	try {
    		Integer.parseInt(phoneNumber);
    	}catch (NumberFormatException e) {
    		return false;
    	}
    	return true;
    }
    /**
     * Method validate station name
     * @param name station name
     * @return true/false
     */
    public boolean validateStationName(String name) {
    	if(name == null) return false;
    	Pattern pattern = Pattern.compile("[^A-Za-z]");
    	Matcher matcher = pattern.matcher(name.trim().replaceAll("\\s",""));
        if(matcher.find()) return false;
    	return true;
    }
    /**
     * @param address to validate
     * @return true/false
     */
    public boolean validateAddress(String address) {
    	if(address == null) return false;
    	Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
    	Matcher matcher = pattern.matcher(address.trim().replaceAll("\\s",""));
        if(matcher.find()) return false;
    	return true;
    }
}
