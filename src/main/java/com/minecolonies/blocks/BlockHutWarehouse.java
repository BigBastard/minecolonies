package com.minecolonies.blocks;

import com.minecolonies.MineColonies;
import com.minecolonies.lib.EnumGUI;
import com.minecolonies.tileentities.TileEntityHutWarehouse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockHutWarehouse extends BlockHut
{
    protected BlockHutWarehouse()
    {
        super();
    }

    @Override
    public String getName()
    {
        return "blockHutWarehouse";
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2)
    {
        return new TileEntityHutWarehouse();
    }
}