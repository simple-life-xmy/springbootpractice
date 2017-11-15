package com.xmy.springbootpractice.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author xmy
 */
@Data
public class User {

    private Long id;

    @NotEmpty(message="姓名不能为空")
    private String name;
    @Max(value = 100, message = "年龄不能大于 100 岁")
    @Min(value= 18 ,message= "必须年满 18 岁！" )
    private int age;
    @NotEmpty(message="密码不能为空")
    @Length(min=6,message="密码长度不能小于 6 位")
    private String pass;
    @NotEmpty(message="性别不能为空")
    private Integer sex;

}
