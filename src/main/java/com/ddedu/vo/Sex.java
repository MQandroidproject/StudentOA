package com.ddedu.vo;

/**
 * @author lenovo on 2020/9/4 22:02
 */
public class Sex {
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
