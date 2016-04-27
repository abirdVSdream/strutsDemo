package org.cai.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class RedirectAction extends ActionSupport 
{
	private String username;
	private String tip;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public String execute() throws Exception
	{
		setTip("恭喜您，您已经成功转向");
		return SUCCESS;
	}
}
