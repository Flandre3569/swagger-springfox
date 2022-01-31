package com.mx.controller;

import com.mx.annotation.Annotation4Swagger;
import com.mx.entity.MyEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Api - 描述当前类型生成帮助文档的信息
 * 属性 -
 *  - tags：给当前类型定义别名，可以有多个，如果定义多个别名，在ui中显示多个控制器访问菜单
 *  - description：给当前类型生成的帮助文档定义描述信息
 */
@RestController
@RequestMapping("/swagger")
@Api(tags = {"SwaggerDemoController"})
public class MyController {
    @RequestMapping("/testMyEntity")
    public MyEntity myEntity() {
        return new MyEntity();
    }

    @GetMapping("/test")
    @ApiImplicitParam(name = "m", value = "m参数描述", required = false, paramType = "字符串类型", dataType = "名值对")
    public String test(String a, String b) {
        return "test";
    }

    @PostMapping("/post")
    @ApiOperation(value = "POST方法，执行数据新增操作", notes = "swagger学习-处理POST请求的方法")
    public String post(@ApiParam(name = "用户名(a)", value = "新增用户的用户名", required = true) String a,@ApiParam(name = "密码(b)", value = "新增用户的密码", required = true) String b) {
        return "post";
    }

//    ApiIgnore - 忽略当前注解描述的方法或类型，不生成api帮助文档
    @ApiIgnore
    @GetMapping("/get")
    public String get(String a, String b) {
        return "get";
    }

    @Annotation4Swagger
    @RequestMapping("/req")
    public String req(String m) {
        return "req";
    }

}
