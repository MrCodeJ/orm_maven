package cm.mc.demo;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

    public static void main(String[] args) {
        JFinal.start("jfinal_mc1_orm/src/main/webapp", 82, "/", 5);
        //UndertowServer.start(DemoConfig.class,82,true);
    }
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloControlle.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
