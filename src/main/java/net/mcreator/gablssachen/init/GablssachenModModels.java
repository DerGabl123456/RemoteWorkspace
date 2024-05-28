
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gablssachen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.gablssachen.client.model.Modelnoob_face;
import net.mcreator.gablssachen.client.model.Modelnoob_body;
import net.mcreator.gablssachen.client.model.Modelnoob_Legs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GablssachenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelnoob_Legs.LAYER_LOCATION, Modelnoob_Legs::createBodyLayer);
		event.registerLayerDefinition(Modelnoob_face.LAYER_LOCATION, Modelnoob_face::createBodyLayer);
		event.registerLayerDefinition(Modelnoob_body.LAYER_LOCATION, Modelnoob_body::createBodyLayer);
	}
}
