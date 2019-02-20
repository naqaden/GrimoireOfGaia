package gaia.renderer.entity;

import gaia.GaiaReference;
import gaia.model.ModelGaiaHunter;
import gaia.renderer.entity.layers.LayerGaiaHeldItem;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderGaiaHunter extends RenderLiving<EntityLiving> {
	private static final ResourceLocation texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/entity/hunter.png");

	public RenderGaiaHunter(RenderManager renderManager, float shadowSize) {
		super(renderManager, new ModelGaiaHunter(), shadowSize);
		addLayer(LayerGaiaHeldItem.right(this, getModel().getRightArm()));
		addLayer(LayerGaiaHeldItem.left(this, getModel().getLeftArm()));
	}

	private ModelGaiaHunter getModel() {
		return (ModelGaiaHunter) getMainModel();
	}

//	@Override
//	public void transformHeldFull3DItemLayer() {
//		GlStateManager.translatef(0.0F, 0.1875F, 0.0F);
//	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return texture;
	}
}
