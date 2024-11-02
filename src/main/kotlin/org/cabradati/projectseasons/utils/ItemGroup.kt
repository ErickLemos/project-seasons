package org.cabradati.projectseasons.utils

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.registry.RegistryKey

fun addItemToGroup(group: RegistryKey<ItemGroup>, item: Item) {
    ItemGroupEvents.modifyEntriesEvent(group)
        .register(ModifyEntries { it.add(item) })
}