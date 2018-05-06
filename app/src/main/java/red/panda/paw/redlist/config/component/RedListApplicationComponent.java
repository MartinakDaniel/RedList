package red.panda.paw.redlist.config.component;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import dagger.Component;
import red.panda.paw.redlist.RedListApplication;
import red.panda.paw.redlist.config.modules.RedListApplicationModule;
import red.panda.paw.redlist.config.modules.RedListServiceControllerModule;

/**
 * Component class for the {@link RedListApplication}.
 */
@Component(
        modules = {
                RedListApplicationModule.class,
                RedListServiceControllerModule.class,
        }
)
public interface RedListApplicationComponent {
        void inject(@NonNull Fragment fragment);
}
