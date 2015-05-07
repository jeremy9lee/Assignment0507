package com.sds.icto.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

	void execute(HttpServletResponse response, HttpServletRequest request);
	
}
