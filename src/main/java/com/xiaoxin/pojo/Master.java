package com.xiaoxin.pojo;

public class Master {

    private Integer id;
    private Integer row;
    private Integer col;

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

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", row=" + row +
                ", col=" + col +
                '}';
    }
}
