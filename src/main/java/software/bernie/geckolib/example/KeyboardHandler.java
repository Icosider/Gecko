/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib.example;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;

public class KeyboardHandler
{
	public static boolean isForwardKeyDown = false;
	public static boolean isBackKeyDown = false;
	public static boolean isQDown = false;

	@SubscribeEvent
	public void onKeyPress(final InputEvent.KeyInputEvent event)
	{
		Minecraft mc = Minecraft.getMinecraft();
		if (mc.thePlayer != null)
		{
			isForwardKeyDown = mc.gameSettings.keyBindForward.isPressed();
			isBackKeyDown = mc.gameSettings.keyBindBack.isPressed();
			isQDown = mc.gameSettings.keyBindDrop.isPressed();
		}
	}
}
