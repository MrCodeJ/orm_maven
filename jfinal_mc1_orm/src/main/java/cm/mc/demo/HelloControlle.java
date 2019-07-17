package cm.mc.demo;

import com.jfinal.core.Controller;

public class HelloControlle extends Controller {
    public void index(){
        renderText("hello jfinal world");
    }
}
