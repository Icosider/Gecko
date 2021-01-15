/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib.listener;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.example.client.renderer.entity.*;
import software.bernie.geckolib.example.entity.AngelEntity;
import software.bernie.geckolib.example.entity.BrownEntity;
import software.bernie.geckolib.example.entity.RobotEntity;
import software.bernie.geckolib.example.entity.StingrayTestEntity;

public class ModEventBus
{
	static int id = 50;

	public static void registerEntities()
	{
		EntityRegistry.registerModEntity(StingrayTestEntity.class, "stingray", 0, GeckoLib.INSTANCE, 160, 2, false);
		EntityRegistry.registerModEntity(BrownEntity.class, "brown", 1, GeckoLib.INSTANCE, 160, 2, false);
		EntityRegistry.registerModEntity(RobotEntity.class, "robot", 2, GeckoLib.INSTANCE, 160, 2, false);
		EntityRegistry.registerModEntity(AngelEntity.class, "angel", 3, GeckoLib.INSTANCE, 160, 2, false);
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(StingrayTestEntity.class, new StingrayRenderer());
		RenderingRegistry.registerEntityRenderingHandler(BrownEntity.class, new BrownRenderer());
		RenderingRegistry.registerEntityRenderingHandler(RobotEntity.class, new RobotRenderer());
		RenderingRegistry.registerEntityRenderingHandler(AngelEntity.class, new AngelRenderer());
	}
}
