package com.example.drools.tool;

import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

@Slf4j
public class KieSessionUtils {
    /**
     * 执行规则的工具类
     * @param object 要执行规则的对象
     */
    public static void fireRule(Object object){
        KieServices kieServices=KieServices.Factory.get();
        KieContainer kieContainer=kieServices.getKieClasspathContainer();
        KieSession kieSession=kieContainer.newKieSession("ksession-rules");

        kieSession.insert(object);
        int count=kieSession.fireAllRules();
        kieSession.dispose();

        log.debug("执行了"+count+"条规则");
    }
}
