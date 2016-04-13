package ox.com.daggertest;


import javax.inject.Singleton2;

import dagger.Component;

@Singleton2
@Component(modules = TestModule.class)
public interface TestComponent {

    void inject(Hello hello);

    LoggerApp provideLogger();
}
