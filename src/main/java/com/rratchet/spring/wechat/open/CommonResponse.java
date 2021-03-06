package com.rratchet.spring.wechat.open;

import java.io.Serializable;

public class CommonResponse implements Serializable {

	private static final long serialVersionUID = -3697048993672314762L;

	protected Integer errcode;
	
	protected String errmsg;
	
	public boolean isError() {
		return errcode != null && errcode != 0;
	}
	
	public Integer getErrcode() {
		return errcode;
	}

	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
