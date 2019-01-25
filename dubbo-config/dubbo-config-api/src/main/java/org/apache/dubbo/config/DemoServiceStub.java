package org.apache.dubbo.config;

/**
 * 描述
 *
 * @author tiandaguang
 * @date 2019/1/24 / 18:10
 * @since 1.0.0
 */
public class DemoServiceStub implements DemoService {


    private DemoService demoService;

    public DemoServiceStub(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public String sayName(String name) {
        return demoService.sayName(name);
    }
}
