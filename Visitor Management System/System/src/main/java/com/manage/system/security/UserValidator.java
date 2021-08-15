package com.manage.system.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.manage.system.dto.CustomUserDetails;
import com.manage.system.mapper.SigninMapper;

@Component
public class UserValidator implements Validator{

//	@Autowired
//    private AccountRepository accountRepository;
	@Autowired
	private SigninMapper signinMapper;

    @Override
    public boolean supports(Class<?> clazz) {
        return CustomUserDetails.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
    	CustomUserDetails customUserDetails = (CustomUserDetails) obj;
    	
//        if(!((CustomUserDetails) obj).getPassword().equals(((CustomUserDetails) obj).getPassword())){
//            //비밀번호와 비밀번호 확인이 다르다면
//            errors.rejectValue("password", "key","비밀번호가 일치하지 않습니다.");
//        } 
    	if(signinMapper.findByUsername(((CustomUserDetails) obj).getUsername()) !=null){
            // 이름이 존재하면
            errors.rejectValue("username", "key","이미 사용자 이름이 존재합니다.");
        }

    }// 비밀번호 검사할때 쓰면 될듯
}