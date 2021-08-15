package com.manage.system.service;

import java.util.List;

import com.manage.system.dto.ApplicationDTO;

public interface ApplicationService {
	
	public ApplicationDTO getApplication(Integer application_num);
	public void registerApplication(ApplicationDTO applicationDTO);
	public void modifyApplication(ApplicationDTO applicationDTO);
	public List<ApplicationDTO> getAllUserApplication(String user_id);
	public List<ApplicationDTO> getAllApplication();
}
