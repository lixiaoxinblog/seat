package com.xiaoxin.pojo;

import java.util.List;

public class Master {

    private Integer id;
    private Integer row;
    private Integer col;

    private List<Slave> slaveList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public List<Slave> getSlaveList() {
        return slaveList;
    }

    public void setSlaveList(List<Slave> slaveList) {
        this.slaveList = slaveList;
    }

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", row=" + row +
                ", col=" + col +
                '}';
    }
}
