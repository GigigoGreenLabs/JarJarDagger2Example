package ox.com.daggertest;

import dagger.Component;
import orchextra.javax.inject.Singleton;

@Singleton
@Component(modules = TestModule.class)
public interface TestComponent {

    void inject(Hello hello);

    LoggerApp provideLogger();
}
