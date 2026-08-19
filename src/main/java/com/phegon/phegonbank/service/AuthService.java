package com.phegon.phegonbank.service;

import com.phegon.phegonbank.dtos.LoginRequest;
import com.phegon.phegonbank.dtos.LoginResponse;
import com.phegon.phegonbank.dtos.RegistrationRequest;
import com.phegon.phegonbank.dtos.ResetPasswordRequest;
import com.phegon.phegonbank.res.Response;

public interface AuthService {

	    Response<String > register(RegistrationRequest request);
	    
	    Response<LoginResponse> login(LoginRequest loginRequest);
	    
	    Response<? > forgetPassword(String email);
	    
	    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}
