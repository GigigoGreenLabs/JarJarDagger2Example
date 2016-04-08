package ox.com.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(injects = MainActivity.class)
public class MyModule {

    @Provides @Singleton HelloWorldObject provideString(){
        return new HelloWorldObject("Hello Dagger 1");
    }
}
