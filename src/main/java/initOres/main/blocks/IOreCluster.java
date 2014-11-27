package initOres.main.blocks;

import initOres.main.Ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class IOreCluster extends IOreBlockG {
	private ArrayList<ItemStack> DropOres;

	public IOreCluster() {
		super();
		this.setBlockName(Ref.Blocks.CLUSTER);
		this.setBlockTextureName(Ref.Blocks.CLUSTER);
	}

	public void GetModOres() {
		if (OreDictionary.getOres("OreIron") != null) {
			DropOres.addAll(OreDictionary.getOres("OreIron"));
		}
		if (OreDictionary.getOres("OreGold") != null) {
			DropOres.addAll(OreDictionary.getOres("OreGold"));
		}
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random rand, int p_149650_3_) {
		Collections.shuffle(DropOres);
		return DropOres.get(0).getItem();
	}
}
