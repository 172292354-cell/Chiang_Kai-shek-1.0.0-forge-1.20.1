package chaiang_kai_shek.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import chaiang_kai_shek.entity.ChiangKaishekEntity;

import chaiang_kai_shek.client.model.ModelCustomModel;

public class ChiangKaishekRenderer extends MobRenderer<ChiangKaishekEntity, ModelCustomModel<ChiangKaishekEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("chiang_kai_shek:textures/entities/feng_chao_kong_dong_hui_se_yan_shi_bai_jian_.png");

	public ChiangKaishekRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel<ChiangKaishekEntity>(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChiangKaishekEntity entity) {
		return entityTexture;
	}
}