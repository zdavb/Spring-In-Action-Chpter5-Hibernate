package com.dacas.data;

import java.util.Date;

public class Bound {
    private Integer id;
    private Integer personId;
    private Integer deviceId;
    private Date boundTime;
    private Integer status;//1有效、0无效

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPersonId() {
        return personId;
    }
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
    public Integer getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
    public Date getBoundTime() {
        return boundTime;
    }
    public void setBoundTime(Date boundTime) {
        this.boundTime = boundTime;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return  "id:"+id+",personId:"+personId+",deviceId:"+deviceId+",boundTime:"+boundTime+",status:"+status;
    }
}
