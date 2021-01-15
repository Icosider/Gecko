package software.bernie.geckolib.example.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.example.client.renderer.model.AngelModel;

public class AngelRenderer extends RenderLiving {
    public AngelRenderer() {
        super(new AngelModel(), 0.6F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return new ResourceLocation("geckolib" + ":textures/model/entity/angel.png");
    }
}
