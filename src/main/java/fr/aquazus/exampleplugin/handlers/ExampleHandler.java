package fr.aquazus.exampleplugin.handlers;

import fr.aquazus.d1proxy.handlers.PacketDestination;
import fr.aquazus.d1proxy.handlers.PacketHandler;
import fr.aquazus.d1proxy.network.ProxyClient;

public class ExampleHandler implements PacketHandler {

    @Override
    public boolean shouldForward(ProxyClient proxyClient, String packet, PacketDestination destination) {
        if (packet.startsWith("Im0153;")) {
            proxyClient.sendMessage("[ExamplePlugin] Hello World!");
        }
        return true;
    }
}
