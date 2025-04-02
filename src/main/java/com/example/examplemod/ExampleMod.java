package com.example.examplemod;

import com.example.examplemod.mixin.nbt.NBTTagListMixin;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {

    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    private static Logger LOGGER;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        NBTTagList tagList = new NBTTagList();
        tagList.appendTag(new NBTTagString("Any data"));
        LOGGER.info("Checking the work of mixins: {}", ((NBTTagListMixin) tagList).getList());
    }

    @EventHandler
    public void preInit(FMLPostInitializationEvent event) {
        LOGGER.info("Mod loaded ^_^ Have a good game!");
    }

}
