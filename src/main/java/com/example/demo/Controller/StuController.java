package com.example.demo.Controller;

import com.example.demo.dao.StuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * 后端打包放服务器运行，在jar包所在的文件夹下打开命令行，执行： java -jar jar包名
 * 前端放服务器：自己搜素nginx的使用
 *
 * 前端页面在resources文件夹下的index.html
 *
 * 这里为了简单省略了service层，一般不能省略 controller ->service ->Dao
 */
@CrossOrigin //解决跨域
@RestController
public class StuController {

    @Resource StuDao stuDao;


    @RequestMapping("/test") //和前端url匹配
    public String test(String name, String stuId){
        System.out.println(name+stuId);
        System.out.println(stuDao.insert(name,stuId));
        return "调用成功";
    }
}
