package com.ddedu.entity;

/**
 * @author lenovo on 2020/9/1 21:14
 */
public class Week {
    private int id;
    private String title;
    private String content;
    private int status;
    private String createTime;
    private String u_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }

    @Override
    public String toString() {
        return "Week{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", u_no='" + u_no + '\'' +
                '}';
    }
}
