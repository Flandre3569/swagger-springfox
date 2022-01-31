package com.mx.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * ApiModel - 描述一个实体类型。
 * 这个实体类型如果成为任何一个生成api帮助文档方法的返回值类型的时候，
 * 此注解被解析
 */


@ApiModel(value = "自定义实体-MyEntity", description = "MyEntity存储用户数据")
public class MyEntity implements Serializable {
    @ApiModelProperty(value = "主键", name = "主键(id)", required = false, example = "1", hidden = false)
    private String id;
    @ApiModelProperty(value = "用户名", name = "用户名(name)", required = true, example = "张三", hidden = false)
    private String name;
    @ApiModelProperty(value = "密码", name = "密码(password)", required = true, example = "123", hidden = false)
    private String password;

    public MyEntity(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntity myEntity = (MyEntity) o;
        return Objects.equals(id, myEntity.id) && Objects.equals(name, myEntity.name) && Objects.equals(password, myEntity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }
}
