package ox.com.daggertest;


import javax.inject.Inject2;

public class Hello {

    @Inject2
    LoggerApp loggerApp;

    public void sayHello() {
        TestComponent testComponent = DaggerTestComponent.create();
        testComponent.inject(this);

        loggerApp.sayMessage("Hello Dagger 2");
    }
}
