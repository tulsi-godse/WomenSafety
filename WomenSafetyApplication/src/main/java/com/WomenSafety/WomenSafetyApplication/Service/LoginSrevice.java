package com.WomenSafety.WomenSafetyApplication.Service;


import java.util.List;

import com.WomenSafety.WomenSafetyApplication.Entity.Login;

public interface LoginSrevice {
	
	Login createLogin(Login login);
	Login getLoginById(int id);
	void deleteLogin(int id);
	Login updateLogin(Login login);
	List<Log>
}
