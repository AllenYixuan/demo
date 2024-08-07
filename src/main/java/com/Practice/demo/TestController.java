package com.Practice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*在写restful API的时候，要导入@RestController*/
@RestController

/*实现 API操作方法*/
/*restfulAPI: 只能有名词，名词和database table对应*/
/*Get: search; Post: create_new; Put: Update, return 更新后的整个; Delete:删除: */

public class TestController {
    @GetMapping("/hello")
    public List<String> hello()
    {
      return List.of("hello","world");

    }
}
