package com.example.examplemod.mixin.nbt;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(NBTTagList.class)
public interface NBTTagListMixin {

    @Accessor("tagList")
    List<NBTBase> getList();

}
