package fr.aquazus.exampleplugin;

import fr.aquazus.d1proxy.Proxy;
import fr.aquazus.d1proxy.plugins.ProxyPlugin;
import fr.aquazus.exampleplugin.commands.ExampleCommand;
import fr.aquazus.exampleplugin.handlers.ExampleHandler;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class ExamplePluginWrapper extends Plugin {

    public ExamplePluginWrapper(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Extension @Slf4j
    public static class ExamplePlugin implements ProxyPlugin {

        @Getter
        private String prettyName = "Example Plugin";
        @Getter
        private String version = "1.0.0";
        private Proxy proxy;

        @Override
        public void main(Proxy proxy) {
            this.proxy = proxy;
            log.info("[ExamplePlugin] Hello World!");
            registerCommands();
            registerHandlers();
        }

        private void registerCommands() {
            proxy.addCommand("example", new ExampleCommand());
        }

        private void registerHandlers() {
            proxy.addHandler("Im", new ExampleHandler());
        }

    }
}
