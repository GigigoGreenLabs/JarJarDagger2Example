package ox.com.daggertest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = TestModule.class)
public interface TestComponent {

    void inject(Hello hello);
    LoggerApp provideLogger();
}
