package com.hiring.bean.obj;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hiring.bean.Resume;
import com.hiring.bean.ResumeEdu;
import com.hiring.bean.ResumeOcc;
import com.hiring.bean.ResumePro;
import com.hiring.constants.Gender;
import com.hiring.constants.ResumeStatus;

/**
 * 简历信息
 * 
 * @author Administrator
 *
 */
public class ResumeObj
	{

	private Resume resume = new Resume();

	private RecruitObj recruit;

	public ResumeObj()
		{

		}

	public ResumeObj(Resume resume)
		{
		this.resume = resume;
		}

	@JsonIgnore
	public Resume getResume()
		{
		return resume;
		}

	public void setResume(Resume resume)
		{
		this.resume = resume;
		}

	public Long getId()
		{
		return this.resume.getId();
		}

	public void setId(Long id)
		{
		this.resume.setId(id);
		}

	public UserObj getUser()
		{
		return new UserObj(this.resume.getUser());
		}

	public void setUser(UserObj user)
		{
		this.resume.setUser(user.getUser());
		}

	public String getName()
		{
		return this.resume.getName();
		}

	public void setName(String name)
		{
		this.resume.setName(name);
		}

	public String getTel()
		{
		return this.resume.getTel();
		}

	public void setTel(String tel)
		{
		this.resume.setTel(tel);
		}

	public String getEmail()
		{
		return this.resume.getEmail();
		}

	public void setEmail(String email)
		{
		this.resume.setEmail(email);
		}

	public String getResidence()
		{
		return this.resume.getResidence();
		}

	public void setResidence(String residence)
		{
		this.resume.setResidence(residence);
		}

	public String getDomicile()
		{
		return this.resume.getDomicile();
		}

	public void setDomicile(String domicile)
		{
		this.resume.setDomicile(domicile);
		}

	public String getIdentification()
		{
		return this.resume.getIdentification();
		}

	public void setIdentification(String identification)
		{
		this.resume.setIdentification(identification);
		}

	public String getIdentificationType()
		{
		return this.resume.getIdentificationType();
		}

	public void setIdentificationType(String identificationType)
		{
		this.resume.setIdentificationType(identificationType);
		}

	public String getJobIntension()
		{
		return this.resume.getJobIntension();
		}

	public void setJobIntension(String jobIntension)
		{
		this.resume.setJobIntension(jobIntension);
		}

	public String getExpectSalary()
		{
		return this.resume.getExpectSalary();
		}

	public void setExpectSalary(String expectSalary)
		{
		this.resume.setExpectSalary(expectSalary);
		}

	public String getGender()
		{
		return this.resume.getGender().toString();
		}

	public void setGender(String gender)
		{
		this.resume.setGender(Gender.valueOf(gender));
		}

	public int getAge()
		{
		return this.resume.getAge();
		}

	public void setAge(String age)
		{
		this.resume.setAge(Integer.parseInt(age));
		}

	public String getGraduateSchool()
		{
		return this.resume.getGraduateSchool();
		}

	public void setGraduateSchool(String graduateSchool)
		{
		this.resume.setGraduateSchool(graduateSchool);
		}

	public String getEducation()
		{
		return this.resume.getEducation();
		}

	public void setEducation(String education)
		{
		this.resume.setEducation(education);
		}

	public String getSelfIntroduction()
		{
		return this.resume.getSelfIntroduction();
		}

	public void setSelfIntroduction(String selfIntroduction)
		{
		this.resume.setSelfIntroduction(selfIntroduction);
		}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getInsertTime()
		{
		return this.resume.getInsertTime();
		}

	public void setInsertTime(Date insertTime)
		{
		this.resume.setInsertTime(insertTime);
		}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getUpdateTime()
		{
		return this.resume.getUpdateTime();
		}

	public void setUpdateTime(Date updateTime)
		{
		this.resume.setUpdateTime(updateTime);
		}

	public ResumeEduObj[] getResumeEdus()
		{
		ResumeEduObj[] edus = new ResumeEduObj[10];
		if (this.resume.getResumeEdus() != null
				&& this.resume.getResumeEdus().size() > 0)
			{
			int i = 0;
			for (ResumeEdu edu : this.resume.getResumeEdus())
				{
				edus[i] = new ResumeEduObj(edu);
				i++;
				}
			}
		return edus;
		}

	public void setResumeEdus(String resumeEdus)
		{
		List<ResumeEduObj> edus = JSON.parseArray(resumeEdus,
				ResumeEduObj.class);
		Set<ResumeEdu> eduSet = new HashSet<ResumeEdu>();
		for (ResumeEduObj edu : edus)
			{
			ResumeEdu eduBean = edu.getResumeEdu();
			eduBean.setResume(resume);
			eduSet.add(eduBean);
			}
		this.resume.setResumeEdus(eduSet);
		}

	public ResumeOccObj[] getResumeOccs()
		{
		ResumeOccObj[] occs = new ResumeOccObj[10];
		if (this.resume.getResumeOccs() != null
				&& this.resume.getResumeOccs().size() > 0)
			{
			int i = 0;
			for (ResumeOcc occ : this.resume.getResumeOccs())
				{
				occs[i] = new ResumeOccObj(occ);
				i++;
				}
			}
		return occs;
		}

	public void setResumeOccs(String resumeOccs)
		{
		List<ResumeOccObj> occs = JSON.parseArray(resumeOccs,
				ResumeOccObj.class);
		Set<ResumeOcc> occSet = new HashSet<ResumeOcc>();
		for (ResumeOccObj occ : occs)
			{
			ResumeOcc occBean = occ.getResumeOcc();
			occBean.setResume(resume);
			occSet.add(occBean);
			}
		this.resume.setResumeOccs(occSet);
		}

	public ResumeProObj[] getResumePros()
		{
		ResumeProObj[] pros = new ResumeProObj[10];
		if (this.resume.getResumePros() != null
				&& this.resume.getResumePros().size() > 0)
			{
			int i = 0;
			for (ResumePro pro : this.resume.getResumePros())
				{
				pros[i] = new ResumeProObj(pro);
				i++;
				}
			}
		return pros;
		}

	public void setResumePros(String resumePros)
		{
		List<ResumeProObj> pros = JSON.parseArray(resumePros,
				ResumeProObj.class);
		Set<ResumePro> proSet = new HashSet<ResumePro>();
		for (ResumeProObj pro : pros)
			{
			ResumePro proBean = pro.getResumePro();
			proBean.setResume(resume);
			proSet.add(proBean);
			}
		this.resume.setResumePros(proSet);
		}

	public RecruitObj getRecruit()
		{
		return recruit;
		}

	public void setRecruit(RecruitObj recruit)
		{
		this.recruit = recruit;
		}

	public String getStatus()
		{
		return this.resume.getStatus().toString();
		}

	public void setStatus(String status)
		{
		this.resume.setStatus(status != null ? ResumeStatus.valueOf(status)
				: ResumeStatus.FAIL);
		}

	public String getRecruitId()
		{
		return this.resume.getRecruitId().toString();
		}

	public void setRecruitId(String recruitId)
		{
		this.resume.setRecruitId(Long.parseLong(recruitId));
		}
	}
