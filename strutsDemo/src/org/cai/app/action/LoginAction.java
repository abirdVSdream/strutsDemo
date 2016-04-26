package org.cai.app.action;

import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
//public class LoginAction implements Action,ServletResponseAware {
	private String username;
	private String password;
	private HttpServletResponse response;
	private String tip;
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	/**public String execute() throws Exception
	{
		if(getUsername().equals("cai") && getPassword().equals("123456"))
		{
			ActionContext.getContext().getSession().put("user", getUsername());
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}*/
	
	public String regist() throws Exception
	{
		 ActionContext.getContext().getSession().put("user", getUsername());
		 setTip("恭喜您"+getUsername()+",您已经注册成功");
		 return SUCCESS;
		
	}
	public String execute() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		Integer counter = (Integer) ctx.getApplication().get("counter");
		if(counter == null)
		{
			counter = 1;
		}else
		{
			counter = counter + 1;
		}
		ctx.getApplication().put("counter", counter);
		ctx.getSession().put("user", getUsername());
		if(getUsername().equals("cai") && getPassword().equals("123456"))
		{
//			Cookie c = new Cookie("user",getUsername());
//			c.setMaxAge(60*60);
//			response.addCookie(c);
			//response.getWriter().append(c.getDomain());
			//ServletActionContext.getResponse().addCookie(c);
			ctx.put("tip", "服务器提示：您已经成功登录");
			return SUCCESS;
		}
		else
		{
			ctx.put("tip", "服务器提示：登录失败");
			return ERROR;
		}
	}

}
