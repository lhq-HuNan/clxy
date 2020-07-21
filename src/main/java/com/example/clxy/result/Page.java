package com.example.clxy.result;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Page {
    /* 通用属性 */
    //private String id;    //通用id
    private int page;
    private int cnt;    // 条目数
    private int rn;     // 条目数编号

    /*public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/

    //忽略序列化
    @JsonIgnore
    public int getPage() {
        return page;
    }

    @JsonIgnore
    public int getCnt() {
        return cnt;
    }

    @JsonIgnore
    public int getRn() {
        return rn;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }
}
