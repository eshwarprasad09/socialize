package com.eshwarprasad.socialize.service;

import com.eshwarprasad.socialize.payload.LoginDto;
import com.eshwarprasad.socialize.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
