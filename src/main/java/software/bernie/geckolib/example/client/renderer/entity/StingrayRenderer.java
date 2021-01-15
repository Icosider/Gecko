/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib.example.client.renderer.entity;


import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.example.client.renderer.model.StingrayModel;
import software.bernie.geckolib.example.entity.StingrayTestEntity;

import javax.annotation.Nullable;

public class StingrayRenderer extends RenderLiving
{
	public StingrayRenderer()
	{
		super(new StingrayModel(), 0.5F);
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(Entity entity)
	{
		return new ResourceLocation("geckolib" +  ":textures/model/entity/stingray.png");
	}
}