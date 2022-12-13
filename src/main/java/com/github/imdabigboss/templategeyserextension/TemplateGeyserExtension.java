package com.github.imdabigboss.templategeyserextension;

import org.geysermc.geyser.api.event.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.item.custom.CustomItemData;
import org.geysermc.geyser.api.item.custom.CustomItemOptions;
import org.geysermc.geyser.api.item.custom.NonVanillaCustomItemData;

public class TemplateGeyserExtension implements Extension {
    @Subscribe
    public void onPreInitialize(GeyserPreInitializeEvent event) {
        this.logger().info("TemplateGeyserExtension is loaded!");
    }

    @Subscribe
    public void onGeyserPreInitializeEvent(GeyserDefineCustomItemsEvent event) {
        NonVanillaCustomItemData data = NonVanillaCustomItemData.builder()
                .name("magic")
                .identifier("magic:magic")
                .javaId(729)
                .displayName("Magic magic")
                .creativeCategory(3)
                .allowOffhand(true)
                .toolType("sword")
                .toolTier("golden")
                .build();

        CustomItemData data2 = CustomItemData.builder()
                .name("magic_stick")
                .customItemOptions(CustomItemOptions.builder().customModelData(502698).build())
                .textureSize(32)
                .build();

        event.registerCustomItem(data);
        event.registerCustomItem("minecraft:stick", data2);
    }
}
