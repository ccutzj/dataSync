package com.faw.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection = "N00000020170_business_history")
public class N00000020170BusinessHistory {
	@Id
	private String id;
	@Field("businessId")
	private String businessid;
	@Field("step")
	private String step;
	@Field("action")
	private String action;
	@Field("excuteAction")
	private String excuteaction;
	@Field("excuteUser")
	private String excuteuser;
	private String excutedata;
	@Field("excuteData")
	private N00000000535Business n00000000535Business;
	@Field("time")
	private String time;
	@Field("date")
	private String date;
	@Field("sortTime")
	private String sorttime;
	@Field("master")
	private String master;
	@Field("reportFlag")
	private String reportflag;
	@Field("fromStep")
	private String fromstep;
	@Field("stepProcessTime")
	private String stepprocesstime;
	@Field("processTime")
	private String processtime;
	@Field("ctime")
	private String ctime;
	@Field("ctype")
	private String ctype;
	@Field("excuteFlag")
	private String excuteflag;
	@Field("biUpdateTime")
	private String biupdatetime;
	@Field("isTimeout")
	private String istimeout;
	@Field("exten")
	private String exten;
	@Field("excuteExten")
	private String excuteexten;
	@Field("backInfo_type")
	private String backInfo_type;
	
//	public String getBackInfo_type() {
//		return backInfo_type;
//	}
//	public void setBackInfo_type(String backInfo_type) {
//		this.backInfo_type = backInfo_type;
//	}
//	/**
//	 * @return the id
//	 */
//	public String getId() {
//		return id;
//	}
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(String id) {
//		this.id = id;
//	}
//	/**
//	 * @return the businessid
//	 */
//	public String getBusinessid() {
//		return businessid;
//	}
//	/**
//	 * @param businessid the businessid to set
//	 */
//	public void setBusinessid(String businessid) {
//		this.businessid = businessid;
//	}
//	/**
//	 * @return the step
//	 */
//	public String getStep() {
//		return step;
//	}
//	/**
//	 * @param step the step to set
//	 */
//	public void setStep(String step) {
//		this.step = step;
//	}
//	/**
//	 * @return the action
//	 */
//	public String getAction() {
//		return action;
//	}
//	/**
//	 * @param action the action to set
//	 */
//	public void setAction(String action) {
//		this.action = action;
//	}
//	/**
//	 * @return the excuteaction
//	 */
//	public String getExcuteaction() {
//		return excuteaction;
//	}
//	/**
//	 * @param excuteaction the excuteaction to set
//	 */
//	public void setExcuteaction(String excuteaction) {
//		this.excuteaction = excuteaction;
//	}
//	/**
//	 * @return the excuteuser
//	 */
//	public String getExcuteuser() {
//		return excuteuser;
//	}
//	/**
//	 * @param excuteuser the excuteuser to set
//	 */
//	public void setExcuteuser(String excuteuser) {
//		this.excuteuser = excuteuser;
//	}
//	/**
//	 * @return the excutedata
//	 */
//	public String getExcutedata() {
//		return excutedata;
//	}
//	/**
//	 * @param excutedata the excutedata to set
//	 */
//	public void setExcutedata(String excutedata) {
//		this.excutedata = excutedata;
//	}
//	/**
//	 * @return the n00000000535Business
//	 */
//	public N00000000535Business getN00000000535Business() {
//		return n00000000535Business;
//	}
//	/**
//	 * @param n00000000535Business the n00000000535Business to set
//	 */
//	public void setN00000000535Business(N00000000535Business n00000000535Business) {
//		this.n00000000535Business = n00000000535Business;
//	}
//	/**
//	 * @return the time
//	 */
//	public String getTime() {
//		return time;
//	}
//	/**
//	 * @param time the time to set
//	 */
//	public void setTime(String time) {
//		this.time = time;
//	}
//	/**
//	 * @return the date
//	 */
//	public String getDate() {
//		return date;
//	}
//	/**
//	 * @param date the date to set
//	 */
//	public void setDate(String date) {
//		this.date = date;
//	}
//	/**
//	 * @return the sorttime
//	 */
//	public String getSorttime() {
//		java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
//		nf.setGroupingUsed(false);
//		return nf.format(sorttime);
//	}
//	/**
//	 * @param sorttime the sorttime to set
//	 */
//	public void setSorttime(String sorttime) {
//		this.sorttime = sorttime;
//	}
//	/**
//	 * @return the master
//	 */
//	public String getMaster() {
//		return master;
//	}
//	/**
//	 * @param master the master to set
//	 */
//	public void setMaster(String master) {
//		this.master = master;
//	}
//	/**
//	 * @return the reportflag
//	 */
//	public String getReportflag() {
//		return reportflag;
//	}
//	/**
//	 * @param reportflag the reportflag to set
//	 */
//	public void setReportflag(String reportflag) {
//		this.reportflag = reportflag;
//	}
//	/**
//	 * @return the fromstep
//	 */
//	public String getFromstep() {
//		return fromstep;
//	}
//	/**
//	 * @param fromstep the fromstep to set
//	 */
//	public void setFromstep(String fromstep) {
//		this.fromstep = fromstep;
//	}
//	/**
//	 * @return the stepprocesstime
//	 */
//	public String getStepprocesstime() {
//		return stepprocesstime;
//	}
//	/**
//	 * @param stepprocesstime the stepprocesstime to set
//	 */
//	public void setStepprocesstime(String stepprocesstime) {
//		this.stepprocesstime = stepprocesstime;
//	}
//	/**
//	 * @return the processtime
//	 */
//	public String getProcesstime() {
//		return processtime;
//	}
//	/**
//	 * @param processtime the processtime to set
//	 */
//	public void setProcesstime(String processtime) {
//		this.processtime = processtime;
//	}
//	/**
//	 * @return the ctime
//	 */
//	public String getCtime() {
//		return ctime;
//	}
//	/**
//	 * @param ctime the ctime to set
//	 */
//	public void setCtime(String ctime) {
//		this.ctime = ctime;
//	}
//	/**
//	 * @return the ctype
//	 */
//	public String getCtype() {
//		return ctype;
//	}
//	/**
//	 * @param ctype the ctype to set
//	 */
//	public void setCtype(String ctype) {
//		this.ctype = ctype;
//	}
//	/**
//	 * @return the excuteflag
//	 */
//	public String getExcuteflag() {
//		return excuteflag;
//	}
//	/**
//	 * @param excuteflag the excuteflag to set
//	 */
//	public void setExcuteflag(String excuteflag) {
//		this.excuteflag = excuteflag;
//	}
//	/**
//	 * @return the biupdatetime
//	 */
//	public String getBiupdatetime() {
//		return biupdatetime;
//	}
//	/**
//	 * @param biupdatetime the biupdatetime to set
//	 */
//	public void setBiupdatetime(String biupdatetime) {
//		this.biupdatetime = biupdatetime;
//	}
//	/**
//	 * @return the istimeout
//	 */
//	public String getIstimeout() {
//		return istimeout;
//	}
//	/**
//	 * @param istimeout the istimeout to set
//	 */
//	public void setIstimeout(String istimeout) {
//		this.istimeout = istimeout;
//	}
//	/**
//	 * @return the exten
//	 */
//	public String getExten() {
//		return exten;
//	}
//	/**
//	 * @param exten the exten to set
//	 */
//	public void setExten(String exten) {
//		this.exten = exten;
//	}
//	/**
//	 * @return the excuteexten
//	 */
//	public String getExcuteexten() {
//		return excuteexten;
//	}
//	/**
//	 * @param excuteexten the excuteexten to set
//	 */
//	public void setExcuteexten(String excuteexten) {
//		this.excuteexten = excuteexten;
//	}

	@Override
	public String toString() {
		return "N00000020170BusinessHistory{" +
				"id='" + id + '\'' +
				", businessid='" + businessid + '\'' +
				", step='" + step + '\'' +
				", action='" + action + '\'' +
				", excuteaction='" + excuteaction + '\'' +
				", excuteuser='" + excuteuser + '\'' +
				", time='" + time + '\'' +
				", date='" + date + '\'' +
				", sorttime='" + sorttime + '\'' +
				", master='" + master + '\'' +
				", fromstep='" + fromstep + '\'' +
				", biupdatetime='" + biupdatetime + '\'' +
				'}';
	}
}