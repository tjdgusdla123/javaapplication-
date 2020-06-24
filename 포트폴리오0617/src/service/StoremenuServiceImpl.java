package service;

import dao.StoremenuDao;

public class StoremenuServiceImpl implements StoremenuService {
	
	private StoremenuDao storemenuDao;
	private StoremenuServiceImpl () {
		storemenuDao =storemenuDao.sharedInstance();
		
	}
	
	private static StoremenuService storemenuService;
	
	public static StoremenuService sharedInstance() {
		if(storemenuService==null) {
			storemenuService= new StoremenuServiceImpl();
		}
		return storemenuService;
	}

}
