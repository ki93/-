package com.manage.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.manage.system.security.CustomUserDetails;

@Mapper
public interface SigninMapper {
	public String userSignin(String userId);
	public CustomUserDetails getUserById (String id);
	public CustomUserDetails findByUsername (String userName);
	public void save (CustomUserDetails customUserDetails);
}
