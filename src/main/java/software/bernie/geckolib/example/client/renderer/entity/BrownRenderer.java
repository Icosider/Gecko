/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib.example.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.example.client.renderer.model.BrownModel;

public class BrownRenderer extends RenderLiving
{
	public BrownRenderer()
	{
		super(new BrownModel(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("geckolib" + ":textures/model/entity/brown.png");
	}
}