package service;

import dao.StorebasicinfoDao;

public class StorebasicinfoServiceImpl implements StorebasicinfoService {
     
     private StorebasicinfoDao storebasicinfoDao;
      
     private StorebasicinfoServiceImpl () {
    	 storebasicinfoDao = storebasicinfoDao.sharedInstance();
     }
     
     private static StorebasicinfoService storebasicinfoService;
     
     public static StorebasicinfoService sharedInstance() {
    	 if(storebasicinfoService==null) {
    		 storebasicinfoService =new StorebasicinfoServiceImpl();
    	 }
    	 return storebasicinfoService;
     }
      
}
