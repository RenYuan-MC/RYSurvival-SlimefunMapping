package ltd.rymc.mappings;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.item.custom.CustomItemData;
import org.geysermc.geyser.api.item.custom.CustomItemOptions;

public class SlimefunMapping implements Extension {

    @Subscribe
    public void onPreInitialize(GeyserPreInitializeEvent event) {
        this.logger().info("任渊生存-粘液材质映射已加载");
    }

    @Subscribe
    public void onGeyserPreInitializeEvent(GeyserDefineCustomItemsEvent event) {

        CustomItemData background = CustomItemData.builder()
                .name("background")
                .customItemOptions(CustomItemOptions.builder().customModelData(2200002).build())
                .textureSize(16)
                .allowOffhand(true)
                .build();

        event.register("minecraft:gray_stained_glass_pane", background);
    }
}
