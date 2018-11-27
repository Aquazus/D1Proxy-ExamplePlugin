package fr.aquazus.exampleplugin.commands;

import fr.aquazus.d1proxy.commands.Command;
import fr.aquazus.d1proxy.network.ProxyClient;
import lombok.Getter;

public class ExampleCommand implements Command {

    @Getter
    private String description = "Commande du plugin d'exemple";

    @Override
    public void execute(ProxyClient proxyClient, String args) {
        proxyClient.sendMessage("Hello World!");
    }
}
