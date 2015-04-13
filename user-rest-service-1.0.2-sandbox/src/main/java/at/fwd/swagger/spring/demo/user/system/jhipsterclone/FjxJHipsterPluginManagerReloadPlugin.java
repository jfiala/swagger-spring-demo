package at.fwd.swagger.spring.demo.user.system.jhipsterclone;

import io.github.jhipster.loaded.reloader.Reloader;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springsource.loaded.Plugins;
import org.springsource.loaded.ReloadEventProcessorPlugin;

public class FjxJHipsterPluginManagerReloadPlugin implements ReloadEventProcessorPlugin {

	    private final Logger log = LoggerFactory.getLogger(FjxJHipsterPluginManagerReloadPlugin.class);

	    private static FjxJHipsterReloaderThread jHipsterReloaderThread;

	    private String projectPackageName;

	    public FjxJHipsterPluginManagerReloadPlugin(ConfigurableApplicationContext ctx) {
	        projectPackageName = ctx.getEnvironment().getProperty("hotReload.package.project");
	    }

	    @Override
	    public boolean shouldRerunStaticInitializer(String typename, Class<?> aClass, String encodedTimestamp) {
	        return true;
	    }

	    public void reloadEvent(String typename, Class<?> clazz, String encodedTimestamp) {
	    	log.debug("reloadEvent: " + typename + clazz.getName());
	        if (!typename.startsWith(projectPackageName)) {
	            log.trace("This class is not in the application package, nothing to do");
	            return;
	        }
	        if (typename.contains("$$EnhancerBy") || typename.contains("$$FastClassBy")) {
	            log.trace("This is a CGLIB proxy, nothing to do");
	            return;
	        }
	        jHipsterReloaderThread.reloadEvent(typename, clazz);
	        
	        // always also reload swaggerconfig
	        // FIXME hack
	        //jHipsterReloaderThread.reloadEvent("com.mangofactory.swagger.configuration.SpringSwaggerConfig", SpringSwaggerConfig.class);
	        
	    }

	    public static void register(ConfigurableApplicationContext ctx, Collection<Reloader> reloaders, ClassLoader classLoader) {
	        jHipsterReloaderThread = new FjxJHipsterReloaderThread(ctx, reloaders);
	        FjxJHipsterReloaderThread.register(jHipsterReloaderThread);
	        FjxJHipsterFileWatcher.register(classLoader, ctx);
	        Plugins.registerGlobalPlugin(new FjxJHipsterPluginManagerReloadPlugin(ctx));
	    }
	}