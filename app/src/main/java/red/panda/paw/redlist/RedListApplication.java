package red.panda.paw.redlist;

import android.app.Application;

import red.panda.paw.redlist.config.component.ComponentRepository;

/**
 * The application class.
 */
public class RedListApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        injectDependencies();
    }

    private void injectDependencies() {
        ComponentRepository.initialize(this);
    }
}
