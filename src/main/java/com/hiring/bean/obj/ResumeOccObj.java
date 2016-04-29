package com.hiring.bean.obj;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hiring.bean.ResumeOcc;

/**
 * 简历工作经历对象
 * 
 * @author Administrator
 *
 */

public class ResumeOccObj
{

	private ResumeOcc resumeOcc = new ResumeOcc();

	public ResumeOccObj( )
	{

	}

	public ResumeOccObj(ResumeOcc resumeOcc)
	{
		this.resumeOcc = resumeOcc;
	}

	@JsonIgnore
	public ResumeOcc getResumeOcc()
	{
		return resumeOcc;
	}

	public void setResumeOcc(ResumeOcc resumeOcc)
	{
		this.resumeOcc = resumeOcc;
	}

	public Long getId()
	{
		return this.resumeOcc.getId();
	}

	public void setId(Long id)
	{
		this.resumeOcc.setId(id);
	}

	public String getCompanyName()
	{
		return this.resumeOcc.getCompanyName();
	}

	public void setCompanyName(String companyName)
	{
		this.resumeOcc.setCompanyName(companyName);
	}

	public String getCompanyType()
	{
		return this.resumeOcc.getCompanyType();
	}

	public void setCompanyType(String companyType)
	{
		this.resumeOcc.setCompanyType(companyType);
	}

	public String getPossion()
	{
		return this.resumeOcc.getPossion();
	}

	public void setPossion(String possion)
	{
		this.resumeOcc.setPossion(possion);
	}

	public String getWorkIntroduction()
	{
		return this.resumeOcc.getWorkIntroduction();
	}

	public void setWorkIntroduction(String workIntroduction)
	{
		this.resumeOcc.setWorkIntroduction(workIntroduction);
	}

	@JsonFormat (pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getStartTime()
	{
		return this.resumeOcc.getStartTime();
	}

	public void setStartTime(Date startTime)
	{
		this.resumeOcc.setStartTime(startTime);
	}

	@JsonFormat (pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getEndTime()
	{
		return this.resumeOcc.getEndTime();
	}

	public void setEndTime(Date endTime)
	{
		this.resumeOcc.setEndTime(endTime);
	}
}
