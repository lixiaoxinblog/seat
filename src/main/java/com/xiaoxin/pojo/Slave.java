package com.xiaoxin.pojo;

public class Slave {
    private Integer id;
    private Integer masterId;
    private Integer value;
    private Integer enable;
    private Integer exist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getExist() {
        return exist;
    }

    public void setExist(Integer exist) {
        this.exist = exist;
    }

    @Override
    public String toString() {
        return "Slave{" +
                "id=" + id +
                ", masterId=" + masterId +
                ", value=" + value +
                ", enable=" + enable +
                ", exist=" + exist +
                '}';
    }
}
