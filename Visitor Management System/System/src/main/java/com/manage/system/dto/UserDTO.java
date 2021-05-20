package com.manage.system.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserDTO {
	@NonNull
	private String userId;
	private String password;
	private Integer userType;
	private String userName;
}
