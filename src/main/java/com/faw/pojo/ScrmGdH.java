package com.faw.pojo;

import java.util.Date;

public class ScrmGdH {
    private String businessid;

    private String fromstep;

    private String step;

    private String action;

    private Date time;

    private Date bdate;

    private String sorttime;

    private Date biupdatetime;

    private String excuteaction;

    private String excuteuser;

    private String master;

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public String getFromstep() {
        return fromstep;
    }

    public void setFromstep(String fromstep) {
        this.fromstep = fromstep == null ? null : fromstep.trim();
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getSorttime() {
        return sorttime;
    }

    public void setSorttime(String sorttime) {
        this.sorttime = sorttime == null ? null : sorttime.trim();
    }

    public Date getBiupdatetime() {
        return biupdatetime;
    }

    public void setBiupdatetime(Date biupdatetime) {
        this.biupdatetime = biupdatetime;
    }

    public String getExcuteaction() {
        return excuteaction;
    }

    public void setExcuteaction(String excuteaction) {
        this.excuteaction = excuteaction == null ? null : excuteaction.trim();
    }

    public String getExcuteuser() {
        return excuteuser;
    }

    public void setExcuteuser(String excuteuser) {
        this.excuteuser = excuteuser == null ? null : excuteuser.trim();
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }
}