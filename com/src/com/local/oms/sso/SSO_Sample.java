package com.local.oms.sso;
import java.util.*;

import javax.servlet.http.*;

import com.yantra.yfs.japi.*;
import com.yantra.yfs.japi.util.*;


public class SSO_Sample implements YFSSingleSignonManager {
    private YFSApi objApi = null;
    public void setApi(YFSApi oApi) throws Exception {
        objApi = oApi;
    }
    public YFSApi getApi() throws Exception {
        return objApi;
    }
    public Map getUserData(HttpServletRequest req, HttpServletResponse res) throws Exception {
        // Get the userID and password from the single signon application
                       String userid = getUserID();
                       String password = getPassword();
                       Map tempMap = new HashMap();
                       
                       Enumeration headerNames = request.getHeaderNames();
                       while (headerNames.hasMoreElements()) {
                    	   tempMap.put("userid",userid);
                           tempMap.put("password",password);
                           
                       }
                       
            return tempMap;           
    }
}
  