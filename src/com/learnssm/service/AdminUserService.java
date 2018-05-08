package com.learnssm.service;

import com.learnssm.model.TAdminRole;
import com.learnssm.model.TAdminUser;

public interface AdminUserService {
	
	TAdminUser getAdminUserByUserName(String name);
	
	TAdminRole getAdminRoles( TAdminUser activeUser);
}
