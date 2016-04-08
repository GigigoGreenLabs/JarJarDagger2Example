package ox.com.daggertest;

import javax.inject.Inject;

public class Hello {

    @Inject
    LoggerApp loggerApp;

    public void sayHello() {
        TestComponent testComponent = DaggerTestComponent.create();
        testComponent.inject(this);

        loggerApp.sayMessage("Hello Dagger 2");
    }
}
