package zmaster587.libVulpes.inventory;

import java.util.List;

import zmaster587.libVulpes.inventory.modules.IModularInventory;
import zmaster587.libVulpes.inventory.modules.ModuleBase;
import net.minecraft.entity.player.EntityPlayer;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
public class GuiModularFullScreen extends GuiModular {

	public GuiModularFullScreen(EntityPlayer playerInv,
			List<ModuleBase> modules, IModularInventory modularInv,
			boolean includePlayerInv, boolean includeHotBar, String name) {
		super(playerInv, modules, modularInv, includePlayerInv,includeHotBar, name);
	}

	@Override
	public void initGui() {
		this.xSize = this.width;
		this.ySize = this.height;
		super.initGui();
	}
}
