
package net.mcreator.amysaddons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.amysaddons.entity.SnowSlugEntity;
import net.mcreator.amysaddons.client.model.Modelsnow_slug;

public class SnowSlugRenderer extends MobRenderer<SnowSlugEntity, Modelsnow_slug<SnowSlugEntity>> {
	public SnowSlugRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnow_slug(context.bakeLayer(Modelsnow_slug.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowSlugEntity entity) {
		return new ResourceLocation("amys_addons:textures/entities/snowslug.png");
	}
}
