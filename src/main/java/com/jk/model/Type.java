package com.jk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Type implements Serializable {
    private static final long serialVersionUID = 4488847997863915885L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.id
     *
     * @mbggenerated Mon Aug 06 19:19:19 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.text
     *
     * @mbggenerated Mon Aug 06 19:19:19 CST 2018
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.pid
     *
     * @mbggenerated Mon Aug 06 19:19:19 CST 2018
     */
    private String pid;
    private List<Type> children =new ArrayList<Type>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Type type = (Type) o;

        return id.equals(type.id);
    }

    public List<Type> getChildren() {
        return children;
    }

    public void setChildren(List<Type> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", pid='" + pid + '\'' +
                ", children=" + children +
                '}';
    }
}