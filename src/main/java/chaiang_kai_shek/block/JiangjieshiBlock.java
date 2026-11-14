package chaiang_kai_shek.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import chaiang_kai_shek.procedures.JiangjieshiFangKuaiWeiJieShouDaoHongShiXinHaoShiProcedure;
import chaiang_kai_shek.procedures.JiangjieshiFangKuaiJieShouDaoHongShiXinHaoShiProcedure;

public class JiangjieshiBlock extends Block {
	public JiangjieshiBlock() {
		super(BlockBehaviour.Properties.of().strength(10f).requiresCorrectToolForDrops());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			JiangjieshiFangKuaiJieShouDaoHongShiXinHaoShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		} else {
			JiangjieshiFangKuaiWeiJieShouDaoHongShiXinHaoShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}