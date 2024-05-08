/*package com.WomenSafety.WomenSafetyApplication.ServiceImplimentation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.WomenSafety.WomenSafetyApplication.Entity.Login;
import com.WomenSafety.WomenSafetyApplication.Repository.LoginRepo;
import com.WomenSafety.WomenSafetyApplication.Service.LoginSrevice;

public class LoginServiceImpl implements LoginSrevice{
	
	@Autowired
	LoginRepo loginRepo;

	@Override
	public Login createLogin(Login login) {
		Login lg = loginRepo.save(login);
		return lg;
	}

	@Override
	public Login getLoginById(int id) {
		Optional<Login> lg = loginRepo.findById(id);
		if(lg.isPresent()) {
			return lg.get();
			}
		return null;
	}

	@Override
	public void deleteLogin(int id) {
		loginRepo.deleteById(id);	
	}

	@Override
	public Login updateLogin(Login login) {
		Login existingLogin = loginRepo.findById(login.getLid()).get();
		existingLogin.setUserName(login.getUserName());
		existingLogin.setPassword(login.getPassword());
		Login updateLogin = loginRepo.save(existingLogin);

		return updateLogin;
	}
}
*/