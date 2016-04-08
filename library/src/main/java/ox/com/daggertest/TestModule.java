package ox.com.daggertest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {

    @Singleton
    @Provides
    LoggerApp provideLogger() {
        return new LoggerApp();
    }
}
