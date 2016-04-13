package ox.com.daggertest;


import javax.inject.Singleton2;

import dagger.Module2;
import dagger.Provides2;


@Module2
public class TestModule {

    @Singleton2
    @Provides2
    LoggerApp provideLogger() {
        return new LoggerApp();
    }
}
