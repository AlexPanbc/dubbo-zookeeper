package pp.dubbo.demo.Impl;

import pp.dubbo.demo.UserService;

/**
 * Created by panbingcan on 2018/1/30.
 */
public class UserServiceImpl implements UserService {
    public String getName(String name) {
        System.out.println("服务器打印 接收值:" + name);
        return "服务器收到" + name;
    }
}
