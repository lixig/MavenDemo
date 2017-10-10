package cn.sdn.xxx.web;


public class BaseController {
    /**
     *@Author：lixiang
     *@Description：
     *@Date:11:53 2017/10/10
     *@param [userName, password]
     *@return java.lang.String
     */

    public String login(String userName , String password){

        if(userName!= null && userName.equals("lx")){
            if(password != null){
                if(password.equals("123")){
                    return "登陆成功!!!";
                }else{
                    return "密码错误!!!";
                }

            }else{
                return "密码不能为空!!!";
            }
        }else{
            return "账号不存在!!!";
        }
    }
}
