
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amysaddons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.amysaddons.client.model.Modelsnow_slug;
import net.mcreator.amysaddons.client.model.ModelIceEpaulettes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AmysAddonsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelIceEpaulettes.LAYER_LOCATION, ModelIceEpaulettes::createBodyLayer);
		event.registerLayerDefinition(Modelsnow_slug.LAYER_LOCATION, Modelsnow_slug::createBodyLayer);
	}
}
